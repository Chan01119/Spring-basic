<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 12.
  Time: 오후 12:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring</title>
</head>
<body>
        <h1>주차요금계산</h1>
<form action="${pageContext.request.contextPath}/parking/calculate">
    <p>
        <label>차량번호 : <input type="text" name = "car"/> </label>
    </p>

    <p>
        <label>주차시간 : <input type="number" name = "분"/> </label>
    </p>

    <p>
        <label>구매금액 : <input type="text" name = "car"/> </label>
    </p>

    <p>
        <button type="submit">요금정산</button>
    </p>
</form>
</body>
</html>
