//app.use("/static", express.static('./static/'));

function getRandValues(){

    var values = "test";

    console.log("Getting random value");

//    var test = $('#idhere').data('value');
    $.get(
        {
            url:'/getRandValue',
            data:{
                values : values
            },
            success: function(res){
                console.log("random value is: " + res);
//                document.getElementById("randValResult").value = res;
                document.getElementById("randValResult").innerHTML = res;
            }
        }
    )


}