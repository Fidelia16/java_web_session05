<%--
  Created by IntelliJ IDEA.
  User: Phu
  Date: 2025/11/15
  Time: 23:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${isUpdate?"Update":"New"}Student</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/studentController/${isUpdate?"updateStudent":"createStudent"}"
      method="post">
    <label for="studentId">Student Id</label>
    <input type="text" name="id" id="studentId"
           value="${student.id}"
    ${isUpdate?"readonly":" "}><br>
    <label for="studentName">Student Name</label>
    <input type="text" name="name" id="studentName"
    value="${student.name}"><br>
    <label for="email">Student Email</label>
    <input type="text" name="email" id="email"
    value="${student.email}"><br>
    <label for="birthday">Birthday</label>
    <input type="date" name="birthday" id="birthday"
    value="${student.birthday}"><br>
    <label for="avgMark">Avg Mark</label>
    <input type="text" name="avgMark" id="avgMark"
    value="${student.avgMark}"><br>
    <input type="submit" value="${isUpdate?"Update":"Create"}">
</form>
</body>
</html>
