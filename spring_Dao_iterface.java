package spring_example_dao;

import java.util.List;

import springModel.user;

public interface spring_Dao_iterface {
	
	public List<user>listall();
	public void add(user user);
	public void update(user user);
	public void deleate (int id);
	public user fillbyid(int id);
	

}
