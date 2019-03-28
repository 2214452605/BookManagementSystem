window.onload=function () {
    function resetText(){
        $("#userPassword").reset();
        $("#userName").reset();
    }
    //设置焦点函数
    function setOnfocus(obj){
        $(obj).on("focus",function () {
            $("#tip").removeClass("has-error text-danger");
            $("#tip").html("");
        });
    }
    setOnfocus("#userName");
    setOnfocus("#userPassword");


    //重置按钮
    $("#reset").click(function () {
        //清空输入框的文本内容
        resetText();
    });
    //登录按钮
    $("#submit").click (function () {
        //检查输入是否有值,并且去掉两端的空格
        if ($("#userName").val().trim()!=""&&$("#userPassword").val().trim()!=""){//输入的值不为空串
            $.ajax({
                    url:"/user/login",
                    type:"POST",
                    data:$("#login_form").serialize(),
                    success:function (result) {
                        if (result.code==1){
                            window.location.href="/ui/user/user_main.html";//成功后跳转到用户主界面
                        } else{
                            $("#tip").addClass("has-error text-danger");
                            $("#tip").html("账号或密码错误,请重新输入");
                            resetText();
                        }
                    }
                }
            );
        }else{
            $("#tip").addClass("has-error text-danger");
            $("#tip").html("请输入有效值!");
        }
        return false;
    });
}