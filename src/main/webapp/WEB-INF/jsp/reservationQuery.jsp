<%-- 
    Document   : reservationQuery
    Created on : Oct 2, 2012, 1:18:09 PM
    Author     : gvargas
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post">
        Student Id
        <input type="text" name="studentId" value="${studentId}" />
        <input type="submit" value="Query" />
        </form>

        <table border="1">
            <tr>
                <th>Reservation Id</th>
                <th>Date</th>
                <th>Hour</th>
            </tr>
            <c:forEach items="${reservations}" var="reservation">
            <tr>
                <td>${reservation.reservationId}</td>
                <td><fmt:formatDate value="${reservation.date}" pattern="yyyy-MM-dd" /></td>
                <td>${reservation.hour}</td>                
            </tr>
            </c:forEach>
         </table>
    </body>
</html>
