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
	
	<div class="container formDiv">
		<button id="loginButton">Login</button><button id="signupButton">Signup</button>
		
		<div class="row" id="loginDiv">
			<h1 class="formHeading">Login</h1>

			<form method="post" action="/">
				{{form.hidden_tag()}}
				<div class="form-group">
					{{ form.accName.label}}
					{{ form.accName(class_="form-control") }}
				</div>
				<div class="form-group">
					{{ form.password.label}}
					{{ form.password(class_="form-control") }}
				</div>
				<div class="form-group">
					{% for choice in form.accType.choices %}
					<div class="radio">
						<input type="radio" name="{{ form.accType.name }}" value="{{ choice[0] }}"/>
						<label for="{{ form.accType.name }}">{{ choice[1] }}</label>
					</div>
					{% endfor %}
				</div>
				<center>
					{{ form.submitBtn(class_="btn btn-light btn-block btn-lg") }}
				</center>
			</form>
		</div>
		<div class="row" id="signupDiv">
			<h1 class="formHeading">SignUp</h1>
			<br/>
			<div class="row justify-content-center">
                <a href="/signup">
				<button class=" col-xs-6 btn btn-dark btn-lg signupLink">
                    Create a new Commmunity
				</button>
                </a>
			</div>
			<br/>
		</div>
	</div>
<%@include file="basefooter.jsp"%>
