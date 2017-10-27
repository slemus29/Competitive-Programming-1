function processData(input) {
    var inputnew = input.split("\n")
    var sum = []
    
    for(var i=1 ; i <= inputnew[0]; i++){
        var actual = inputnew[i];
        var newactual = actual.split(' ').map(Number);
        var point = {
            x: newactual[2]-newactual[0]+newactual[2],
            y: newactual[3]-newactual[1]+newactual[3]
        };
        sum.push(point);
    }
   // sum.forEach(point => console.log(point.x,point.y));
    sum.forEach(({x, y}) => console.log(x,y));
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
