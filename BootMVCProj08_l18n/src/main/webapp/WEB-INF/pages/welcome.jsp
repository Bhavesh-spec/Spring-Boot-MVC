<%@ page isELIgnored="false" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="sp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<h1 style="color: red; text-align: center;">
    <sp:message code="home.title"/>
</h1>
<a href="register">
    <h2 style="color:red;text-align:center;">
        <sp:message code="home.link"/>
    </h2>
</a>
<br><br>

<%-- <h1>Current active Locale is: ${pageContext.request.locale.displayName}</h1> --%>
<fmt:setLocale value="${pageContext.request.locale}"/>
<jsp:useBean id="dt" class="java.util.Date"/>

<fmt:formatDate var="fdt" value="${dt}" type="date" dateStyle="SHORT" />
<b>formatted date: ${fdt}</b><br>
<fmt:formatDate var="ftime" value="${dt}" type="date" dateStyle="FULL" />
<b>formatted time: ${ftime}</b>
<br>
<fmt:formatNumber var="fnumber" value="100000" type="number" />
<b>formatted number: ${fnumber}</b>
<br>
<fmt:formatNumber var="fcurrency" value="100000" type="currency" />
<b>formatted currency: ${fcurrency}</b>
<br>
<fmt:formatNumber var="fpercentage" value="0.211" type="percent" />
<b>formatted percentage: ${fpercentage}</b>

<br><br> 

<p align="center">
    <a href="?lang=fr_FR">French</a>&nbsp;&nbsp;&nbsp;&nbsp; 
    <a href="?lang=de_DE">German</a>&nbsp;&nbsp;&nbsp;&nbsp; 
    <a href="?lang=hi_IN">हिन्दी</a>&nbsp;&nbsp;&nbsp;&nbsp; 
    <a href="?lang=en_US">English</a>&nbsp;&nbsp;&nbsp;&nbsp;
</p>

<%-- <%@ page isELIgnored="false" contentType="text/html; charset=ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="sp"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 

<h1 style="color: red; text-align: center;">
	<sp:message code="home.title"></sp:message>
</h1>
 <a href="register"><h2 style="color:red;text-align:center;">
		<sp:message code="home.link"></sp:message>
	</h2></a>
<br><br>

<h1>Current active Locale is::${pageContext.response.locale}</h1>
<fmt:setLocale value="${pageContext.response.locale}"/>
<jsp:useBean id="dt" class="java.util.Date"/>

<fmt:formateDate var="fdt" value="${dt}" type="date" dateStyle="SHORT" />
<b>formatted date::${fdt}</b>
<fmt:formateDate var="ftime" value="${dt}" type="date" dateStyle="FULL" />
<b>formatted time::${ftime}</b>

<fmt:formateNumber var="fnumber" value="100000" type="number" />
<b>formatted number::${number}</b>

<fmt:formateNumber var="fcurrency" value="100000" type="currency" />
<b>formatted currency::${fcurrency}</b>

<fmt:formateNumber var="fpercentage" value="0.211" type="PERCENT" />
<b>formatted percentage::${fpercentage}</b>

<br>
<br> 


<p align="center">
	<a href="?lang=fr_FR">French</a>&nbsp;&nbsp;&nbsp;&nbsp; <a
		href="?lang=de_DE">German</a>&nbsp;&nbsp;&nbsp;&nbsp; <a
		href="?lang=hi_IN">हिन्दी</a>&nbsp;&nbsp;&nbsp;&nbsp; <a
		href="?lang=en_US">English</a>&nbsp;&nbsp;&nbsp;&nbsp;
</p> --%>