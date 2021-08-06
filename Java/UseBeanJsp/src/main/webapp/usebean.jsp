<jsp:useBean id="sr" scope="session" class="srbean.priceinfo" /> 
<html>
<head><center>Food</center></head>
<body bgcolor="papayawhip">
<%String s=request.getParameter("sel");%>
<jsp:setProperty name="sr" property="product" 
value="<%= s %>" />
<jsp:getProperty name="sr" property="price" />
</body>
</html>
