<%@ page isELIgnored="false" %>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%--<c:choose>
<c:when test="${!empty empsList}">
<h1 style="color: red;text-align: center;">Employee Report</h1>
<table border="1" align="center" bgcolor="cyan">
<tr style="color: red;"><th>empno</th><th>emp name</th><th>job</th><th>salary</th><th>deptno</th></tr>
<c:forEach var="emp" items="${empsList} ">
<tr style="color: blue;">
<td>${emp.empno} </td>
<td>${emp.ename}</td>
<td>${emp.job}</td>
<td>${emp.sal}</td>
<td>${emp.deptno}</td>
</tr>
</c:forEach>
</table>
</c:when>
<c:otherwise>
<h1 style="color: red;text-align: center;">Employees Not found</h1>
</c:otherwise>
</c:choose> --%>
<!DOCTYPE html>
<html>
<head>
<title>Employee Report</title>
</head>
<center>
	<body>
		<h1>Employee Report</h1>
		<table border="1">
			<tr style="color: red;">
				<th>empno</th>
				<th>emp name</th>
				<th>job</th>
				<th>salary</th>
				<th>deptno</th>
				<th>Operations</th>
			</tr>
			<c:forEach var="emp" items="${empData}">
				<tr class="table-success">
					<td>${emp.empno}</td>
					<td>${emp.ename}</td>
					<td>${emp.job}</td>
					<td>${emp.sal}</td>
					<td>${emp.deptno}</td>

					<td><a href="emp_edit?no=${emp.empno}"><img
							src="C:\Users\Bhavesh\Downloads\imresizer-1722878514979.jpg"
							width="20px" height="20px"></a> <a
						href="emp_delete?no=${emp.empno}"><img
							src="C:\Users\Bhavesh\Downloads\delete emp.png" width="50px"
							height="50px"></a></td>
				</tr>
			</c:forEach>

		</table>

		<p style="text-align: center;">
			<c:if test="${emp.hasPrevious()}">
				<a href="emp_report?page=${emp.getPageable().getPgeNumber()-1}">previous</a>
			</c:if>

			<c:if test="${!emp.isFirst()}">
				<a href="emp_report?page=0">first</a>&nbsp;&nbsp;
    </c:if>

			<c:forEach var="i" begin="1" end="${emp.getTotalPages()}">
  [<a href="emp_report?page=${i-1}">${i}></a>]&nbsp;&nbsp;
  </c:forEach>

			<c:if test="${!emp.isLast()}">
				<a href="emp_report?page=${emp.getTotalPages()-1}">Last</a>&nbsp;&nbsp;
    </c:if>


			<c:if test="${!emp.hasNext()}">
				<a href="emp_report?page=${emp.getPageable().getPgeNumber()+1}">Next</a>&nbsp;&nbsp;
    </c:if>
	</body>
</html>
</center>
<center>
<a href="emp_add">Add Employee</a>&nbsp;&nbsp;
<a href="./">Home</a>
</center>
<h1 style="color: green;text-align: center;">${resultMsg }</h1>
</center>