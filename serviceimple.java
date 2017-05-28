package spring_Exapmple_service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springModel.user;
import spring_example_dao.spring_Dao_iterface;

@Service
public class serviceimple implements userservice {

	spring_Dao_iterface userdao;
	
	@Autowired
	public void setUserdao(spring_Dao_iterface userdao) {
		this.userdao = userdao;
	}

	@Override
	public List<user> listall() {
		
		return userdao.listall();
	}

	@Override
	public void add(user user) {
		userdao.add(user);
		
	}

	@Override
	public void update(user user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleate(int id) {
		userdao.deleate(id);
		
	}

	@Override
	public user fillbyid(int id) {
		// TODO Auto-generated method stub
		return userdao.fillbyid(id);
	}

}
