<%@ page isELIgnored="false" import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<h1>model attributes data is</h1>
<b>fav colors::</b><br>
<c:forEach var="color" items="${favColors}">
       ${color},
</c:forEach>
<br>
<b>fav nickNames::</b><br>
<c:forEach var="nname" items="${nickNames} ">
       ${nname},
</c:forEach>
<br>
<b>fav phoneNumber::</b><br>
<c:forEach var="phone" items="${phoneNumbers} ">
       ${phone},
</c:forEach>
<br>
<b>fav details::</b><br>
<c:forEach var="id" items="${idDetails}">
       ${id.key},${id.value}<br> 
</c:forEach>

