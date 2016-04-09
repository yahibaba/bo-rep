<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<section role="main" class="content-body">
    <header class="page-header">
        <h2>Dashboard</h2>
    </header>

    <div class="row">

        <div class="col-md-2"></div>
        <div class="col-md-8">

            <form:form id="form2" action="${pageContext.request.contextPath}/item/create" cssClass="form-horizontal form-bordered" method="POST" commandName="itemBean"  enctype="multipart/form-data">
                <section class="panel">
                    <header class="panel-heading">
                        <div class="panel-actions">
                            <a href="#" class="panel-action panel-action-toggle" data-panel-toggle></a>
                            <a href="#" class="panel-action panel-action-dismiss" data-panel-dismiss></a>
                        </div>
                        <h2 class="panel-title text-center">Upload New Prayer Times CSV File</h2>
                    </header>
                    <div class="panel-body">

                        <div class="form-group">
                            <label class="col-sm-4 control-label" for="inputSuccess">Display File Name</label>
                            <div class="col-sm-8">
                                <form:input path="displayName" />
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-4 control-label" for="inputSuccess">Select Month</label>
                            <div class="col-sm-8">
                                <form:select path="month" items="${months}"/>
                            </div>
                        </div>


                        <div class="form-group">
                            <label class="col-sm-4 control-label">File Upload</label>
                            <div class="col-sm-8">
                                <div class="fileupload fileupload-new" data-provides="fileupload">
                                    <div class="input-append">
                                        <div class="uneditable-input">
                                            <i class="fa fa-file fileupload-exists"></i>
                                            <span class="fileupload-preview"></span>
                                        </div>
														<span class="btn btn-default btn-file">
															<span class="fileupload-exists">Change</span>
															<span class="fileupload-new">Select file</span>
															<input type="file" name="attachments[0]" class="form-control">
														</span>
                                        <a href="#" class="btn btn-default fileupload-exists" data-dismiss="fileupload">Remove</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <form:hidden path="itemType"/>

                    </div>
                    <footer class="panel-footer text-center">
                        <button class="btn btn-primary">Submit</button>
                        <button type="reset" class="btn btn-default">Reset</button>
                    </footer>
                </section>
            </form:form>
        </div>
        <div class="col-md-2"></div>
    </div>

</section>