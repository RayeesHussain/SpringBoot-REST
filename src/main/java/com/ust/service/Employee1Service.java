package com.ust.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ust.bean.Employee1;
import com.ust.repo.Employee1Repository;

@Service
public class Employee1Service {
	@Autowired
	private Employee1Repository repo;
	
	public void saveEmployee(Employee1 emp) {
		repo.saveAndFlush(emp);
		//Employee1 e=repo.saveAndFlush(emp);
		System.out.println("employee saved");
		
		
	}
	
	public List<Employee1> getAllEmployee(){
		return repo.findAll();
	}
	
	public Employee1 getEmployee(int eid) {
		Optional<Employee1> op=repo.findById(eid);
		if(op.isPresent()) {
			return op.get();
		}else {
			return null;
		}
	}
	public List<Employee1> getEmployeeByName(String name){
		return repo.findByName(name);
	}
	public String deleteEmployee(int eid) {
//		Optional<Employee1> op=repo.findById(eid);
//		if(op.isPresent()) {
//			repo.delete(op.get());
//			return "employee deleted";
//		}else {
//			return null;
//		}
		Employee1 e=getEmployee(eid);
		if(e!=null) {
			repo.delete(e);
			return "employee deleted";
		}else {
			return "not deleted";
		}
	}
	public String updateEmployeeWmail(int eid,String newEmail) {
//		Optional<Employee1> op=repo.findById(eid);
//		if(op.isPresent()) {
//			repo.delete(op.get());
//			return "employee deleted";
//		}else {
//			return null;
//		}
		Employee1 e=getEmployee(eid);
		if(e!=null) {
			e.setEmail(newEmail);
			repo.saveAndFlush(e);
			return "employee updated";
		}else {
			return "not updated";
		}
	}
	public String updateEmployee(Employee1 emp) {
//		Optional<Employee1> op=repo.findById(eid);
//		if(op.isPresent()) {
//			repo.delete(op.get());
//			return "employee deleted";
//		}else {
//			return null;
//		}
		Employee1 e=getEmployee(emp.getEmpid());
		if(e!=null) {
			//e.setEmail(newEmail);
			repo.saveAndFlush(emp);
			return "employee updated";
		}else {
			return "not updated";
		}
	}


}
