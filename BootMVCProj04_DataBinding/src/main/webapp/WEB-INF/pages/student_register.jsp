<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h1 style="color: red;text-align: center;">student register page</h1>
<form action="register" method="post">
<table align="center" bgcolor="cyan">
 <tr>
 <td>student number</td>
 <td><input type="text" name="sno"></td>
 </tr>
  <tr>
 <td>student name</td>
 <td><input type="text" name="sname"></td>
 </tr>
  <tr>
 <td>student address</td>
 <td><input type="text" name="sadd"></td>
 </tr>
  <tr>
 <td>student avg</td>
 <td><input type="text" name="avg"></td>
 </tr>
  <tr>
 <td><input type="submit" value="Register""></td>
 </tr>
</table>
</form>