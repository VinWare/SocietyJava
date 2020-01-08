<%@include file="basehead.jsp" %>
	<link rel="stylesheet" href="static/css/homepage_layout.css">
	<script src="static/js/indexPage.js"></script>

 <%@include file="basebody.jsp"%>
	<div class="container-fluid title-div">
		<div class="row">
			<div class="col-lg-6">
				<h1 class="title-text">Society Hub</h1>
				<h2 class="title-sub-text">
					United you stand,
					<br />
					with the technology in your hand.
				</h2>
			</div>

			<div class="col-lg-6">
				<img class="title-background" src="static/assets/images/background1.jpg" />
			</div>
		</div>
	</div>

	<div class="container">
		<div class="row">
			<div class="col-sm-12">
				<h3 id="center-paragraph">
					Society Hub is a state of the art,
					customizable social platform for local community groups.
				</h3>
			</div>
		</div>
	</div>
	
		<div class="row" id="loginDiv">
			<h1 class="formHeading">Login</h1>

			<form method="post" action="login">
				<div class="form-group">
				<label for="username">Username</label>
				<input type="text" name="username" id="username" class="form-control">
				</div>
				<div class="form-group">
				<label for="password">Password</label>
				<input type="text" name="password" id="password" class="form-control">
				</div>
				<center>
					<input type="submit" class="btn btn-light btn-block btn-lg">
				</center>
			</form>
		</div>
<!-- <%@include file="basefooter.jsp"%> -->
