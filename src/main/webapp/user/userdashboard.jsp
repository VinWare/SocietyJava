<%@include file="../basehead.jsp" %>
	<link rel="stylesheet" href="/societyhub/static/css/userpage_layout.css">
	<link rel="stylesheet" href="/societyhub/static/css/user_dashboard_layout.css">
			<script src="/societyhub/static/js/userDashboard.js"></script>
 <%@include file="../basebody.jsp"%>
<%@ include file="userpage.jsp" %>
	<link rel="stylesheet" href="/societyhub/static/css/user_dashboard_layout.css">
	<script src="/societyhub/static/js/userDashboard.js"></script>
	
<div class="col-md-4 table-div">
	<div id="scrollDiv">
		<table class="table table-hover table-striped">
			<thead>
				<tr class="table-primary text-gray-dark" style="font-size: 1.5em; color: #004d99;">
					<th>Subject</th>
					<th>Date</th>
				</tr>
			</thead>
			<tbody id="notifBody"></tbody>
		</table>
	</div>
	<button class="btn rounded-0 btn-block" id="refreshNotif">Refresh</button>
</div>

<div class="col-md-6" id="notif-div">
	<h1 id="notifSub">SUBJECT</h1>
	<h4 id="notifDate">--/--/----</h4>

	<p id="notifContent"></p>
</div>
</div>
<!-- <%@include file="../basefooter.jsp"%> -->
