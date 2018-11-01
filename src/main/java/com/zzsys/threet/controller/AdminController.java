package com.zzsys.threet.controller;

import com.zzsys.threet.entity.Admin;
import com.zzsys.threet.httpcode.HttpRep;
import com.zzsys.threet.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping(value = "/admin")
public class AdminController {
    static Map<Long, Admin> adminMap = Collections.synchronizedMap(new HashMap<Long, Admin>());

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){

        return "test success";
    }

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public List<Admin> getAdminList(){
        // 处理"/admin/"的GET请求，用来获取用户列表
        //还可以通过@RequestParam从页面中传递参数来进行查询条件或者翻页信息的传递
        List<Admin> r = new ArrayList<>(adminMap.values());
        return r;
    }

    @RequestMapping(value="/register", method=RequestMethod.POST)
    public HttpRep postUser(@ModelAttribute Admin admin) {
        // 处理"/admin/"的POST请求，用来创建User
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        Admin resp = adminService.saveAdmin(admin);
        HttpRep reponse = new HttpRep();
        reponse.setAdmin(resp);
        return reponse;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Admin getAdmin(@PathVariable long id){
        // url中的id可通过@PathVariable绑定到函数的参数中
        return adminMap.get(id);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public String putAdmin(@PathVariable long id,@ModelAttribute Admin admin){
        //处理put请求，更新Admin信息
        Admin ad = adminMap.get(id);
        ad.setName(admin.getName());
        ad.setAge(admin.getAge());
        adminMap.put(id,ad);
        return "success";
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable long id){
        adminMap.remove(id);
        return "success";
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public HttpRep login(String name, String passwd){
        System.out.println(name+" "+ passwd);
        Admin result = adminService.login(name,passwd);

        HttpRep httpRep = new HttpRep();
        if (result!=null){
            result.setPasswd("");
            httpRep.setAdmin(result);
        }else {
            httpRep.setStatus(1);
        }
        return httpRep;
    }

}
