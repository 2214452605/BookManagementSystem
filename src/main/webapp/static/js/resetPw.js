window.onload=function () {
    $('[data-toggle="tooltip"]').tooltip();
    //抽取添加错误样式函数
    function AddStyleByError(obj,tip,log) {
        $("#"+tip).addClass("has-error text-danger");
        $("#div_for_"+obj).addClass("has-error");
        $("#"+log).addClass("glyphicon-remove");
    }


    function setOnfocus(obj,tip,log){
        $("#"+obj).on("focus",function () {
            $("#"+tip).removeClass("has-error text-danger");
            $("#"+tip).html("");
            $("#div_for_"+obj).removeClass("has-error");
            $("#"+log).removeClass("glyphicon-remove");
        });
    }

    setOnfocus("userPassword","tip2","log_img2");
    setOnfocus("userPassword1","tip3","log_img3");


    //点击提交
    $("#submit").on("click",function () {

        //没有输入密码
        if ($("#userPassword").val().trim()=="") {
            AddStyleByError("userPassword","tip2","log_img2");
            $("#tip2").html("请输入密码!");
        } else if ($("#userPassword").val().trim().length<6||$("#userPassword").val().trim().length>16){//密码格式校验
            AddStyleByError("userPassword","tip2","log_img2");
            $("#tip2").html("密码格式不正确!");
            return false;
        }

        //没有输入重复密码
        if ($("#userPassword1").val().trim()=="") {
            AddStyleByError("userPassword1","tip3","log_img3");
            $("#tip3").html("请输入重复密码!");
            return false;
        } //重复密码校验
        else if ($("#userPassword1").val()!=$("#userPassword").val()){
            AddStyleByError("userPassword1","tip3","log_img3");
            $("#tip3").html("两次密码不一致!");
            return false;
        }

        $.ajax({
            url:


        });
        return false;//取消默认行为
    });
};