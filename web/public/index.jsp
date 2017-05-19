<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">-->
        <!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>-->
        <!--<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>-->


        <title>Welcome to login system</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">   
        <!--<link href="../bootstrap/css/bootstrap.min.css" rel="stylesheet" >-->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link href="../bootstrap/css/w3.css" rel="stylesheet" >
        <link href="../bootstrap/css/bootstrap-select.min.css" rel="stylesheet" >
        <!--css danh cho select-->
        <link rel="stylesheet" href="../bootstrap/css/bootstrap-select.css">
        <link rel="stylesheet" href="https://cdn.rawgit.com/tonystar/bootstrap-float-label/v3.0.0/dist/bootstrap-float-label.css">



        <link href="//cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/css/toastr.min.css" rel="stylesheet">
        <!--dành cho tree & zoom-->
        <script src="../zoom/libs/jquery.js"></script>
        <script src="../zoom/dist/jquery.panzoom.js"></script>
        <script src="../zoom/libs/jquery.mousewheel.js"></script>
        <link href="../mystyle/tree.css" rel="stylesheet">
        <!--css login & register form-->
        <link href="../mystyle/login.css" rel="stylesheet">
        <!--css cho form table gia pha-->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.4.0/css/font-awesome.min.css" rel='stylesheet' type='text/css'>
        <!-- bootstrap datepicker -->
        <link rel="stylesheet" href="../plugins/datepicker/datepicker3.css">
    </head>
    <body>
        <jsp:include page="header.jsp"></jsp:include>

            <!--Menu thu phong-->
            <div class="container-fluid " >
                <div class="col-sm-12">
                    <div class="col-sm-1">
                        <button id="btn-them-gia-pha" type="button" class="btn btn-block btn-success"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Thêm gia phả</button>

                    </div>
                    <div class="col-sm-3">
                        <div class="form-group has-float-label">
                            <select class="form-control selectpicker" data-live-search="true" data-width="100%" id="guide-genealogy">
                                <option selected>United States</option>
                                <option>Tộc Lê</option>
                                <option>Tộc Nguyễn</option>
                                <option>Tộc Trần</option>
                            </select>
                            <label for="guide-genealogy">Gia phả</label>
                        </div>
                    </div>
                    <div class="col-sm-3">
                        <div class="form-group has-float-label">
                            <select class="form-control selectpicker" data-live-search="true" data-width="100%" id="guide-name">
                                <option selected>United States</option>
                                <option>Nguyễn Văn Tèo</option>
                                <option>Trần Thị Tươi</option>
                                <option>Trường công mạnh</option>
                            </select>
                            <label for="guide-name">Họ & Tên</label>
                        </div>

                    </div>
                    <div class="col-sm-1">
                        <div class="form-group has-float-label">
                            <select class="form-control selectpicker" data-live-search="true" data-width="100%" id="guide-deep-genealogy">
                                <option>2</option>
                                <option>3</option>
                                <option>4</option>
                                <option>5</option>
                                <option>6</option>
                            </select>
                            <label for="guide-deep-genealogy">Sâu nhánh</label>
                        </div>
                    </div>

                    <div class="col-sm-2">
                        <button id="btn-xem-gia-pha" type="button" class="btn btn-info btn-block navbar-right"><span class="glyphicon glyphicon-search" aria-hidden="true"></span> Xem</button>

                    </div>
                    <div class="col-sm-2">
                        <button id="btn-zoom-plus" type="button" class="btn navbar-right"><span class="glyphicon glyphicon-plus" aria-hidden="true"></span></button>
                        <button id="btn-zoom-refresh" type="button" class="btn navbar-right"><span class="glyphicon glyphicon-refresh" aria-hidden="true"></span></button>
                        <button id="btn-zoom-minus" type="button" class="btn navbar-right"><span class="glyphicon glyphicon-minus" aria-hidden="true"></span></button>
                    </div>






                </div>
            </div>
            <!--khu vuc ve cay gia pha-->
        <jsp:include page="../form/grid-gia-pha-temp.jsp"></jsp:include>

        <%--<%@include  file="../form/grid-gia-pha-temp.html" %>--%>

        <!-- form-create-genealogy -->
        <div class="modal fade" id="form-create-genealogy" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">Ã</span></button>
                        <h4 class="modal-title" id="myModalLabel">Create new genealogy</h4>
                    </div>
                    <div class="modal-body" >
                        <form data-toggle="validator" id="form-create-genealogy-submit" action="Genealogy" method = "post">
                            <input type="hidden" name="command" value="creategenealogy">
                            <input type="hidden" name="id" class="create-id">
                            
                            <div class="form-group">
                                <label>Name</label>
                                <input name="name" type="text" class="form-control" placeholder="Name genealogy" required >
                                <div class="help-block with-errors"></div>
                            </div>
                            
                            <div class="form-group">
                                <label >Description:</label>
                                <textarea type="text" name="description" class="form-control" placeholder="Description" ></textarea>
                                <div class="help-block with-errors"></div>
                            </div>
                            <div class="form-group">
                                <div id='message-form-create-genealogy' class="col-sm-offset-2 col-sm-10"></div>
                            </div>
                            <div class="form-group">
                                <button type="submit"  class="btn btn-block btn-success " >Create</button>
                                <button  data-dismiss="modal" class="btn btn-block btn-warning">Close</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
        <!--Một số form cần thiết-->
        <%@include  file="../form/view-add-create-edit-people.jsp" %>

        <%@include  file="../form/view-create-edit-item.html" %>
        <%@include  file="../form/login-register.html" %>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <!--<script src="../bootstrap/js/jquery.min.js"></script>-->
        <!--<script src="../bootstrap/js/bootstrap.min.js"></script>-->
        <script src="../myjs/login.js"></script>
        <script src="../myjs/index.js"></script>
        <script src="../myjs/view-add-create-edit-genealogy.js"></script>
        
        <!-- bootstrap datepicker -->
        <script src="../plugins/datepicker/bootstrap-datepicker.js"></script>
        <!--dành cho validate & toast-->
        <!--<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.0/jquery.js"></script>-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.11.5/validator.min.js"></script>
        <script type="text/javascript" src="//cdnjs.cloudflare.com/ajax/libs/toastr.js/latest/js/toastr.min.js"></script>
        <script src="../myjs/createtree.js"></script>
        <!--js dành cho select https://silviomoreto.github.io/bootstrap-select/examples/#basic-examples -->
        <script src="../bootstrap/js/bootstrap-select.js"></script>
        <%--<jsp:include page="login.html"></jsp:include>--%>
        <jsp:include page="footer.jsp"></jsp:include>
    </body>
</html>
