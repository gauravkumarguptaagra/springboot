package spring_example_dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import springModel.user;

final  class userMaper  implements RowMapper<user>{

	@Override
	public user mapRow(ResultSet rs, int num) throws SQLException {
		// TODO Auto-generated method stub
		user user=new user();
		
		user.setId(rs.getInt("id"));
		user.setAddress(rs.getString("address"));
		user.setName(rs.getString("Name"));
		return user;
	}

}
