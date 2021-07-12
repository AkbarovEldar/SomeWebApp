$(document).ready(function(){
    $.get(
        {
            url:'/getCurrentCounter',
            data:{
            },
            success: function(res){
                document.getElementById("oldCounterResult").innerHTML = res[0];
                document.getElementById("newCounterResult").innerHTML = res[1];
            }
        }
    )
});


function getRandValues(){

    var values = "test";

    console.log("Getting random value");

    var min = document.getElementById('addMinVal').value;
    var max = document.getElementById('addMaxVal').value;
    console.log("min value is: " + min);
    console.log("max value is: " + max);

    var randValue = min + "_" + max;

    console.log("randValue is: " + randValue);
    $.get(
        {
            url:'/getRandValue',
            data:{
                randValue : randValue
            },
            success: function(res){
//                console.log("random value is: " + res);
//                document.getElementById("randValResult").value = res;
                document.getElementById("randValResult").innerHTML = res;
            }
        }
    )
}


function getCounterValue(){
    var counterValue = document.getElementById('numCounter').value;
    console.log("numCounter is: " + counterValue);
    $.get(
        {
            url:'/increaseCounter',
            data:{
                counterValue : counterValue
            },
            success: function(res){
                console.log("old value is: " + res[0]);
                console.log("new value is: " + res[1]);
//                document.getElementById("randValResult").value = res;
                document.getElementById("oldCounterResult").innerHTML = res[0];
                document.getElementById("newCounterResult").innerHTML = res[1];
            }
        }
    )
}


function writeToLog(){

    var toLog = document.getElementById('logText').value;
    $.get(
        {
            url:'/writeNewLogLine',
            data:{
                toLog : toLog
            },
            success: function(res){
                    console.log("new log line: " + res);
                    document.getElementById("logResult").innerHTML = res;
            }
        }
    )

}