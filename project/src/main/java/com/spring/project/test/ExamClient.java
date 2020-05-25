package com.spring.project.test;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ExamClient {

	public static void main(String[] args) {
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("applicationContext.xml");
		ExamService examService = (ExamService) context.getBean("examService");
		ExamVO vo = new ExamVO();
		vo.setName("abc");
		ExamDAO examDAO = new ExamDAO();
		ExamVO exam = examService.getExam(vo);
		System.out.println(exam.toString());
		context.close();
	}

}
