function driverAuth() {
    var doc = document;
    var login = doc.getElementsByName("login");
    var password = doc.getElementsByName("password");
    $.ajax({
        type: "POST",
        url: "/TaxiProject",
        dataType: "json",
        data: {requestType: "driverAuth", login: login, password: password},
        success: function (data) {
            if(data.result.equals("login_exists")){
                alert("Такой логин уже существует")
            }else if(data.result.equals("complete")) {
                location.href = "driverPage.html"
            }else if(data.result.equals("error")) {
                alert("Ошибка")
            }   location.reload(true)
        }
    });
}