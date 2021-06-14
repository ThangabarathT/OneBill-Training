package com.onebill.spring.spring_annotation_assignment;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.onebill.spring.bean.Student;
import com.onebill.spring.config.StudentConfig;

public class StudentMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
		Student student = context.getBean(Student.class);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Name : ");
		student.setName(sc.nextLine());
		
		System.out.print("Enter Student Age : ");
		student.setAge(sc.nextInt());
		
		System.out.println("Student Name : "+student.getName());
		System.out.println("Student Age : "+student.getAge());
		
		sc.close();
		((AbstractApplicationContext) context).close();

	}

}
