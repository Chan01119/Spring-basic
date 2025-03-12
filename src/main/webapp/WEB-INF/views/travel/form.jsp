<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 12.
  Time: 오후 5:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Spring</title>
</head>
<body>
<h1>여행경비</h1>
<form action="${pageContext.request.contextPath}/travel/calculate">
    <p>
        <label>여행경비 : <input type="number" name = "travelPay"/> </label>
    </p>

    <p>
        <label>식비 : <input type="number" name = "foodCoast"/> </label>
    </p>

    <p>
        <label>인원 : <input type="number" name = "member"/> </label>
    </p>

    <p>
        <button type="submit">결과확인하기</button>
    </p>
</form>
</body>
</html>
