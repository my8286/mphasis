<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<h1>Hello World!</h1>
<!-- expression tag  -->
        <%= 5+4 %>
<!-- declarative -->
        <%!int sum,a,b;%>  <!-- this is known as global declaration -->
        <% a=10;b=20; sum=a+b;
        out.println("the sum of numbers is"+sum);
        %>
        <font color="red" size="8">
            the sum of <%=a%> and <%=b%> is <%=sum%>
        </font>                  
    </body>