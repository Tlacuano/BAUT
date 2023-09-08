<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>

    <title>JSP - Hello World</title>
    <jsp:include page="views/layout/head.jsp"></jsp:include>

</head>
<body>
<jsp:include page="views/layout/navbar.jsp"></jsp:include>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>