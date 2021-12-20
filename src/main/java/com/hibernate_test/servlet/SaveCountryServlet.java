package com.hibernate_test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hibernate_test.entities.Capital;
import com.hibernate_test.entities.Country;
import com.hibernate_test.entities.Language;
import com.hibernate_test.entities.Sport;
import com.hibernate_test.helper.FactoryProvider;



public class SaveCountryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	public SaveCountryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	 }

	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
   try {
	   Session s = FactoryProvider.getFactory().openSession();
	   Transaction tx = s.beginTransaction();
	
	    String countryname=request.getParameter("country_name");
	    String language=request.getParameter("language");
	    String capital = request.getParameter("capital");
	    String sport = request.getParameter("sport");

	    System.out.println("countryname"+countryname);
	    System.out.println("language"+language);
	    System.out.println("capital"+capital);
	    
//        Country country = s.load(Country.class, 1L);
//        System.out.println("country"+country);
//	    
	   Capital cp =  new Capital();
	   cp.setName(capital);
	   
	   s.save(cp);
//	    
	   Language lg = new Language();
	   lg.setLanguage(language);
	   s.save(lg);
	   
	   Sport sp = new Sport();
	   sp.setSportname(sport);
	   s.save(sp);

	   
	   
	     
	    ArrayList<Sport> list1=new ArrayList<Sport>();    
	    list1.add(sp);    
	   
	   
//	    
	   Country co = new Country(countryname,cp,lg,list1);
       s.save(co);
	   tx.commit();
	   
//	   Country country = s.load(Country.class, 1L);
//       System.out.println(country);
       s.close();
	   response.setContentType("text/html");
	   PrintWriter out = response.getWriter();
	   out.println("<h1>Country added Successfully</h1>");
	   
//	   
       }catch(Exception e) {
	
	   e.printStackTrace();
       }
    
     }

 }
