package com.zzsys.threet.service;

import com.zzsys.threet.repository.AdminRepository;
import com.zzsys.threet.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

@Service
public class AdminService{

    @Autowired
    private AdminRepository adminRepository;

    public List<Admin> getAllAdmin(){
        return adminRepository.findAll();
    }

    public void saveAdmin(Admin admin){
        adminRepository.saveAndFlush(admin);
    }

    public void deleteAdminbyId(Long id){
        adminRepository.deleteById(id);
    }

    public Admin findByName(String name){
        Admin ad = adminRepository.findByName(name);
        return ad;
    }

    public boolean login(String name,String passwd){
        return false;
    }

}
