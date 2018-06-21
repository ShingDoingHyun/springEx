<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<span>${productVO.name }</span><!-- model에 넣은 객체의 이름이 아닌 클래스이름에서 앞자리를 소문자로 해서 출력 -->
<span>${productVO.price }</span>
<span>${memberVO.userid }</span>
<span>${memberVO.userpw }</span>

</body>
</html>