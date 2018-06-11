function driverInfo() {
    $.ajax({
        type:"POST",
        url:"/TaxiProject/src/main/java",
        dataType: "json",
        data: {requestType: "driverInfo"},
        success: function (data){
            var driverInfo = data.requestType;
            var info = document.getElementById("driverInfoDiv");
            info.write(
                "<div class='driverName'>" + "Имя:" + driverInfo.name + "</div>" +
                "<div class='driverSurname'>" + "Фамилия:" + driverInfo.surname + "</div>" +
                "<div class='driverCity'>" + "Город:" + driverInfo.city + "</div>" +
                "<div class='driverEmail'>" + "Email:" + driverInfo.email + "</div>"
            )

        }
    });
}