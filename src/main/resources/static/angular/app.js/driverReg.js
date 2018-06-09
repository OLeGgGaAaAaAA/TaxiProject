function driverReg(name, surname, city, email, log, pass) {
    $.ajax({
        type: "POST",
        url: "/TaxiProject",
        dataType: "json",
        data: {requestType: "driverReg", name: name, surname: surname, city: city, email: email, login: log, password: pass},
        success: function(data) {
            if(data.result.equals("exists")) {
                alert("Такой аккаунт уже существует")
            }else if(data.result.equals("mail_exists")) {
                alert("Такой email уже используется другим пользователем")
            }else if(data.result.equals("complete")){
                location.href = "driverPage.html"
            }else if(data.result.equals("error")) {
                alert("Ошибка")
            }   location.reload(true)
        }
    });
}