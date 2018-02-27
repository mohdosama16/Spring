<%@page import="com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <%
      String Msg[] = (String[]) request.getAttribute("mywelcome");
      String Welcome = "";
      
     for (String m: Msg)
    	 
       out.println(m);
      //out.print(Array.ToStrring(WelcomeM));
      
      
      %>

</body>
</html>