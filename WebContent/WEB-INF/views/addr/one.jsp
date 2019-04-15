<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>으흠,,</title>
</head>
<body>
	<div align="center">
		<table border="3" cellpadding="5">
			<tr>
				<th>번호</th>
				<td>${one.adNum}</td>
			</tr>
			<tr>
				<th>법정동코드</th>
				<td>${one.adCode}</td>
			</tr>
			<tr>
				<th>시도</th>
				<td>${one.adSido}</td>
			</tr>
			<tr>
				<th>시군구</th>
				<td>${one.adGugun}</td>
			</tr>
			<tr>
				<th>법정읍면동명</th>
				<td>${one.adDong}</td>
			</tr>
			<tr>
				<th>법정리명</th>
				<td>${one.adLee}</td>
			</tr>
			<tr>
				<th>번지</th>
				<td>${one.adBunji}</td>
			</tr>
			<tr>
				<th>호</th>
				<td>${one.adHo}</td>
			</tr>
			<tr>
				<th>도로명코드</th>
				<td>${one.adRoadcode}</td>
			</tr>
			<tr>
				<th>지하</th>
				<td>${one.adIsbase}</td>
			</tr>
			<tr>
				<th>건물본번</th>
				<td>${one.adOrgnum}</td>
			</tr>
			<tr>
				<th>건물부번</th>
				<td>${one.adSubnum}</td>
			</tr>
			<tr>
				<th>지번일련번호</th>
				<td>${one.adJinum}</td>
			</tr>
		</table>
		<a href="/addr/list"><button>리스트로 돌아가기</button></a>
	</div>
</body>
</html>