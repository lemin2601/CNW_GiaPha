$(function () {
//Date picker
    $('#datepicker-birth-day').datepicker({
        autoclose: true
    });
    $('#datepicker-dead-day').datepicker({
        autoclose: true
    });
});
$(".view-item").dblclick(function () {
//alert("Hello World!");
    console.log("click to view form people");
    //jQuery.noConflict(); 
    $('#create-item').modal();
});
$("#btn-them-gia-pha").click(function () {
//alert("Hello World!");
    console.log("click to view form giapha");
    //jQuery.noConflict(); 
    $('#form-create-genealogy').modal({
        backdrop: 'static',
        keyboard: false
    });
});

