package com.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Integer> {

}
