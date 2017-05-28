package spring_example_dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import springModel.user;

@Repository
public class userDaoImpl implements spring_Dao_iterface {
	NamedParameterJdbcTemplate  namedParameterJdbcTemplate;

	

	@Autowired
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) throws DataAccessException {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	@Override
	public List<user> listall() {
		List<user> listall=namedParameterJdbcTemplate.query(sql_query.Sql1, getsqlParameterSource1(null), new userMaper());
		return listall;
	}
	


	@Override
	public void add(user user) {
		namedParameterJdbcTemplate.update(sql_query.sql2, getsqlParameterSource1(user));
		
	}

	@Override
	public void update(user user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleate(int id) {
		namedParameterJdbcTemplate.update(sql_query.sql3, getsqlParameterSource1(new user(id)));
		
	}

	@Override
	public user fillbyid(int id) {
		String sql11= "select * from user where id=:id";
		return namedParameterJdbcTemplate.queryForObject(sql11, getsqlParameterSource1(new user(id)), new userMaper());
	}
	
	private SqlParameterSource getsqlParameterSource1(user user)
	{
		MapSqlParameterSource mapSqlParameterSource=new MapSqlParameterSource();
		if(user!=null)
		{
			mapSqlParameterSource.addValue("id", user.getId());
			mapSqlParameterSource.addValue("Address", user.getAddress());
			mapSqlParameterSource.addValue("name", user.getName());
			
		}
		return mapSqlParameterSource;
			
			
	}
	

}
