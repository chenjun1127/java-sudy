package com.spring.base.entities;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: TODO
 * @Author: chenjun
 * @Date: 2020年7月22日 上午10:36:38
 */
public class StudentInfo {
	@Autowired
	private Student student;

	public StudentInfo() {
		System.out.println("学生相关信息------");
	}

	public void printName() {
		System.out.println("name:" + student.getName());
	}

	public void printCar() {
		System.out.println("car:" + student.getCar());
	}
}
