<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Students</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/studentController/search" method="get">
    <input
            type="text"
            name="keyword"
            placeholder="Nhap ten"
            value="${keyword}"
    />
    <button type="submit">tim kiem</button>
    <a href="<%=request.getContextPath()%>/studentController/findAll ">Xem tat ca</a>
</form>
<table border="1">
    <thead>
    <tr>
        <th>No</th>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Birthday</th>
        <th>AvgMark</th>
        <th>Update</th>
        <th>Delete</th>
    </tr>
    </thead>
    <c:forEach items="${listStudent}" var="student" varStatus="loop">
        <tr>
            <td>${loop.index + 1}</td>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.email}</td>
            <td>${student.birthday}</td>
            <td>${student.avgMark}</td>
            <td>
                <a href="<%=request.getContextPath()%>/studentController/initUpdate?id=${student.id}">Update Student</a>
                <a href="<%=request.getContextPath()%>/studentController/initDelete?id=${student.id}">Delete Student</a>
            </td>
        </tr>
    </c:forEach>
    <a href="<%=request.getContextPath()%>/studentController/initCreate">New Student</a>

</table>
</body>
</html>
