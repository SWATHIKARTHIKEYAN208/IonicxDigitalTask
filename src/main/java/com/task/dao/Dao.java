package com.task.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.task.entity.Department;
import com.task.repository.DepartmentRepository;
@Repository
public class Dao {
	@Autowired
	DepartmentRepository dr;

	

	public String postDepartment(Department d) {
		dr.save(d);
		return "Department and Employee details saved";
	}



	public List<Department> getDepartments() {
		 return dr.findAll();
	}



	public String updateDepartment(Department d) {
		dr.save(d);
		return "One Record Updated";
	}



	public String deleteById(int id) {
		dr.deleteById(id);
		return "One Record Deleted";
	}

}
