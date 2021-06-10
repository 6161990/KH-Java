<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>SNS : 목록 </title>
<link rel="stylesheet" href="./css/skyblue.css">
<link rel="stylesheet" href="./css/pe-icon-7-stroke.css">
<link rel="stylesheet" href="./css/helper.css">
</head>
<body>
	<div class="bg-success padding-y-5">
		<div class="container padding-y-5 text-center">
			<h1>
				SNS : 목록
			</h1>
		</div>
	</div>
	<div class="padding-y-5 text-center">
		<div style="width: 40%" class="container padding-y-5 text-left">
			<strong class="color-main">로그인사용자 정보</strong>
		</div>
	</div>
	<%-- 세션범위에 있는 UserDTO형 객체 참조 --%>
	<jsp:useBean id="user" scope="session" type="dto.UserDTO"/>
	<div class="padding-y-5">
		<div style="width: 40%" class="container padding-y-5">
	
			<form action="./logout" method="post">
				<table class="table table-bordered">
					<tr>
						<td rowspan="2" class="text-center"><span class="${user.icon} pe-3x pe-va"></span></td>
						<td width="256">${user.userName}님</td>
						<td><input class="btn btn-light" type="submit" value="로그아웃" /></td>
					</tr>
					<tr>
						<td colspan="2">${user.profile}</td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<div class="padding-y-5 text-center">
		<div style="width: 40%" class="container padding-y-5 text-left">
			<strong class="color-main">지금 접속한 사용자</strong>
		</div>
	</div>
		<div class="padding-y-5 text-center">
		<div style="width: 40%" class="container padding-y-5 text-center">
			<%-- action 속성에 서블릿지정 --%>
				<table class="table">
					<tr>
		         		<td rowspan="2" class="text-center"><span class="${user.icon} pe-3x pe-va"></span></td>
						<td width="256">${user.userName}(${user.loginId})님</td>
					</tr>
				</table>
		</div>
	</div>
	<div class="padding-y-5 text-center">
		<div style="width: 40%" class="container padding-y-5 text-left">
			<strong class="color-main">지금 하고 싶은 한마디?</strong>
		</div>
	</div>
	<div class="padding-y-5 text-center">
		<div style="width: 40%" class="container padding-y-5 text-center">
			<%-- action 속성에 서블릿지정 --%>
			<form action="./board" method="post">
				<table class="table">
					<tr>
						<%-- 지금 하고 싶으말 입력 sns --%>
						<td><input class="form-control" type="text" name="shout"
							value="" size="60" /></td>
						<td><input class="btn" type="submit" value="말하기" /></td>
					</tr>
				</table>
			</form>
		</div>
	</div>
	<div class="padding-y-5 text-center">
		<div style="width: 40%" class="container padding-y-5 text-left">
			<strong class="color-main">모두의 한마디</strong>
		</div>
	</div>
	<%-- 세션범위에 있는 ArrayList형 객체 참조 --%>
	<jsp:useBean id="sns" scope="session"
		type="java.util.ArrayList<dto.SnsDTO>" />
	<div class="padding-y-5">
		<div style="width: 40%" class="container padding-y-5">
			<%-- 목록에 있는 요소수 만큼 반복 --%>
			<c:forEach var="sns" items="${sns}">
				<table class="table table-striped table-bordered">
					<tr>
						<td rowspan="2" class="text-center"><span class="${sns.icon} pe-3x pe-va"></span></td>
						<td>${sns.userName}님</td>
					</tr>
					<tr>
						<td>${sns.date}</td>
					</tr>
					<tr>
						<td colspan="2"><textarea rows="2" class="form-control">${sns.writing}</textarea>
						</td>
					</tr>
				</table>
			</c:forEach>
		</div>
	</div>
</body>
</html>