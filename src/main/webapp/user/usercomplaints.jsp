<%@ page import="java.util.*"%>
<%@ page import="org.vvar.societyhub.beans.*"%>
<%@include file="../basehead.jsp" %>
	<link rel="stylesheet" href="static/css/userpage_layout.css">
	<link rel="stylesheet" href="static/css/user_dashboard_layout.css">
 <%@include file="../basebody.jsp"%>
<%@ include file="userpage.jsp" %>
	<link rel="stylesheet" href="static/css/user_complaints_layout.css">


	<div class="col-md-10">
		<form action="/societyhub/issues" method="post">
			<div>
				<h1 class="mHeader">Issues</h1>
				<div class="form-group">
					<label for="relatedTo">Choose the category of your issue:</label>
					<select class="form-control" name="relatedTo">
						<option value="Stationary">Stationary</option>
						<option value="Pool Facilities">Pool Facilities</option>
						<option value="Gardening">Gardening</option>
						<option value="Accounts">Accounts</option>
						<option value="Miscelllaneous">Miscelllaneous</option>
					</select>
				</div>
				<div class="form-group">
					<label class="mLabel" for="complaints">Please let us know about any grieviences you have here:</label>
					<textarea class="form-control" rows="5" id="complaints" name="complaints"></textarea>
				</div>
				<input type="submit" class="btn btn-primary btn-lg" style="margin: 1vh 1vh 2vh 1vh;" value="Submit" />
				<a href="/issues" class="btn btn-danger btn-lg" style="margin: 1vh 1vh 2vh 1vh;">Cancel</a>
			</div>
		</form>
		<br/>
		<div class="container" style="margin: auto; padding: 1em;">
			<table class="table table-bordered table-striped">
				<thead class="thead-dark">
					<tr>
						<th>Date</th>
						<th>Related to</th>
						<th>Description</th>
					</tr>
				</thead>
				<tbody>
				<%
				List<Issue> issuesList = (ArrayList<Issue>)request.getAttribute("issuesList");
				for(Issue issue : issuesList)  {%>
					<tr>
						<td><%= issue.getDate() %></td>
						<td><%= issue.getRelated() %></td>
						<td><%= issue.getDesc() %></td>
					</tr>
					<% } %>
				</tbody>
			</table>
		</div>

	</div>
	</div>

