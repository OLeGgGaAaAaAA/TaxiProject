function driverAuth() {
    var doc = document;
    var login = doc.getElementById("login").value;
    var password = doc.getElementById("password").value;
    $.ajax({
        type: "POST",
        url: "/TaxiProject/src/main/java",
        dataType: "json",
        data: {requestType: "driverAuth", login: login, password: password},
        success: function (data) {
            if(data.result.equals("login_exist")){
                alert("Такой логин уже существует")
            }else if(data.result.equals("complete")) {
                location.href = "driverPage.html"
            }else if(data.result.equals("error")) {
                alert("Ошибка")
            }   location.reload(true)
        }
    });
}