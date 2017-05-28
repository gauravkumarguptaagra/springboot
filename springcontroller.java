package spring_Exapmple_controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.annotation.ModelFactory;
import org.springframework.web.servlet.ModelAndView;

import springModel.user;
import spring_Exapmple_service.userservice;

@Controller
@RequestMapping(value = "/user")
public class springcontroller {

	@Autowired
	userservice userservice;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list() {
		ModelAndView model = new ModelAndView("user/user_page");
		List<user> listall = userservice.listall();
		model.addObject("list", listall);
		return model;
	}

	@RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
	public ModelAndView update(@PathVariable("id") int id) {
		ModelAndView model = new ModelAndView("user/user_page");
		user user = userservice.fillbyid(id);
		model.addObject("user_page", user);
		return model;
	}

	@RequestMapping(value = "/delate/{id}", method = RequestMethod.GET)
	public ModelAndView delate(@PathVariable("id") int id) {
		
		 userservice.deleate(id);
		
		return new ModelAndView("redirect:/list");
	}

}
