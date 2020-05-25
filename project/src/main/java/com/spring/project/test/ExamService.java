package com.spring.project.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("examService")
public class ExamService {

	@Autowired
	private ExamDAO examDAO;
	
	public ExamVO getExam(ExamVO vo) {
		return examDAO.getExam(vo);
	}
}
