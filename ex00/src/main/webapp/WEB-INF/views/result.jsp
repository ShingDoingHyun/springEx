<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<span>Hello ${msg}  </span> <!-- 전달받아 el로 출력, 별도의 getParameter 필요 없음 -->
	<span>Hello ${mem.getUserid()}  </span> 
	<span>Hello ${mem.getUserpw()}  </span> 
</body>
</html>