package com.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.task.entity.Department;
import com.task.service.service;



@RestController
public class Controller {
	@Autowired
	service ds;
	
	
	@PostMapping(value="/PostDepartment") 
	public String postDepartment(@RequestBody Department d) {
		return ds.postDepartment(d);
	}
	@GetMapping(value="/GetAllDepartments")
	public List<Department> getDepartments() {
		return ds.getDepartments();
	}
	@PutMapping(value="/update")
	public String updateDepartment(@RequestBody Department d) {
		return ds.updateDepartment(d);
	}
	@DeleteMapping(value="delete/{id}")
	public String deleteById(@PathVariable int id) {
		return ds.deleteById(id);
	}
	

}
