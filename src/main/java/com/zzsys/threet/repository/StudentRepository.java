package com.zzsys.threet.repository;

import com.zzsys.threet.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findByName(String name);

    Student findByNameAndId(String name, int id);


}
