package com.xt.spring.context.transaction.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class StuDaoImpl implements StuCardDao{
	@Autowired
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
