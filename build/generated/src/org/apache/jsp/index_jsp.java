package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <title>AdminLTE 2 | Dashboard</title>\n");
      out.write("        <!-- Tell the browser to be responsive to screen width -->\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">\n");
      out.write("        <!-- Bootstrap 3.3.6 -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css\">\n");
      out.write("        <!-- Ionicons -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css\">\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/AdminLTE.min.css\">\n");
      out.write("        <!-- AdminLTE Skins. Choose a skin from the css/skins\n");
      out.write("             folder instead of downloading all of them to reduce the load. -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"dist/css/skins/_all-skins.min.css\">\n");
      out.write("        <!-- iCheck -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/iCheck/flat/blue.css\">\n");
      out.write("        <!-- Morris chart -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/morris/morris.css\">\n");
      out.write("        <!-- jvectormap -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/jvectormap/jquery-jvectormap-1.2.2.css\">\n");
      out.write("        <!-- Date Picker -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/datepicker/datepicker3.css\">\n");
      out.write("        <!-- Daterange picker -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/daterangepicker/daterangepicker.css\">\n");
      out.write("        <!-- bootstrap wysihtml5 - text editor -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css\">\n");
      out.write("\n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>\n");
      out.write("        <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <style type=\"text/css\">\n");
      out.write("            /*Now the CSS*/\n");
      out.write("            .tree ul {\n");
      out.write("                padding-top: 20px; position: relative;\n");
      out.write("                justify-content: center;\n");
      out.write("                transition: all 0.5s;\n");
      out.write("                -webkit-transition: all 0.5s;\n");
      out.write("                -moz-transition: all 0.5s;\n");
      out.write("            }\n");
      out.write("            .tree li {\n");
      out.write("                float: left; text-align: center;\n");
      out.write("                list-style-type: none;\n");
      out.write("                position: relative;\n");
      out.write("                padding: 20px 5px 0 5px;\n");
      out.write("\n");
      out.write("                transition: all 0.5s;\n");
      out.write("                -webkit-transition: all 0.5s;\n");
      out.write("                -moz-transition: all 0.5s;\n");
      out.write("            }\n");
      out.write("            /*We will use ::before and ::after to draw the connectors*/\n");
      out.write("            .tree li::before, .tree li::after{\n");
      out.write("                content: '';\n");
      out.write("                position: absolute; top: 0; right: 50%;\n");
      out.write("                border-top: 1px solid #ccc;\n");
      out.write("                width: 50%; height: 20px;\n");
      out.write("            }\n");
      out.write("            .tree li::after{\n");
      out.write("                right: auto; left: 50%;\n");
      out.write("                border-left: 1px solid #ccc;\n");
      out.write("            }\n");
      out.write("            /*We need to remove left-right connectors from elements without\n");
      out.write("            any siblings*/\n");
      out.write("            .tree li:only-child::after, .tree li:only-child::before {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            /*Remove space from the top of single children*/\n");
      out.write("            .tree li:only-child{ padding-top: 0;}\n");
      out.write("            /*Remove left connector from first child and\n");
      out.write("            right connector from last child*/\n");
      out.write("            .tree li:first-child::before, .tree li:last-child::after{\n");
      out.write("                border: 0 none;\n");
      out.write("            }\n");
      out.write("            /*Adding back the vertical connector to the last nodes*/\n");
      out.write("            .tree li:last-child::before{\n");
      out.write("                border-right: 1px solid #ccc;\n");
      out.write("                border-radius: 0 5px 0 0;\n");
      out.write("                -webkit-border-radius: 0 5px 0 0;\n");
      out.write("                -moz-border-radius: 0 5px 0 0;\n");
      out.write("            }\n");
      out.write("            .tree li:first-child::after{\n");
      out.write("                border-radius: 5px 0 0 0;\n");
      out.write("                -webkit-border-radius: 5px 0 0 0;\n");
      out.write("                -moz-border-radius: 5px 0 0 0;\n");
      out.write("            }\n");
      out.write("            /*Time to add downward connectors from parents*/\n");
      out.write("            .tree ul ul::before{\n");
      out.write("                content: '';\n");
      out.write("                position: absolute; top: 0; left: 50%;\n");
      out.write("                border-left: 1px solid #ccc;\n");
      out.write("                width: 0; height: 20px;\n");
      out.write("            }\n");
      out.write("            .tree li a{\n");
      out.write("                border: 1px solid #ccc;\n");
      out.write("                padding: 5px 10px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #666;\n");
      out.write("                font-family: arial, verdana, tahoma;\n");
      out.write("                font-size: 11px;\n");
      out.write("                display: inline-block;\n");
      out.write("\n");
      out.write("                border-radius: 5px;\n");
      out.write("                -webkit-border-radius: 5px;\n");
      out.write("                -moz-border-radius: 5px;\n");
      out.write("\n");
      out.write("                transition: all 0.5s;\n");
      out.write("                -webkit-transition: all 0.5s;\n");
      out.write("                -moz-transition: all 0.5s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*Time for some hover effects*/\n");
      out.write("            /*We will apply the hover effect the the lineage of the element also*/\n");
      out.write("            .tree li a:hover, .tree li a:hover+ul li a {\n");
      out.write("                background: #c8e4f8; color: #000; border: 1px solid #94a0b4;\n");
      out.write("            }\n");
      out.write("            /*Connector styles on hover*/\n");
      out.write("            .tree li a:hover+ul li::after,\n");
      out.write("            .tree li a:hover+ul li::before,\n");
      out.write("            .tree li a:hover+ul::before,\n");
      out.write("            .tree li a:hover+ul ul::before{\n");
      out.write("                border-color:  #94a0b4;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*Thats all. I hope you enjoyed it.\n");
      out.write("            Thanks :)*/\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"hold-transition skin-blue sidebar-mini\">\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("            <header class=\"main-header\">\n");
      out.write("                <!-- Logo -->\n");
      out.write("                <a href=\"index2.html\" class=\"logo\">\n");
      out.write("                    <!-- mini logo for sidebar mini 50x50 pixels -->\n");
      out.write("                    <span class=\"logo-mini\"><b>A</b>LT</span>\n");
      out.write("                    <!-- logo for regular state and mobile devices -->\n");
      out.write("                    <span class=\"logo-lg\"><b>Admin</b>LTE</span>\n");
      out.write("                </a>\n");
      out.write("                <!-- Header Navbar: style can be found in header.less -->\n");
      out.write("                <nav class=\"navbar navbar-static-top\">\n");
      out.write("                    <!-- Sidebar toggle button-->\n");
      out.write("                    <a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\n");
      out.write("                        <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    </a>\n");
      out.write("\n");
      out.write("                    <div class=\"navbar-custom-menu\">\n");
      out.write("                        <ul class=\"nav navbar-nav\">\n");
      out.write("\n");
      out.write("                            <!-- User Account: style can be found in dropdown.less -->\n");
      out.write("                            <li class=\"dropdown user user-menu\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                    <img src=\"dist/img/user2-160x160.jpg\" class=\"user-image\" alt=\"User Image\">\n");
      out.write("                                    <span class=\"hidden-xs\">Alexander Pierce</span>\n");
      out.write("                                </a>\n");
      out.write("                                <ul class=\"dropdown-menu\">\n");
      out.write("                                    <!-- User image -->\n");
      out.write("                                    <li class=\"user-header\">\n");
      out.write("                                        <img src=\"dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("\n");
      out.write("                                        <p>\n");
      out.write("                                            Alexander Pierce - Web Developer\n");
      out.write("                                            <small>Member since Nov. 2012</small>\n");
      out.write("                                        </p>\n");
      out.write("                                    </li>\n");
      out.write("                                    <!-- Menu Body -->\n");
      out.write("                                    <li class=\"user-body\">\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-xs-4 text-center\">\n");
      out.write("                                                <a href=\"#\">Followers</a>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-xs-4 text-center\">\n");
      out.write("                                                <a href=\"#\">Sales</a>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"col-xs-4 text-center\">\n");
      out.write("                                                <a href=\"#\">Friends</a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <!-- /.row -->\n");
      out.write("                                    </li>\n");
      out.write("                                    <!-- Menu Footer-->\n");
      out.write("                                    <li class=\"user-footer\">\n");
      out.write("                                        <div class=\"pull-left\">\n");
      out.write("                                            <a href=\"#\" class=\"btn btn-default btn-flat\">Profile</a>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"pull-right\">\n");
      out.write("                                            <a href=\"#\" class=\"btn btn-default btn-flat\">Sign out</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </li>\n");
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </header>\n");
      out.write("            <!-- Left side column. contains the logo and sidebar -->\n");
      out.write("            <aside class=\"main-sidebar\">\n");
      out.write("                <!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("                <section class=\"sidebar\">\n");
      out.write("                    <!-- Sidebar user panel -->\n");
      out.write("                    <div class=\"user-panel\">\n");
      out.write("                        <div class=\"pull-left image\">\n");
      out.write("                            <img src=\"dist/img/user2-160x160.jpg\" class=\"img-circle\" alt=\"User Image\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"pull-left info\">\n");
      out.write("                            <p>Alexander Pierce</p>\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-circle text-success\"></i> Online</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- search form -->\n");
      out.write("                    <form action=\"#\" method=\"get\" class=\"sidebar-form\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"text\" name=\"q\" class=\"form-control\" placeholder=\"Search...\">\n");
      out.write("                            <span class=\"input-group-btn\">\n");
      out.write("                                <button type=\"submit\" name=\"search\" id=\"search-btn\" class=\"btn btn-flat\"><i class=\"fa fa-search\"></i>\n");
      out.write("                                </button>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <!-- /.search form -->\n");
      out.write("                    <!-- sidebar menu: : style can be found in sidebar.less -->\n");
      out.write("                    <ul class=\"sidebar-menu\">\n");
      out.write("                        <li class=\"header\">MAIN NAVIGATION</li>\n");
      out.write("                        <li class=\"active treeview\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <i class=\"fa fa-dashboard\"></i> <span>Dashboard</span>\n");
      out.write("                                <span class=\"pull-right-container\">\n");
      out.write("                                    <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                                </span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"treeview-menu\">\n");
      out.write("                                <li class=\"active\"><a href=\"index.html\"><i class=\"fa fa-circle-o\"></i> Dashboard v1</a></li>\n");
      out.write("                                <li><a href=\"index2.html\"><i class=\"fa fa-circle-o\"></i> Dashboard v2</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </section>\n");
      out.write("                <!-- /.sidebar -->\n");
      out.write("            </aside>\n");
      out.write("\n");
      out.write("            <!-- Content Wrapper. Contains page content -->\n");
      out.write("            <div class=\"content-wrapper\">\n");
      out.write("                <!-- Content Header (Page header) -->\n");
      out.write("                <section class=\"content-header\">\n");
      out.write("                    <h1>\n");
      out.write("                        Dashboard\n");
      out.write("                        <small>Control panel</small>\n");
      out.write("                    </h1>\n");
      out.write("                    <ol class=\"breadcrumb\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"fa fa-dashboard\"></i> Home</a></li>\n");
      out.write("                        <li class=\"active\">Dashboard</li>\n");
      out.write("                    </ol>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <!-- Main content -->\n");
      out.write("                <section class=\"content\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <!-- /.row (main row) -->\n");
      out.write("                    <div class=\"row\" style=\"justify-content: center;\">\n");
      out.write("                        <section class=\"col-lg-12 connectedSortable\">\n");
      out.write("                            <div class=\"tree\" style=\"height: 250px; width: 100%;\">\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\" class=\"btn\" role=\"button\">\n");
      out.write("                                            <div style=\" display: inline-block;\" class=\"btn-info\" data-toggle=\"tooltip\" title=\"Đà nẵng\" data-placement=\"bottom\">                          \n");
      out.write("                                                <img class=\"w3-circle\" style=\"width: 100px;height: 100px;\" src=\"img/profile.jpg\" alt=\"Person\">\n");
      out.write("                                                <div class=\"w3-container\">\n");
      out.write("                                                    <h4><b>Ông</b></h4>\n");
      out.write("                                                    <p>26/01/1995 - 20/20/2200</p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div style=\" display: inline-block;\" class=\"btn-warning\" data-toggle=\"tooltip\" title=\"Quảng nam\" data-placement=\"bottom\">\n");
      out.write("                                                <img class=\"w3-circle\" style=\"width: 100px;height: 100px;\" src=\"img/profile.jpg\" alt=\"Person\">\n");
      out.write("                                                <div class=\"w3-container\">\n");
      out.write("                                                    <h4><b>Bà</b></h4>\n");
      out.write("                                                    <p>26/01/1995 - 20/20/2200</p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div style=\" display: inline-block;\" class=\"btn-danger\">\n");
      out.write("                                                <img class=\"w3-circle\" style=\"width: 100px;height: 100px;\" src=\"img/profile.jpg\" alt=\"Person\">\n");
      out.write("                                                <div class=\"w3-container\">\n");
      out.write("                                                    <h4><b>Bà</b></h4>\n");
      out.write("                                                    <p>26/01/1995 - 20/20/2200</p>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </a>\n");
      out.write("                                        <ul>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-info\" role=\"button\">\n");
      out.write("                                                    <img style=\"width: 100px;height: 100px;\" src=\"img/profile.jpg\" alt=\"Person\">\n");
      out.write("                                                    <div class=\"w3-container\">\n");
      out.write("                                                        <h4><b>Lê Minh Trung</b></h4>\n");
      out.write("                                                        <p>26/01/1995 - 20/20/2200</p>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                </a>\n");
      out.write("                                                <ul>\n");
      out.write("                                                    <li>\n");
      out.write("                                                        <a href=\"#\" class=\"btn btn-info\" role=\"button\">\n");
      out.write("                                                            <img style=\"width: 100px;height: 100px;\" src=\"img/profile.jpg\" alt=\"Person\">\n");
      out.write("                                                            <div class=\"w3-container\">\n");
      out.write("                                                                <h4><b>Lê Minh Trung</b></h4>\n");
      out.write("                                                                <p>26/01/1995 - 20/20/2200</p>\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                        </a>\n");
      out.write("                                                    </li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li>\n");
      out.write("                                                <a href=\"#\" class=\"btn btn-info\" role=\"button\">\n");
      out.write("                                                    <img style=\"width: 100px;height: 100px;\" src=\"img/profile.jpg\" alt=\"Person\">\n");
      out.write("                                                    <div class=\"w3-container\">\n");
      out.write("                                                        <h4><b>Lê Minh Trung</b></h4>\n");
      out.write("                                                        <p>26/01/1995 - 20/20/2200</p>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                </a>\n");
      out.write("                                                <ul>\n");
      out.write("                                                    <li><a href=\"#\" class=\"btn btn-info\" role=\"button\">\n");
      out.write("                                                            <img style=\"width: 100px;height: 100px;\" src=\"img/profile.jpg\" alt=\"Person\">\n");
      out.write("                                                            <div class=\"w3-container\">\n");
      out.write("                                                                <h4><b>Lê Minh Trung</b></h4>\n");
      out.write("                                                                <p>26/01/1995 - 20/20/2200</p>\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                        </a></li>\n");
      out.write("                                                    <li>\n");
      out.write("                                                        <a href=\"#\" class=\"btn btn-info\" role=\"button\">\n");
      out.write("                                                            <img style=\"width: 100px;height: 100px;\" src=\"img/profile.jpg\" alt=\"Person\">\n");
      out.write("                                                            <div class=\"w3-container\">\n");
      out.write("                                                                <h4><b>Lê Minh Trung</b></h4>\n");
      out.write("                                                                <p>26/01/1995 - 20/20/2200</p>\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                        </a>\n");
      out.write("                                                        <ul>\n");
      out.write("                                                            <li>\n");
      out.write("                                                                <a href=\"#\" class=\"btn btn-info\" role=\"button\">\n");
      out.write("                                                                    <img style=\"width: 100px;height: 100px;\" src=\"img/profile.jpg\" alt=\"Person\">\n");
      out.write("                                                                    <div class=\"w3-container\">\n");
      out.write("                                                                        <h4><b>Lê Minh Trung</b></h4>\n");
      out.write("                                                                        <p>26/01/1995 - 20/20/2200</p>\n");
      out.write("                                                                    </div>\n");
      out.write("\n");
      out.write("                                                                </a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                            <li>\n");
      out.write("                                                                <a href=\"#\" class=\"btn btn-info\" role=\"button\">\n");
      out.write("                                                                    <img style=\"width: 100px;height: 100px;\" src=\"img/profile.jpg\" alt=\"Person\">\n");
      out.write("                                                                    <div class=\"w3-container\">\n");
      out.write("                                                                        <h4><b>Lê Minh Trung</b></h4>\n");
      out.write("                                                                        <p>26/01/1995 - 20/20/2200</p>\n");
      out.write("                                                                    </div>\n");
      out.write("\n");
      out.write("                                                                </a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                            <li>\n");
      out.write("                                                                <a href=\"#\" class=\"btn btn-info\" role=\"button\">\n");
      out.write("                                                                    <img style=\"width: 100px;height: 100px;\" src=\"img/profile.jpg\" alt=\"Person\">\n");
      out.write("                                                                    <div class=\"w3-container\">\n");
      out.write("                                                                        <h4><b>Lê Minh Trung</b></h4>\n");
      out.write("                                                                        <p>26/01/1995 - 20/20/2200</p>\n");
      out.write("                                                                    </div>\n");
      out.write("\n");
      out.write("                                                                </a>\n");
      out.write("                                                            </li>\n");
      out.write("                                                        </ul>\n");
      out.write("                                                    </li>\n");
      out.write("                                                    <li><a href=\"#\">Grand Child</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                            <script>\n");
      out.write("                                $(document).ready(function () {\n");
      out.write("                                    $('[data-toggle=\"tooltip\"]').tooltip();\n");
      out.write("                                });\n");
      out.write("                            </script>\n");
      out.write("\n");
      out.write("                        </section>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("                <!-- /.content -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /.content-wrapper -->\n");
      out.write("            <footer class=\"main-footer\">\n");
      out.write("                <div class=\"pull-right hidden-xs\">\n");
      out.write("                    <b>Version</b> 2.3.7\n");
      out.write("                </div>\n");
      out.write("                <strong>Copyright &copy; 2014-2016 <a href=\"http://almsaeedstudio.com\">Almsaeed Studio</a>.</strong> All rights\n");
      out.write("                reserved.\n");
      out.write("            </footer>\n");
      out.write("\n");
      out.write("            <!-- Control Sidebar -->\n");
      out.write("\n");
      out.write("            <!-- /.control-sidebar -->\n");
      out.write("            <!-- Add the sidebar's background. This div must be placed\n");
      out.write("                 immediately after the control sidebar -->\n");
      out.write("            <div class=\"control-sidebar-bg\"></div>\n");
      out.write("        </div>\n");
      out.write("        <!-- ./wrapper -->\n");
      out.write("\n");
      out.write("        <!-- jQuery 2.2.3 -->\n");
      out.write("        <script src=\"plugins/jQuery/jquery-2.2.3.min.js\"></script>\n");
      out.write("        <!-- jQuery UI 1.11.4 -->\n");
      out.write("        <script src=\"https://code.jquery.com/ui/1.11.4/jquery-ui.min.js\"></script>\n");
      out.write("        <!-- Resolve conflict in jQuery UI tooltip with Bootstrap tooltip -->\n");
      out.write("        <script>\n");
      out.write("                                $.widget.bridge('uibutton', $.ui.button);\n");
      out.write("        </script>\n");
      out.write("        <!-- Bootstrap 3.3.6 -->\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("        <!-- Morris.js charts -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js\"></script>\n");
      out.write("        <script src=\"plugins/morris/morris.min.js\"></script>\n");
      out.write("        <!-- Sparkline -->\n");
      out.write("        <script src=\"plugins/sparkline/jquery.sparkline.min.js\"></script>\n");
      out.write("        <!-- jvectormap -->\n");
      out.write("        <script src=\"plugins/jvectormap/jquery-jvectormap-1.2.2.min.js\"></script>\n");
      out.write("        <script src=\"plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\n");
      out.write("        <!-- jQuery Knob Chart -->\n");
      out.write("        <script src=\"plugins/knob/jquery.knob.js\"></script>\n");
      out.write("        <!-- daterangepicker -->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/moment.js/2.11.2/moment.min.js\"></script>\n");
      out.write("        <script src=\"plugins/daterangepicker/daterangepicker.js\"></script>\n");
      out.write("        <!-- datepicker -->\n");
      out.write("        <script src=\"plugins/datepicker/bootstrap-datepicker.js\"></script>\n");
      out.write("        <!-- Bootstrap WYSIHTML5 -->\n");
      out.write("        <script src=\"plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js\"></script>\n");
      out.write("        <!-- Slimscroll -->\n");
      out.write("        <script src=\"plugins/slimScroll/jquery.slimscroll.min.js\"></script>\n");
      out.write("        <!-- FastClick -->\n");
      out.write("        <script src=\"plugins/fastclick/fastclick.js\"></script>\n");
      out.write("        <!-- AdminLTE App -->\n");
      out.write("        <script src=\"dist/js/app.min.js\"></script>\n");
      out.write("        <!-- AdminLTE dashboard demo (This is only for demo purposes) -->\n");
      out.write("        <script src=\"dist/js/pages/dashboard.js\"></script>\n");
      out.write("        <!-- AdminLTE for demo purposes -->\n");
      out.write("        <script src=\"dist/js/demo.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}