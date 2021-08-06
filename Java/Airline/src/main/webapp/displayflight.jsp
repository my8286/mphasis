
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css" integrity="sha384-B0vP5xmATw1+K9KRQjQERJvTumQW0nPEzvF6L/Z6nronJ3oUOFUFpCjEUQouq2+l" crossorigin="anonymous">

    <title>Hello, world!</title>
    <style>
    #home{
    	height:500px;
    	width:80%
    }
    </style>
  </head>
  <body>
    <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo03" aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		  <a class="navbar-brand" href="#">TravelGO</a>
		
		  <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
		    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
		      <li class="nav-item">
		        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="#">Register</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="#">Login</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="#">View</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="#">Search</a>
		      </li>
		      <li class="nav-item active">
		        <a class="nav-link" href="#">Booking</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="#">Passenger</a>
		      </li>
		      
		    </ul>
		    <form class="form-inline my-2 my-lg-0">
		      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
		      <button class="btn btn-outline-light my-2 my-sm-0" type="submit">Search</button>
		    </form>
		  </div>
		</nav>


	 <div class="container-fluid d-flex justify-content-center align-items-center" id="home">
		 <div style="width:50%">
			<table class="table">
				<tr><th>Sr no</th><th>Flight no</th><th>Departure</th><th>Arrival</th><th>From</th><th>To</th><th>Fare</th><th>Book</th>	
				
				</tr>
				<%
					String date=request.getAttribute("date").toString();
					int passenger_id=1;
				%>
				<c:forEach items="${flights}" var="obj">  
		   				<tr>
		   					<td>${obj.getFlight_id()}</td>
		   					<td>${obj.getFlight_no()}</td>
		   					<td>${obj.getDeparture()}</td>
		   					<td>${obj.getArrival()}</td>
		   					<td>${obj.getOrigin()}</td>
		   					<td>${obj.getDestination()}</td>
		   					<td>${obj.getFare()}</td>
		   					<td><a href="BookTicket?flight_id=${obj.getFlight_id()}&passenger_id=<%= passenger_id %>&depature_date=<%= date%>">
		   					<button type="button" class="btn btn-primary">Book</button></a></td>
		   				</tr>  
				</c:forEach> 
		 	</table>	
		 </div>
	 </div>
    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: jQuery and Bootstrap Bundle (includes Popper) -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-Piv4xVNRyMGpqkS2by6br4gNJ7DXjqk09RmUpJ8jgGtD7zP9yug3goQfGII0yAns" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/js/bootstrap.min.js" integrity="sha384-+YQ4JLhjyBLPDQt//I+STsc9iw4uQqACwlvpslubQzn4u2UU2UFM80nGisd026JF" crossorigin="anonymous"></script>
    -->
  </body>
</html>