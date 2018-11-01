package com.zzsys.threet.service;

import com.zzsys.threet.entity.Weekly;
import com.zzsys.threet.repository.WeeklyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by zale on 2018/10/29.
 **/

@Service
public class WeeklyService {
    @Autowired
    WeeklyRepository weeklyRepository;

    public Weekly commitWeekly(Weekly weekly){
        weekly.setCommitDate(new Date());
        return weeklyRepository.saveAndFlush(weekly);
    }

    public void deleteWeeklyById(long id){

    }

    public void shareWeeklyById(long id,long userId){

    }

    public Weekly findWeeklyById(long id){
        return weeklyRepository.findWeeklyById(id);
    }


}
