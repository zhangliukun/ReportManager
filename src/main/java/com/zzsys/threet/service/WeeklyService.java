package com.zzsys.threet.service;

import com.zzsys.threet.repository.WeeklyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zale on 2018/10/29.
 **/

@Service
public class WeeklyService {
    @Autowired
    WeeklyRepository weeklyRepository;

    public void commitWeekly(String content){

    }

    public void deleteWeeklyById(long id){

    }

    public void shareWeeklyById(long id,long userId){

    }


}
