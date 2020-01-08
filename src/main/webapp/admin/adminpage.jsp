{% extends "base.html" %}

{% block headIncludes %}
	<link rel="stylesheet" href="static/css/adminpage_layout.css">
	{% block adminPageIncludes %}{% endblock %}
	
{% endblock %}

{% block content %}

<div class="container-fluid">
	<div class=" container-fluid society-details-div">
		<h1>{{ session['societyName'] }}</h1>
		<h2>
			{{ address }}
		</h2>
		<div style="overflow-x: auto;">
			<div class="btn-group">
				<button type="button" class="btn btn-dark">Residents &nbsp;<span class="badge badge-secondary">{{ counter['residents'] }}</span></button>
				<button type="button" class="btn btn-dark">Flats     &nbsp;<span class="badge badge-secondary">{{ counter['flats'] }}</span></button>
				<button type="button" class="btn btn-dark">Wings     &nbsp;<span class="badge badge-secondary">{{ counter['wings'] }}</span></button>
				<button type="button" class="btn btn-dark">Admins    &nbsp;<span class="badge badge-secondary">{{ counter['admins'] }}</span></button>

			</div>
		</div> 
	</div>

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-6">
				<h1>Add Notices</h1>
				<div class="container">
					<form method="post" action="{{url_for('addNotice')}}">
						{{noticeForm.hidden_tag()}}
						<div class="form-group">
							{{ noticeForm.header.label}}
							{{ noticeForm.header(class_="form-control") }}
                            <br>
                            {% for error in noticeForm.header.errors %}
                            <span style="color:red;">[{{ error }}]</span>
                            {% endfor %}
						</div>
						<div class="form-group">
							{{ noticeForm.date.label}}
							{{ noticeForm.date(class_="form-control") }}
                            <br>
                            {% for error in noticeForm.date.errors %}
                            <span style="color:red;">[{{ error }}]</span>
                            {% endfor %}
						</div>
						<div class="form-group">
							{{ noticeForm.body.label}}
							{{ noticeForm.body(class_="form-control") }}
                            <br>
                            {% for error in noticeForm.body.errors %}
                            <span style="color:red;">[{{ error }}]</span>
                            {% endfor %}
						</div>
						{{ noticeForm.submitBtn(class_="btn btn-primary btn-block btn-lg") }}
						<br/><br/><br/>
					</form>
				</div>
			</div>
			<div class="col-md-6">
				<div class="container">
					<h1>Add Bill</h1>
					<form method="post" action="{{url_for('addBill')}}">
						{{billForm.hidden_tag()}}
						<div class="form-group">
							{{ billForm.selectedWings.label}}
							{{ billForm.selectedWings(class_="form-control") }}
						</div>
						<div class="form-group">
							{{ billForm.billDate.label }}
							{{ billForm.billDate(class_="form-control") }}
						</div>
						<div class="form-group">
							{{ billForm.dueDate.label }}
							{{ billForm.dueDate(class_="form-control") }}
						</div>
						<div class="form-group">
							{{ billForm.WATER_CHARGES.label }}
							{{ billForm.WATER_CHARGES(class_="form-control") }}
						</div>
						<div class="form-group">
							{{ billForm.PROPERTY_TAX.label }}
							{{ billForm.PROPERTY_TAX(class_="form-control") }}
						</div>
						<div class="form-group">
							{{ billForm.ELECTRICITY_CHARGES.label }}
							{{ billForm.ELECTRICITY_CHARGES(class_="form-control") }}
						</div>
						<div class="form-group">
							{{ billForm.SINKING_FUNDS.label }}
							{{ billForm.SINKING_FUNDS(class_="form-control") }}
						</div>
						<div class="form-group">
							{{ billForm.PARKING_CHARGES.label }}
							{{ billForm.PARKING_CHARGES(class_="form-control") }}
						</div>
						<div class="form-group">
							{{ billForm.NOC.label }}
							{{ billForm.NOC(class_="form-control") }}
						</div>
						<div class="form-group">
							{{ billForm.INSURANCE.label }}
							{{ billForm.INSURANCE(class_="form-control") }}
						</div>
						<div class="form-group">
							{{ billForm.OTHER.label }}
							{{ billForm.OTHER(class_="form-control") }}
						</div>

						<center>
						{{ noticeForm.submitBtn(class_="btn btn-primary btn-block btn-lg") }}
						</center>
						<br/><br/><br/>
					</form>
				</div>
			</div>
		</div>

	</div>

</div>

{% endblock %}
