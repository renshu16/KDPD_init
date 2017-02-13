$(function () {
    var pro = $("#provinceID");
    var city = $("#cityID");
    var dist = $("#districtID");

    if (pro)
        pro.change(function () {
            var provinceId = $(this).val();
            $("#province").val(pro.find("option:selected").text());
            if (provinceId != "" || provinceId != "0" || provinceId > 0) {
                $.ajax({
                    url: "/zone/findByParent?parentId=" + provinceId,
                    type: 'get',
                    dataType: "json",
                    success: function (list) {
                        var text = "<option value=\"\">请选择</option>";
                        for (var i in list) {
                            var c = list[i];
                            text += "<option value=\"" + c.id + "\"> " + c.name + "</option>"
                        }
                        if (city)
                            city.html(text);
                    }
                });
            } else {
                if (city)
                    city.html("<option value=\"\">请选择</option>");
                if (dist)
                    dist.html("<option value=\"\">请选择</option>");
            }
        });

    if (city)
        city.change(function () {
            var cityId = $(this).val();
            $("#city").val(city.find("option:selected").text());
            if (cityId != "" || cityId != "0" || cityId > 0 ) {
                $.ajax({
                    url: "/zone/findByParent?parentId=" + cityId,
                    type: 'get',
                    dataType: "json",
                    success: function (list) {
                        var text = "<option value=\"\">请选择</option>";
                        for (var i in list) {
                            var city = list[i];
                            text += "<option value=\"" + city.id + "\"> " + city.name + "</option>"
                        }
                        if (dist)
                            dist.html(text);
                    }
                });
            } else {
                if (dist)
                    dist.html("<option value=\"\">请选择</option>");
            }
        });

    if(dist)
        dist.change(function(){
            $("#district").val(dist.find("option:selected").text());
        });
});