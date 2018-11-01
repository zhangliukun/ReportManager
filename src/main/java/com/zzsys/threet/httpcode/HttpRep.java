package com.zzsys.threet.httpcode;

import com.zzsys.threet.entity.Admin;
import com.zzsys.threet.entity.Student;
import com.zzsys.threet.entity.Tutor;
import com.zzsys.threet.entity.Weekly;

/**
 * Created by zale on 2018/11/1.
 **/
public class HttpRep {
    private int status; //0代表成功，1代表失败
    private String response; //返回一些字符串
    private Admin admin;  //定义一些实体
    private Tutor tutor;
    private Student student;
    private Weekly weekly;

    public int getStatus() {
        return status;
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Weekly getWeekly() {
        return weekly;
    }

    public void setWeekly(Weekly weekly) {
        this.weekly = weekly;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
