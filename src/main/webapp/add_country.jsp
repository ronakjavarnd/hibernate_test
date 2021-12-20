<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="SaveCountryServlet" method="post">
  <div class="mb-3">
    <label for="country" class="form-label">country name</label>
    <input type="text" class="form-control" id="exampleInputPassword1" name="country_name"/>
  </div>
  
  <div class="mb-3">
    <label for="language" class="form-label">language</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="language"/>
    
  </div>
  <div class="mb-3">
    <label for="capital" class="form-label">capital</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="capital"/>
    
  </div>
  
  <div class="mb-3">
    <label for="capital" class="form-label">sport</label>
    <input type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" name="sport"/>
    
  </div>
  
  
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</body>
</html>