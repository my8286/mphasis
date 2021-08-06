<%@page import="java.sql.*" %>
<html>
<body>
<h1>welcome on home page</h1>
<%
String s=request.getParameter("name");
out.println("hello "+s);


	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:xe","system","1234");
	 
	    int id=Integer.parseInt(request.getParameter("id"));
	    String name=request.getParameter("name");
	    int salary=Integer.parseInt(request.getParameter("salary"));
	    String des=request.getParameter("des");
	    String option=request.getParameter("button");
	    
	
	    switch(option)
    	{
    		case "Insert":
    			PreparedStatement st=con.prepareStatement("insert into employee2 values(?,?,?,?)");
    			st.setInt(1,id);
    			st.setString(2,name);
    			st.setInt(3,salary);
    			st.setString(4,des);
    			st.execute();
    		break;
    		case "Update":
    			PreparedStatement st3=con.prepareStatement("update employee2 set name=?, salary=?, des=? where empid=?");
    			st3.setString(1,name);
    			st3.setInt(2,salary);
    			st3.setString(3,des);
    			st3.setInt(4,id);
    			st3.execute();
    			break;
    		case "Delete":
    			PreparedStatement st4=con.prepareStatement("delete employee2 where empid=?");
    			st4.setInt(1,id);
    			st4.execute();
    			break;
    	}
	    Statement st2=con.createStatement();
		ResultSet result=st2.executeQuery("Select * from employee2");
		%>
		<table border=1>
		<tr><th>Id</th><th>Name</th><th>Salary</th><th>Designation</th>
		</tr>
		
		<%
		while(result.next())
		{%>
		<tr>
			<td><% out.print(result.getInt(1)); %></td>
			<td><% out.print(result.getString(2)); %> </td>
			<td><% out.print(result.getInt(3)); %></td>
			<td><% out.print(result.getString(4));%></td>
			</tr>
		<%
		}%>
		
		</table>
		<%
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}



%>
</body>
</html>