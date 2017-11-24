<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<b>Example of If and Else</b><br/>
<s:if test="name='Mike'">
name is Mike.
</s:if>
<s:elseif test="name='Jason'">
name is Jason.
</s:elseif>
<s:else>
name is not Mike or Jason.
</s:else>
<div>***********************************************************</div>
<b>Example of Iterator Tag</b><br/>
<s:iterator value="employees">
	<s:property value="name"/> , 
	<s:property value="department"/><br/>
</s:iterator>
</body>
</html>