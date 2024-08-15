package com.ust;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ust.bean.Employee1;
import com.ust.repo.Employee1Repository;
import com.ust.service.Employee1Service;

@SpringBootTest
public class EmployeeServiceTest {
	
	@Autowired
	private Employee1Service service;
	
	
	@Test
	void getEmployeeTestWithValidId() {
		assertNotNull(service.getEmployee(102));
		assertEquals("ray",service.getEmployee(102).getName());
	}
	@Test
	void getEmployeeTestWithInvalidId() {
		assertNull(service.getEmployee(122));
		//assertEquals("ray",service.getEmployee(102).getName());
	}
	@Test
	void creteEmployeeTest() {
		Employee1 e1=new Employee1("ray7","ray7@gmail.com");
		service.saveEmployee(e1);
		assertNotNull(service.getEmployeeByName("ray7"));
		
	}
	@Mock
	private Employee1Repository repo;
	@InjectMocks
	private Employee1Service service1;
	@Test
	void getEmployeeByIdUsingMock() {
		Employee1 employee=new Employee1();
		int eid=102;
		Employee1 emp2=new Employee1();
		when(repo.findById(eid)).thenReturn(Optional.of(emp2));
		Employee1 result=service1.getEmployee(eid);
		assertNotNull(result);
		
		
		
		
		
	}

}
