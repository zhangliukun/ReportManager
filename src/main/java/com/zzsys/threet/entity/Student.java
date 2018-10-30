package com.zzsys.threet.entity;



import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

public class Student implements Serializable {

    //学号
    @Id
    @GeneratedValue
    private Long id;

    //姓名
    @Column(nullable = false)
    private String name;

    //性别
    @Column(nullable = false)
    private char  sex;

    //年龄
    @Column(nullable = false)
    private int age;

    //密码
    @Column(nullable = false)
    private String password;

    //备注
    @Column(nullable = false)
    private String remarks;

    //系别
    @Column(nullable = false)
    private String department;

    //周报
    @Column(nullable = true)
    private Weekly weekly;

    public Weekly getWeekly() {
        return weekly;
    }

    public void setWeekly(Weekly weekly) {
        this.weekly = weekly;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Student(){}
}
