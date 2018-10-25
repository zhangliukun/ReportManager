package com.zzsys.threet.repository;

import com.zzsys.threet.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface AdminRepository extends JpaRepository<Admin,Long> {


    Admin findByName(String name);

    @Query("from Admin a where a.name=:name")
    Admin findUser(@Param("name")String name);




}
