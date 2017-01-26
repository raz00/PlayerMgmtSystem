<%@include file="../header.jsp" %>
<h1>Welcome to Nepal Football Club</h1>
<p> </p>
        <div class="pull-right">   
            <p>
                <a href="${SITE_URL}/admin/player/add" class="btn btn-primary btn-sm">
                            <span class ="glyphicon glyphicon-plus" ></span></a>
            </p>
        </div>
        <table class="table table-bordered table-striped table-hover ">
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Email</th>
                <th>Position</th>
                <th>Contact</th>
                <th>Status</th>
                <th>Action</th>
            </tr>
            <c:forEach var="player" items="${players}">
                <tr>
                    <td>${player.id}</td>
                    <td>${player.firstName} ${player.lastName}</td>
                    <td>${player.email}</td>
                    <td>${player.squadPosition}</td>
                    <td>${player.contactNo}</td>
                    <td>${player.status}</td>
                    <td>    
                        <a href="${SITE_URL}/admin/player/edit/${player.id}" class="btn btn-success btn-xs">
                            <span class ="glyphicon glyphicon-pencil" ></span></a>
                        <a href="${SITE_URL}/admin/player/delete/${player.id}" class="btn btn-danger btn-xs" onclick="return confirm('Are you sure to delete?')">
                            <span class="glyphicon glyphicon-trash"></span></a>
                    </td>
                </tr>
            </c:forEach>
        </table>
<%@include file="../footer.jsp" %>