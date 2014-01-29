<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<ul>
	<c:forEach var="person" items="${people}">
		<li>Name: ${person.name}</li>
	</c:forEach>
</ul>

</body>
</html>
