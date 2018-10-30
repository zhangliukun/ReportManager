package com.zzsys.threet.service;

import com.zzsys.threet.entity.Student;
import com.zzsys.threet.repository.AdminRepository;
import com.zzsys.threet.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zale on 2018/10/29.
 **/

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(Student student){

    }

    public void deleteStudentById(Long id){

    }

}
