<%@page import="com.hibernate_test.entities.Sport"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="com.hibernate_test.entities.Language"%>
<%@page import="com.hibernate_test.entities.Capital"%>
<%@page import="java.util.Iterator"%>
<%@page import="javax.persistence.TypedQuery"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.boot.MetadataSources"%>
<%@page import="org.hibernate.boot.Metadata"%>
<%@page import="org.hibernate.boot.registry.StandardServiceRegistry"%>

<%@page import="org.hibernate.boot.registry.StandardServiceRegistryBuilder"%>   
<%@page import="org.hibernate.Query"%>
<%@page import="com.hibernate_test.helper.FactoryProvider"%>
<%@page import="org.hibernate.Session"%>
<%@page import="com.hibernate_test.entities.Country"%>
<%@page import="java.util.List"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="Container">

<h3>Country Details:-</h3>
<% 
StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
  
SessionFactory factory=meta.getSessionFactoryBuilder().build();  
Session session1=factory.openSession();  
    
TypedQuery query=session1.createQuery("from Country e");    
List<Country> list=query.getResultList();   
    
Iterator<Country> itr=list.iterator();    
while(itr.hasNext()){    
	Country emp=itr.next();    
 System.out.println(emp.getId()+" "+emp.getName()); 
 PrintWriter out1 = response.getWriter();
 out1.println("<h1></h1>");

 Capital cap = emp.getCapital();
 System.out.println("capital"+cap.getName());
 Language lg = emp.getLanguage();
 System.out.println("Language"+lg.getLanguage());
 List<Sport> list2=emp.getSport();  
 Iterator<Sport> itr2=list2.iterator();    
 %>
 </br></br>Country name<input type=text value="<%=emp.getName()%>"/></br>
 Language speak<input type=text value="<%=lg.getLanguage()%>"/></br>
 Capital<input type=text value="<%=cap.getName()%>"/></br>
 <% 
   while(itr2.hasNext())  
   {  
     Sport a=itr2.next();  
           %>
           
 Sport<input type=text value="<%=a.getSportname()%>"/>
 <%}%>
 <% 
 }    

session1.close();    
System.out.println("success");    
    
%>



</div>
</body>
</html>