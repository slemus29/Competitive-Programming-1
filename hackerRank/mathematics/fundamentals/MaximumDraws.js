function processData(input) {
    var inputnew = input.split("\n");
    var newinput = inputnew.map(Number)
    for(var i=1; i<= newinput[0]; i++){
        console.log(newinput[i]+1);
    }
} 

process.stdin.resume();
process.stdin.setEncoding("ascii");
_input = "";
process.stdin.on("data", function (input) {
    _input += input;
});

process.stdin.on("end", function () {
   processData(_input);
});