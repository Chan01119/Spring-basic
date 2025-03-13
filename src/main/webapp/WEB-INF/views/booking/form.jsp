<%--
  Created by IntelliJ IDEA.
  User: USER
  Date: 25. 3. 13.
  Time: 오전 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<style>

    body {

    }
</style>
<head>
    <title>Booking</title>
</head>
<body>
<h1>레스토랑 예약</h1>
<form action="${pageContext.request.contextPath}/booking/proceed">
    <p>
        <label>닉네임 : <input type="text" name="customerName"/> </label>
    </p>

    <p>
        <label>예약인원 : <input type="number" name="guests"/> </label>
    </p>

    <p>
        <label>예약날짜 : <input type="date" name="bookingDate"/> </label>
    </p>

    <p>
        <label>이메일주소 : <input type="text" name="contact"/> </label>
    </p>

    <p>
        <label>요청사항 : <textarea name="request">요청사항</textarea> </label>
    </p>

    <p>
        <button type="submit">요금정산</button>
    </p>
</form>
</body>
</html>
