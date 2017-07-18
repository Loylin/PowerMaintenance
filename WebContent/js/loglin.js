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
            url: "/login",
            data: $("#login-form").serialize(),
            dataType: "text",
            async: false,
            success: function (data) {
                if (data == "YES") {
                    layer.msg("登录成功！", {time: 1000, icon: 6});
                    setTimeout(function () {
                        window.location.href = "/home";
                    }, 1000);
                } else {
                    $("#errortips").show();
                }
            },
            error: function (data) {
                layer.msg("发生错误了！");
            }
        });
        return false;
    });
}