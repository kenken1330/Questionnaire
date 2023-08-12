<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>-->
<%@page import="model.Questionnaire" %>
<%Questionnaire q=(Questionnaire)session.getAttribute("questionnaire"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>確認画面</title>
</head>
<body>
<h1>回答内容の確認</h1>
<p>以下の回答内容で送信します。<br>
よろしいですか？</p><br>

<p>Q1:性別を選択してください<br>
<!-- <c:out value="${q.gender}"></c:out></p><br>-->
<%=q.getGender() %></p><br>

<p>Q2:年齢を入力してください<br>
<!--<c:out value="${q.age}"></c:out></p>  -->
<%=q.getAge() %></p><br>

<p>Q3:ご使用中の製品を入力してください<br>
<!-- <c:out value="${q.product}"></c:out> -->
<%=q.getProduct() %></p><br>


<p>Q4:製品ご使用の理由をお答えください<br>
<!-- <c:out value="${q.reason}"></c:out> -->
<%=q.getReason() %></p><br>

<p>Q5:製品満足度をお答えください<br>
<!-- <c:out value="others"></c:out> -->
<%=q.getCs() %></p><br>

<!-- <input type="button" onclick="history.back()" value="修正する"> -->
<form action="/Questionnaire/RegisterServlet" method="get">
<input type="submit" value="修正する">
<!-- <input type="button" onclick="/Questionnaire/RegisterServlet" value="修正する"> -->
</form>
<form action="/Questionnaire/RegisterServlet" method="post">
<input type="submit" value="登録">
</form>



</body>
</html>