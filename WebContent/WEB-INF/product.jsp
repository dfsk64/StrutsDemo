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
	<s:form action="/productadd">
		<s:textfield name="name" label="商品名称" size="20" /><br/>
		<s:textfield name="price" label="商品价格" size="20" /><br/>
		<s:submit value="submit" />
	</s:form>
</body>
</html>