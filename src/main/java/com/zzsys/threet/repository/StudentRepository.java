package com.zzsys.threet.repository;

import com.zzsys.threet.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    Student findByName(String name);

    Student findByNameAndId(String name, long id);


}
