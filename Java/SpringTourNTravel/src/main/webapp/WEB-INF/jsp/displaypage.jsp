<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
   <head>
      <title>Display Employee</title>
   </head>

   <body>
   	<table border=1>
   	<tr>
   	<td>Empno</td>
   	<td>Name</td>
   	<td>Designation</td>
   	<td>Salary</td>
   	<td>Email</td>
   	<td>Contact</td>
   	</tr>
      <c:forEach var = "emp" items="${list}">
      <tr>
         <td>${emp.getId()} </td>
         <td>${emp.getName()} </td>
         <td>${emp.getDesignation()} </td>
         <td>${emp.getSalary()} </td>
         <td>${emp.getEmail()} </td>
         <td>${emp.getContact()} </td>
        </tr>
      </c:forEach>
     </table>
   </body>
</html>