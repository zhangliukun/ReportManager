package com.zzsys.threet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Weekly implements Serializable {
    //唯一标志id
    @Id
    @GeneratedValue
    private long id;

    //周报所属学生
    @Column(nullable = false)
    private String name;

    //周报所属学生id
    @Column(nullable = false)
    private String studentId;

    //周报内容
    @Column(nullable = false)
    private String weeklyContent;

    //学习时长
    @Column(nullable = false)
    private Float studyTime;

    //周报提交日期
    @Column(nullable = false)
    private Date commitDate;

    //是否已被评价
    @Column(nullable = false)
    private Boolean hasbeenValued = false;

    //周报评价内容
    @Column(nullable = true)
    private String  valuedContent;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getWeeklyContent() {
        return weeklyContent;
    }

    public void setWeeklyContent(String weeklyContent) {
        this.weeklyContent = weeklyContent;
    }

    public Float getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(Float studyTime) {
        this.studyTime = studyTime;
    }

    public Date getCommitDate() {
        return commitDate;
    }

    public void setCommitDate(Date commitDate) {
        this.commitDate = commitDate;
    }

    public Boolean getHasbeenValued() {
        return hasbeenValued;
    }

    public void setHasbeenValued(Boolean hasbeenValued) {
        this.hasbeenValued = hasbeenValued;
    }

    public String getValuedContent() {
        return valuedContent;
    }

    public void setValuedContent(String valuedContent) {
        this.valuedContent = valuedContent;
    }



     public Weekly(){}



}
