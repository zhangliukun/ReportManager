package com.zzsys.threet.controller;

import com.zzsys.threet.entity.Weekly;
import com.zzsys.threet.httpcode.HttpRep;
import com.zzsys.threet.service.WeeklyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by zale on 2018/11/1.
 **/

@RestController
@RequestMapping(value = "/weekly")
public class WeeklyController {

    @Autowired
    WeeklyService weeklyService;

    @RequestMapping(value="/commit", method= RequestMethod.POST)
    public HttpRep submitWeekly(@ModelAttribute Weekly weekly) {
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        Weekly data = weeklyService.commitWeekly(weekly);
        HttpRep reponse = new HttpRep();
        if (data !=null){
            reponse.setWeekly(data);
        }else {
            reponse.setStatus(1);
        }
        return reponse;
    }

    @RequestMapping(value="/find/{id}", method= RequestMethod.GET)
    public HttpRep findWeeklyById(@PathVariable long id) {
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        Weekly data = weeklyService.findWeeklyById(id);
        HttpRep reponse = new HttpRep();
        if (data !=null){
            reponse.setWeekly(data);
        }else {
            reponse.setStatus(1);
        }
        return reponse;
    }

    @RequestMapping(value="/findAllByStuId/{studentId}", method= RequestMethod.GET)
    public HttpRep findAllByStuId(@PathVariable long studentId) {
        // 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
        Weekly data = weeklyService.findWeeklyById(studentId);
        HttpRep reponse = new HttpRep();
        if (data !=null){
            reponse.setWeekly(data);
        }else {
            reponse.setStatus(1);
        }
        return reponse;
    }

}
