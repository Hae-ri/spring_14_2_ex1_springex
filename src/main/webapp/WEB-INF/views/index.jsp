<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>index.jsp</title>
</head>
<body>

	<form action="studentView" method="post">
		이름 : <input type="text" name="name"><br>
		나이 : <input type="text" name="age"><br>
		이메일 : <input type="text" name="email"><br>
		주소 : <input type="text" name="address"><br>
		<input type="submit" value="정보 전송">
	</form>

</body>
</html>