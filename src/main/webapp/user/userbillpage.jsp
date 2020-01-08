{% extends "user/userpage.html" %}

{% block userPageIncludes %}
	<link rel="stylesheet" href="static/css/user_bill_layout.css">
	<script src="static/js/userBill.js"></script>
	

	<!--Additional block for child static resources -->
	{% block  userBillIncludes %}{% endblock %}
	
{% endblock %}

{% block userPageContent %}
<div class="col-md-10">
	<div class="container currBillContainer">
		<h1  class="float-left" style="color: #6b6b47;">Maintainence Bill</h1>
		<h1  class="float-md-right" id="billDate">Date : <span id="date">{{ currBill['date'] }}</span></h1>
		<table class="table table-bordered">
			<thead class="thead-dark">
				<tr>
					<th>Category</th>
					<th>Cost</th>
				</tr>
			</thead>
			<tbody style="text-transform: capitalize;">
				{% for billEntry in currBill['entries'] %}
				<tr>
					<td>{{ billEntry['category'] }}</td>
					<td>{{ billEntry['cost'] }}</td>
				</tr>
				{% endfor %}
				<tr class="table-active">
					<td>Total</td>
					<td>{{ currBill['amount'] }}</td>
				</tr>
			</tbody>
		</table>
	</div>
	<div class="container">
		<br/>

		<h1 class="float-left" style="color: #6b6b47;">Previous Bills</h1>
		<table class="table table-hover table-bordered table-striped">
			<thead class="thead-dark" id="billHistory">
				<tr>
					<th>Date</th>
					<th>Amount</th>
				</tr>
			</thead>
			<tbody id="prevBills">
				{% for bill in billList %}
				<tr>
					<td>{{ bill['date'] }}</td>
					<td>{{ bill['amount'] }}</td>
				</tr>
				{% endfor %}
			</tbody>
		</table>
	</div>
</div>
{% endblock %}
