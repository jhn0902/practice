package com.spring.project.test;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class ExamRowMapper implements RowMapper<ExamVO> {

	@Override
	public ExamVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ExamVO vo = new ExamVO();
		vo.setName(rs.getString("name"));
		vo.setAge(rs.getInt("age"));
		return vo;
	}

}
