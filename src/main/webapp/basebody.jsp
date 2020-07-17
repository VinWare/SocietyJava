</head>

<body>
<!-- HEADER -->
<header class="row">
    <div class="col-md-7">
        <h0>
            <a id="logo" href="/" data-toggle="tooltip" title="Go to Society Hub homepage">Society Hub</a>
        </h0>
    </div>

    <!-- IF THE USER ARGUMENT IS PASSED< A USER NAME AND LOGO WILL APPEAR-->
    <%
    String ownerName=(String)session.getAttribute("ownerName");
    if(ownerName != null) {
    %>
    <div class="col-md-6">
        <a class="btn btn-light float-right" style="margin-bottom: 9px;" href="dashboard" id="userIcon">Welcome <%= ownerName %></a>
    </div>
    <div class="col-md-2">
        <a class="btn btn-dark float-right" href="logout">Logout</a>
    </div>
    <% } %>
</header>
