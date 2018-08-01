package com.xt.spring.context.transaction.xml;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class StuDaoImpl implements StuCardDao{
	private JdbcTemplate jdbcTemplate;
	public void updateCardMoney(StuCard sc) {
		String sql ="update stu_card set money = ? where card_no = ?";
		jdbcTemplate.update(sql,sc.getMoney(),sc.getCardNo());
	}

	public StuCard getStuCardByCardNo(String cardNo) {
		String sql = "select * from  stu_card where card_no = ?";
		return jdbcTemplate.queryForObject(sql,new Object[]{cardNo}, new BeanPropertyRowMapper<StuCard>(StuCard.class)
				);
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
