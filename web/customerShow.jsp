<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: phdan
  Date: 14/05/2020
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer List</title>
    <style>
        p {
            text-align: center;
            margin: auto;
        }
        form{
            text-align: center;
        }
        table{
            margin-top: 20px;
        }
    </style>
</head>
<body>
<form>
    <p>Customer List</p>
    <table>
        <tr>
            <td>
                <p>Name</p>
            </td>
            <td>
                <p>Date of Birth</p>
            </td>
            <td>
                <p>Address</p>
            </td>
        </tr>
        <c:forEach var="customer" items="${List}">
            <tr>
                <td>${customer.getName()}</td>
                <td>${customer.getDOB()}</td>
                <td>${customer.getAddress()}</td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>
