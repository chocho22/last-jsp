<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
</head>
<body>
<div align="center">
<div style="color:teal" align="center">
<b><font size="10em">ADDRESS</font></b>
</div>
<table border="3" cellpadding="5">
<tr>
	<th>번호</th>
	<th>법정동코드</th>
	<th>시도</th>
	<th>시군구</th>
	<th>법정읍면동명</th>
	<th>법정리명</th>
	<th>번지</th>
	<th>호</th>
	<th>도로명코드</th>
	<th>지하</th>
	<th>건물본번</th>
	<th>건물부번</th>
	<th>지번일련번호</th>
</tr>
<c:forEach items="${list}" var="addr">
	<tr>
		<td>${addr.adNum}</td>
		<td>${addr.adCode}</td>
		<td>${addr.adSido}</td>
		<td>${addr.adGugun}</td>
		<td><a href="/addr/one?adNum=${addr.adNum}">${addr.adDong}</a></td>
		<td>${addr.adLee}</td>
		<td>${addr.adBunji}</td>
		<td>${addr.adHo}</td>
		<td>${addr.adRoadcode}</td>
		<td>${addr.adIsbase}</td>
		<td>${addr.adOrgnum}</td>
		<td>${addr.adSubnum}</td>
		<td>${addr.adJinum}</td>
	</tr>
</c:forEach>
</table>
</div>
</body>
</html>