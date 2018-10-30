package com.zzsys.threet.service;


import com.zzsys.threet.entity.Tutor;
import com.zzsys.threet.repository.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zale on 2018/10/29.
 **/

@Service
public class TutorService {


    @Autowired
    private TutorRepository tutorRepository;

    public void addTutor(Tutor tutor){

    }

    public void deleteTutorById(Long id){

    }
}
