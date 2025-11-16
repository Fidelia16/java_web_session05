<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Phu
  Date: 2025/11/17
  Time: 3:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Student</title>
</head>
<body>
    <table>
        <thead>
        <tr>
            <th>No</th>
            <th>Id</th>
            <th>Name</th>
            <th>Action</th>
        </tr>
        </thead>
        <tbody>
       <c:forEach items="${student}" var="student" varStatus="loop">
           <tr>
               <td>${loop.index+1}</td>
               <td>${student.id}</td>
               <td>${student.name}</td>
               <td></td>
           </tr>

       </c:forEach>
        </tbody>
    </table>
</body>
</html>
