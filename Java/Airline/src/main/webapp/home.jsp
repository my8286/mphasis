<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
        integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.0/css/all.css"
        integrity="sha384-lZN37f5QGtY3VHgisS14W3ExzMWZxybE1SJSEsQp9S+oqd12jhcu+A56Ebc1zFSJ" crossorigin="anonymous">
    <title>Airline Reservation </title>
    <style>
    	#home{
            background-image: url('banner-bg.jpg');
            background-repeat: no-repeat;
            background-size: cover;
            height: 665px;
        }
        navbar{
        background-color:rgba(255,0,0,0.3);
        }
    	
    	#left{
    	
    	background-color:rgba(0, 0, 0,0.5);
    	margin-left:-15px;
    	color:white;
    	height:665px;
    	padding-top:30%;
    	padding-left:5%
    	
    	}
    	#right{
    	
    	/* background-color:rgba(0, 0, 0,0.5); */
    	padding:100px;
    	color:white;
    	height:650px
    	
    	}
    	#form{
    		background-color:rgba(0, 0, 255,0.4);
    		padding:100px;
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
      <li class="nav-item active">
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
      <li class="nav-item">
        <a class="nav-link" href="#">Book</a>
      </li>
      
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-light my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>

<div class="container-fluid" id="home">
      <div class="row">
	    <div class="col">
		    <div id="left" class="fill">
		    	<div >
		    	<h1><em>Great Journey Begins with small steps</em></h1>
		    	<p><center>Make your life better and bright! You must make a trip with us.</center></p>
		    	<center><button type="button" class="btn">Get start</button></center>
		    	</div> 
		    </div>
	    </div>
	    <div class="col">
	      <div id="right">
	      <div id="form">
	      	<form action="SearchFlight" method="get">
			  <div class="form-row">
			    <div class="form-group col-md-6">
			      <label for="inputEmail4">From</label>
			      <select class="custom-select" name="from">
					  <option selected>Select a location</option>
					  <option value="delhi">Delhi</option>
					  <option value="mumbai">Mumbai</option>
					  <option value="chennai">Chennai</option>
					</select>
			    </div>
			    <div class="form-group col-md-6">
			      <label for="inputPassword4">To</label>
			      <select class="custom-select" name="to">
					  <option selected>Select a location</option>
					  <option value="delhi">Delhi</option>
					  <option value="mumbai">Mumbai</option>
					  <option value="chennai">Chennai</option>
					</select>
			    </div>
			  </div>
			  <div class="form-row">
			    <div class="form-group col-md-6">
			      <label for="inputEmail4">Departure Date</label>
			      <input type="date" class="form-control" name="depature_date">
			    </div>
			    <div class="form-group col-md-6">
			      <label for="return date">Return Date</label>
			      <input type="date" class="form-control" id="inputPassword4">
			    </div>
			  </div>
			  <div class="custom-control custom-radio custom-control-inline">
				  <input type="radio" id="customRadioInline1" name="customRadioInline" class="custom-control-input">
				  <label class="custom-control-label" for="customRadioInline1">Round</label>
				</div>
				<div class="custom-control custom-radio custom-control-inline">
				  <input type="radio" id="customRadioInline2" name="customRadioInline" class="custom-control-input">
				  <label class="custom-control-label" for="customRadioInline2">Oneway</label>
				</div>
			  <input style="float:right" type="submit" class="btn btn-primary" value="Book Now" />
			</form>
			</div>
	      </div>
    	</div>
  	  </div>  
        
</div>


<div class="container menu">
        <h1 class="display-4 text-center" style="margin-bottom:30px">Top Destinations in the world</h1>
        <div class="row row-cols-1 row-cols-md-3">
  <div class="col mb-4">
    <div class="card">
      <img src="place-01.jpg" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">England</h5>
        <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
      </div>
    </div>
  </div>
  <div class="col mb-4">
    <div class="card">
      <img src="place-02.jpg" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">Praygu</h5>
        <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
      </div>
    </div>
  </div>
  <div class="col mb-4">
    <div class="card">
      <img src="place-03.jpg" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">New york</h5>
        <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content.</p>
      </div>
    </div>
  </div>
  <div class="col mb-4">
    <div class="card">
      <img src="place-04.jpg" class="card-img-top" alt="...">
      <div class="card-body">
        <h5 class="card-title">Peris</h5>
        <p class="card-text">This is a longer card with supporting text below as a natural lead-in to additional content. This content is a little bit longer.</p>
      </div>
    </div>
  </div>
</div>
</div>



</body>
</html>