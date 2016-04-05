<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>				
				
<section role="main" class="content-body">
	<header class="page-header">
		<h2>Dashboard</h2>
	</header>

    <div class="row">
        <div class="col-md-2">
        </div>
        <div class="col-md-8">
            <section class="panel">
                <header class="panel-heading">
                    <div class="panel-actions">
                        <a href="#" class="panel-action panel-action-toggle" data-panel-toggle></a>
                        <a href="#" class="panel-action panel-action-dismiss" data-panel-dismiss></a>
                    </div>
                    <h2 class="panel-title text-center">Manage News</h2>
                </header>
                <div class="panel-body">
                    <table class="display table table-bordered table-striped" id="datatable-media">
                        <thead>
                        <tr>
                            <th width="60%" class="text-center">News Text</th>
                            <th width="10%" class="text-center">Display From</th>
                            <th width="10%" class="text-center">Display To</th>
                            <th width="10%" class="text-center">Date Created</th>
                            <th width="10%" class="text-center">Actions</th>
                        </tr>
                        </thead>
                        <tbody>

                        <c:forEach var="itemVar" items="${items}">

                            <tr>

                                <td>${itemVar.newsText}</td>
                                <td><fmt:formatDate value="${itemVar.displayFrom}" pattern="MMM-dd-yyyy"/></td>
                                <td><fmt:formatDate value="${itemVar.displayTo}" pattern="MMM-dd-yyyy"/></td>
                                <td><fmt:formatDate value="${itemVar.createdDate}" pattern="MMM-dd-yyyy"/></td>
                                <td><a href="${pageContext.request.contextPath}/news/delete?id=${itemVar.id}">Delete</a></td>

                            </tr>

                        </c:forEach>

                        </tbody>
                    </table>

                    <script type="text/javascript">

                        $(document).ready(function() {
                            $('#datatable-media').DataTable();
                        } );

                    </script>

                </div>
            </section>
        </div>
        <div class="col-md-2">
        </div>
    </div>

</section>