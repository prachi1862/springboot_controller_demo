package com.prachi9.springboot_mvc_demo.repositories;

import com.prachi9.springboot_mvc_demo.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    //List<EmployeeEntity> findByName(String name);
}
