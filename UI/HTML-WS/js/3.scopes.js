console.log('-- Scopes');

/*

1. Context Creation:
    -> Every variable get lifted up to the top of the 
       memory when you defined them with 'var' keyword

2. Context Execution


*/

console.log('Value of a is '+a);
var a=10;

f1();

function f1(){
    console.log('-- f1 function 123');
}



var teach=function(){
    console.log('Teaching .js');
    //return "Teaching JS";
}
teach();
//console.log(teach());


