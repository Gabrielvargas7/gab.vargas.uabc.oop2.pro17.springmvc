<%-- 
    Document   : welcome
    Created on : Oct 1, 2012, 3:32:03 PM
    Author     : gvargas
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <h2>Welcome</h2>
        Today is <fmt:formatDate value="${today}" pattern="yyyy-MM-dd" />.
        

        
    </body>
</html>
