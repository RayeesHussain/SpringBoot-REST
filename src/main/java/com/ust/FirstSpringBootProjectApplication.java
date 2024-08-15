package com.ust;

import java.util.List;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ust.bean.Employee1;
import com.ust.bean.HelloWorld;
import com.ust.service.Employee1Service;

@SpringBootApplication
public class FirstSpringBootProjectApplication {

	public static void main(String[] args) {
	//	ApplicationContext ctx=
		//SpringApplication.run(FirstSpringBootProjectApplication.class, args);
//		ctx.getBean(HelloWorld.class);
//		HelloWorld h=new HelloWorld();
//		System.out.println(h.sayHello("abc"));
//		Employee e=ctx.getBean(Employee.class);
//		//e.setAddress(new Address());
//		e.printEmployee();
		//initialize ioc container
		ApplicationContext ctx=SpringApplication.run(FirstSpringBootProjectApplication.class, args);
	//	Employee1Service es=ctx.getBean(Employee1Service.class);
//		es.saveEmployee(new Employee1("ray","rayees@gmail.com"));
//		es.saveEmployee(new Employee1("ray2","rayees2@gmail.com"));
//		es.saveEmployee(new Employee1("ray3","rayees3@gmail.com"));
//		es.saveEmployee(new Employee1("ray4","rayees4@gmail.com"));
//		List<Employee1> emp=es.getAllEmployee();
//		for(Employee1 e:emp) {
//			//System.out.println(e.getName()+"\t"+e.getEmail()+"\t" +e.getEmpid());
//			System.out.println(e.toString());
//		}
//		Employee1 e1=es.getEmployee(102);
//		if(e1!=null) {
//		System.out.println(e1.getName());
//		System.out.println(e1.toString());
//		}
//		else {
//			System.out.println("null object");
//		}
//		List<Employee1> li=es.getEmployeeByName("manu");
//		for(Employee1 e:li) {
//			System.out.println(e.getName()+"\t"+e.getEmail()+"\t" +e.getEmpid());
//			System.out.println(e.toString());
//		}
//		System.out.println(es.deleteEmployee(52));
		//System.out.println(es.updateEmployeeWmail(112, "rayees121@gmail.com"));
		

		
	}

}
