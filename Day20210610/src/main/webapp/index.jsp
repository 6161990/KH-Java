<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>SNS : 로그인 </title>
<link rel="stylesheet" href="./css/skyblue.css">
<link rel="stylesheet" href="./css/pe-icon-7-stroke.css">
<link rel="stylesheet" href="./css/helper.css">
</head>
<body>
	<div class="bg-success padding-y-5">
		<div class="container padding-y-5 text-center">
			<h1>
				SNS : 로그인
			</h1>
		</div>
	</div>
	<div class="padding-y-5 text-center">
		<div style="width: 40%" class="container padding-y-5 text-left">
			<strong class="color-main">로그인ID와 비밀번호를 입력하십시오.</strong>
		</div>
	</div>
	<div class="padding-y-5 text-center">
		<div style="width: 40%" class="container padding-y-5 text-center">
			<%-- action 속성에 서블릿을 지정 --%>
			<form action="./login" method="post">
				<table style="width: 400px" class="table">
					<tr>
						<%-- 로그인ID 입력란명은 loginId --%>
						<td class="color-main text-left">회원ID</td>
						<td class="text-left"><input class="form-control" type="text"
							name="loginId" value="" size="20" /></td>
					</tr>
					<tr>
						<%-- 비밀번호 입력한명은 password --%>
						<td class="color-main text-left">비밀번호</td>
						<td class="text-left"><input class="form-control"
							type="password" name="password" value="" size="20" /></td>
					</tr>
					<tr>
						<td colspan="2" class="text-right"><input class="btn"
							type="submit" value="로그인" /></td>
					</tr>
					<%-- 요청범위에 alert이 있는 경우 --%>
					<c:if
						test="${requestScope.alert != null && requestScope.alert != ''}">
						<tr>
							<%-- 요청범위내 alert값 출력 --%>
							<td colspan="2" class="color-error text-left"><c:out value="${requestScope.alert}" /></td>
						</tr>
					</c:if>
				</table>
			</form>
		</div>
	</div>
</body>
</html>
