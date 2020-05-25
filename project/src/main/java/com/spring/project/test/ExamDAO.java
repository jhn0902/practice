package com.spring.project.test;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ExamDAO {
	
	@Autowired
	private SqlSessionTemplate sqlSessionTemplate;
	
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
	
	public ExamVO getExam(ExamVO vo) {
		System.out.println("getExam 호출");
		Object[] args = {vo.getName()}; 
		return sqlSessionTemplate.selectOne("ExamVO.getExam", vo);
//		return jdbcTemplate.queryForObject("select * from exam where name=?", args, new ExamRowMapper());
	}
}
