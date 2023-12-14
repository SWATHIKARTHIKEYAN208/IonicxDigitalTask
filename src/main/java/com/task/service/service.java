package com.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.dao.Dao;
import com.task.entity.Department;

@Service
public class service {
	@Autowired
	Dao dd;

	public String postDepartment(Department d) {
		return dd.postDepartment(d);
	}

	public List<Department> getDepartments() {
		return dd.getDepartments();
	}

	public String updateDepartment(Department d) {
		return dd.updateDepartment(d);
	}

	public String deleteById(int id) {
		return dd.deleteById(id);
	}

}
