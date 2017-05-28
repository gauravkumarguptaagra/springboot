package com.websystique.springmvc.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
 
 
@Controller
@RequestMapping("/")
public class AppController {
 
    @RequestMapping(value = { "/"}, method = RequestMethod.GET)
    public String homePage(ModelMap model) {
        return "home";
    }
 
    @RequestMapping(value = { "/products"}, method = RequestMethod.GET)
    public String productsPage(ModelMap model) {
        return "products";
    }
 
    @RequestMapping(value = { "/contactus"}, method = RequestMethod.GET)
    public String contactUsPage(ModelMap model) {
        return "contactus";
    }
}


%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>



tile depenation

<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE tiles-definitions PUBLIC  "-//Apache Software Foundation//DTD Tiles Configuration 3.0//EN"  "http://tiles.apache.org/dtds/tiles-config_3_0.dtd">  
 
<tiles-definitions>  
  
   <!-- Base Definition -->
   <definition name="base-definition"
       template="/WEB-INF/views/tiles/layouts/defaultLayout.jsp">  
       <put-attribute name="title" value="" />  
       <put-attribute name="header" value="/WEB-INF/views/tiles/template/defaultHeader.jsp" />  
       <put-attribute name="menu" value="/WEB-INF/views/tiles/template/defaultMenu.jsp" />  
       <put-attribute name="body" value="" />  
       <put-attribute name="footer" value="/WEB-INF/views/tiles/template/defaultFooter.jsp" />  
   </definition>  
  
   <!-- Home Page -->
   <definition name="home" extends="base-definition">  
       <put-attribute name="title" value="Welcome" />  
       <put-attribute name="body" value="/WEB-INF/views/pages/home.jsp" />  
   </definition>  
 
   <!-- Product Page -->
   <definition name="products" extends="base-definition">  
       <put-attribute name="title" value="Products" />  
       <put-attribute name="body" value="/WEB-INF/views/pages/products.jsp" />  
   </definition>  
       
   <!-- Contact-us Page -->
   <definition name="contactus" extends="base-definition">  
       <put-attribute name="title" value="Contact Us" />  
       <put-attribute name="body" value="/WEB-INF/views/pages/contactus.jsp" />  
   </definition>  
  
</tiles-definitions>
