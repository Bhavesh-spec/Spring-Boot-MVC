<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm" %>
<h1 style="color: blue;text-align: center;">Student Register form</h1>

<frm:form action="register" method="POST" modelAttribute="stud">
<table border="0" bgcolor="cyan" align="center">
<tr>
<td>Student id:</td>
<td><frm:input path="sno"/>
</tr>


<tr>
<td>Student name:</td>
<td><frm:input path="sname"/>
</tr>




<tr>
<td>Student address:</td>
<td><frm:input path="sadd"/>
</tr>

<tr>
<td>Student Average:</td>
<td><frm:input path="avg"/>
</tr>
</table>

<input type="submit" value="register"></frm:form>