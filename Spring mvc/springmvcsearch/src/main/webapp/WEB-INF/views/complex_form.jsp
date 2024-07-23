<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Hello, world!</title>
</head>
<body class="" style="background: #e2e2e2;">
	<div class="container mt-4">
		<div class="row">

			<div class="col-md-8 offset-md-2">

				<div class="card">
					<div class="card-body">

						<h3 class="text-center">Complex Form</h3>

						<form action="handleform" method="post">

							<div class="form-group">
								<label for="name">Your name</label> 
								<input 
									class="form-control"
									type="text"
									name="name" 
									id="name" 
									placeholder="Enter Your Name" />
							</div>

							<div class="form-group">
								<label for="email">Your Email</label> 
								<input 
									class="form-control"
									type="email"
									name="email" 
									id="email" 
									placeholder="Enter Email" />
							</div>
							
							<div class="form-group">
								<label for="id">Your ID</label> 
								<input 
									class="form-control"
									type="text"
									name="id" 
									id="id" 
									placeholder="Enter id" />
							</div>


							<div class="form-group">
								<label for="dob">Your DOB</label> 
								<input 
									class="form-control"
									type="text" 
									name="dob"
									id="dob" 
									placeholder="dd/mm/yyyy" />
							</div>

							<div class="form-group">
								<label for="courses">Select Courses</label> <select
									name="courses" class="form-control" id="courses" multiple>
									<option>Java</option>
									<option>Python</option>
									<option>C++</option>
									<option>Django</option>
									<option>Spring Framework</option>
									<option>C#</option>
								</select>
							</div>

							<div class="form-group">
								<span class="mr-3">Select Gender</span>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio1" value="male" /> <label
										class="form-check-label" for="inlineRadio1">Male</label>
								</div>

								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="gender"
										id="inlineRadio2" value="female" /> <label
										class="form-check-label" for="inlineRadio2">Female</label>
								</div>
							</div>

							<div class="form-group">
								<label for="">Select Type</label> <select class="form-control"
									name="type">
									<option value="oldstudent">Old Student</option>
									<option value="normalstudent">Normal Student</option>
								</select>
							</div>

							<div class="card">
								<div class="card-body">
									<p>Your Address</p>
									
									<div class="form-group">
										<input 
											type="text"
											name="address.street"
											class="form-control"
											placeholder="Enter Street" />
									</div>
									
									<div class="form-group">
										<input 
											type="text"
											name="address.city"
											class="form-control"
											placeholder="Enter city" />
									</div>
									
								</div>
							</div>


							<div class="container text-center mt-4">
								<button type="submit" class="btn btn-primary">Submit</button>
							</div>
						</form>

					</div>
				</div>

			</div>

		</div>
	</div>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>