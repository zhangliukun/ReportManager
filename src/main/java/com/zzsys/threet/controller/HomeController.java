package com.zzsys.threet.controller;

import com.zzsys.threet.repository.AdminRepository;
import com.zzsys.threet.entity.Admin;
import com.zzsys.threet.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/hello")
    public String hello() {
        Admin admin = adminService.findByName("zlk");
        //return "hello"+admin.getName();
        String result="";
        if (admin!=null)
            return admin.getName()+"";
        return "null";
    }


}
