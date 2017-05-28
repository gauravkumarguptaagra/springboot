package spring_Exapmple_service;

import java.util.List;

import springModel.user;

public interface userservice {
	public List<user>listall();
	public void add(user user);
	public void update(user user);
	public void deleate (int id);
	public user fillbyid(int id);
	
}
