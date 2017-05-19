$(document).ready(function () {

    /* Create new genealogy */
    $("#form-create-genealogy-submit").submit(function (e) {
        e.preventDefault();

        alert("Handler for .submit() called.");
        console.log($(this).attr('action')+$(this).attr('method'));
        $("#form-create-genealogy-submit").trigger("reset");
//         $.ajax({
//            type: 'post',
//            url: 'User',
//            data: $(this).serialize(),
//            beforeSend: function () {
//                $("#message-form-create-genealogy").html("<img src='img/ajax-loader.gif' /> Loading...");
//            },
//            error: function (xhr, ajaxOptions, thrownError) {
//                $("#message-form-create-genealogy").html("<p style ='color:red;'>Can't connect to server, try again.</p>");
//            },
//            success: function (data) {
//                if (data == "pass") {
//                    $("#message-form-create-genealogy").html("<p style ='color:red;'>Password doesn't matched.</p>");
//                } else if (data == "user") {
//                    $("#message-form-create-genealogy").html("<p style ='color:red;'>Username have been used.<a href='login.jsp'>Login here</a></p>");
//                } else if (data == "success") {
//                    $("#message-form-create-genealogy").html("<p style ='color:green;'>Register success, <a href='login.jsp'>Login here</a></p>");
//                    $("#form-create-genealogy-submit").reset();
//                }
//                //alert(data);
//                //$("#message").html(data);
//            }
//        });
        return false;
//        var form_name = $(this).attr('name').val();
//        console.log(form_name);

    });
//    $('.form-create-genealogy').on('submit', function (e) {
//        var url = $(this).attr("action").val();
//        var type = $(this).attr("method").val();
//        console.log("url:" + url + "|" + type);
//        
//        $.ajax({
//            type: 'post',
//            url: 'User',
//            data: ,
//            beforeSend: function () {
//                $("#message").html("<img src='img/ajax-loader.gif' /> Loading...");
//            },
//            error: function (xhr, ajaxOptions, thrownError) {
//                $("#message").html("<p style ='color:red;'>Can't connect to server, try again.</p>");
//            },
//            success: function (data) {
//                if (data == "pass") {
//                    $("#message").html("<p style ='color:red;'>Password doesn't matched.</p>");
//                } else if (data == "user") {
//                    $("#message").html("<p style ='color:red;'>Username have been used.<a href='login.jsp'>Login here</a></p>");
//                } else if (data == "success") {
//                    $("#message").html("<p style ='color:green;'>Register success, <a href='login.jsp'>Login here</a></p>");
//                    document.form.reset();
//                }
//                //alert(data);
//                //$("#message").html(data);
//            }
//        });
//        return false;
//    });
//    $(".create-item-submit").click(function (e) {
//        e.preventDefault();
//        var form_action = "User";
//        var command = $("#create-item").find("input[name='command']").val();
//        var username = $("#create-item").find("input[name='username']").val();
//        var password = $("#create-item").find("input[name='password']").val();
//        var password2 = $("#create-item").find("input[name='password2']").val();
//        var lastname = $("#create-item").find("input[name='lastname']").val();
//        var firstname = $("#create-item").find("input[name='firstname']").val();
//        if (password != '' && password2 == password && username != '') {
//            $.ajax({
//                type: 'POST',
//                url: url,
//                data: {command: command, username: username, password: password, password2: password2, firstname: firstname, lastname: lastname},
//
//                beforeSend: function () {
//                    $("#message-create").html("<img src='img/ajax-loader.gif' /> Loading...");
//                },
//                error: function (xhr, ajaxOptions, thrownError) {
//                    $("#message-create").html("<p style ='color:red;'>Can't connect to server, try again.</p>");
//                },
//                success: function (data) {
//                    if (data == "pass") {
//                        $("#message-create").html("<p style ='color:red;'>Password doesn't matched.</p>");
//                    } else if (data == "user") {
//                        $("#message-create").html("<p style ='color:red;'>Username have been used.<a href='login.jsp'>Login here</a></p>");
//                    } else if (data == "success") {
//                        $("#message-create").html("<p style ='color:green;'>Register success, <a href='login.jsp'>Login here</a></p>");
//                        $("#create-item").find("input[name='username']").val('');
//                        $("#create-item").find("input[name='password']").val('');
//                        $("#create-item").find("input[name='password2']").val('');
//                        $("#create-item").find("input[name='lastname']").val('');
//                        $("#create-item").find("input[name='firstname']").val('');
//                        toastr.success('Item Created Successfully.', 'Success Alert', {positionClass: 'toast-bottom-right'}, {timeOut: 3000});
//                        getPageData();
//                    }
//                }
//            });
//        } else {
//            toastr.error('You are hack me. Try again', 'Error Alert', {positionClass: 'toast-bottom-right'}, {timeOut: 3000});
//        }
//    });


});


