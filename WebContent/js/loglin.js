/**
 * Created by Administrator on 2017/7/18.
 */
window.onload = function () {
    init();
    btnInit();
}

function init() {
    $("#errortips").hide();
}

function btnInit() {
    //按钮事件
    $("#btn-login").click(function () {
        $.ajax({
            type: "post",
            url : "/login",
            data : $("#login-form").serialize(),
            dataType: "text",
            async : false,
            success : function (data) {
                if(data == "YES"){
                    alert("登录成功！");
                    window.location.href = "/home";
                } else {
                    $("#errortips").show();
                }
            },
            error : function (data) {
                alert("错误信息:" + data);
            }
        });
        return false;
    });
}