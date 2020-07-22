<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="CustomControllerpath" method="post">
  <table>
    <tr> 
     <td>Enter the userName</td>
     <td><input type="text" name="usernname" value=""/></td>
    </tr>
     <tr> 
     <td>Enter the password</td>
     <td><input type="password" name="password" value=""/></td>
    </tr>
     <tr> 
     
     <td><input type="submit" name="register" value="register"/></td>
      <td><input type="reset" name="cancel" value="cancel"/></td>
    </tr>
    
  </table>
  </form>
</body>
</html>