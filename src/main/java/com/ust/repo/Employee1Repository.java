package com.ust.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ust.bean.Employee1;

public interface Employee1Repository extends JpaRepository<Employee1,Integer>{
	public List<Employee1> findByName(String name);
	
	

}
