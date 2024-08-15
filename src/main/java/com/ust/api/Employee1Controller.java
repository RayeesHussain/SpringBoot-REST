package com.ust.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.bean.Employee1;
import com.ust.service.Employee1Service;

@RestController
@RequestMapping("employees")
public class Employee1Controller {
	@Autowired
	 private Employee1Service service;
	@GetMapping(produces= {"application/json","application/xml"})
	public List<Employee1> getAll(){
		return service.getAllEmployee();
		
	}
	@GetMapping("/{eid}")
	public ResponseEntity <Employee1> getEmployee(@PathVariable int eid) {
		Employee1 e=service.getEmployee(eid);
		if(e!=null) {
			return new ResponseEntity<>(e,HttpStatus.OK);
		}else {
			return new ResponseEntity("Empployee not found",HttpStatus.NOT_FOUND);
		}
	}
	@PostMapping
	public Employee1 createEnployee(@RequestBody Employee1 emp) {
		
		service.saveEmployee(emp);
		return emp;
	}
	@PutMapping
	public String updateEnployee(@RequestBody Employee1 emp) {
		
		
		return service.updateEmployee(emp);
	}
//	@DeleteMapping("/{eid}")
//	public ResponseEntity<Employee1> deleteEnployee(@PathVariable int eid) {
//		
//		Employee1 e=service.getEmployee(eid);
//		service.deleteEmployee(eid);
//		if(e!=null) {
//			return new ResponseEntity<>(e,HttpStatus.OK);
//			
//		}else {
//			return new ResponseEntity("Empployee not found",HttpStatus.NOT_FOUND);
//		}
//	}
//	@DeleteMapping
//	public String deleteEmployee(@RequestBody Employee1 emp) {
//		return service.deleteEmployee(emp.getEmpid());
//	}
	@DeleteMapping("/{eid}")
	public String deleteEmployee(@PathVariable int eid) {
		return service.deleteEmployee(eid);
	}
//	
	

}
