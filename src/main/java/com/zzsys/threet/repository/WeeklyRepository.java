package com.zzsys.threet.repository;

import com.zzsys.threet.entity.Weekly;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WeeklyRepository extends JpaRepository<Weekly,Long> {
}
