<%@include file="../header.jsp" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <h1> Edit Player </h1>
    <form:form modelAttribute="player" role="form" action="${SITE_URL}/admin/player/save">
            <div class="form-group">
                <label>First Name</label>
                <form:input path="firstName" class="form-control"  required="required" placeholder="Enter First Name"/>
            </div>
            <div class="form-group">
                <label>Last Name</label>
                <form:input path="lastName" class="form-control"  required="required" placeholder="Enter Last Name"/>
            </div>
            <div class="form-group">
                <label>Email</label>
                <form:input path="email" class="form-control"  required="required" placeholder="Enter Email"/>
            </div>
            <div class="form-group">
                <label>Squad Position</label>
                <form:input path="squadPosition" class="form-control"  required="required" placeholder="Enter Position"/>
            </div>
            <div class="form-group">
                <label>Contact No:</label>
                <form:input path="contactNo" class="form-control"  required="required" placeholder="Enter Contact Number"/>
            </div>
            <div class="checkbox">
                <label>
                    <form:checkbox path="status"/> Status:
                </label>        
            </div>
                    <form:hidden path="id"/>
                    <button type="submit" class="btn btn-success">Save</button>
                    <a href="${SITE_URL}/admin/player/" class="btn btn-danger">Cancel</a>
        </form:form>
<%@include file="../footer.jsp" %>