console.log('--- Data types');

/*
1. Primitive
2. Reference type

1. Primitive
---------------
a.numbers
b.string
3.undefined
4.null
*/

// a. numbers
var a=100;
a=87.45;

// 2. string

var a="Praveen";
a='James';

// string concatnation
var trainer='Praveen';
var subject='Java Script';

console.log(trainer+' is teaching the subject '+subject);

var exp= 
`
${trainer} is teaching the subject ${subject}
`
var price=77;
var qty=4;
console.log(` Price is ${price} and selected items ${qty}
Total bill has to pay ${price*qty}
`);

// c. undefined
var ab=null;

//2. Reference type

// 1. Objects
var emp=new Object();
emp.id=10;
emp.name='Praveen';
emp.salary=34856485;

person={
    id:19024,
    name:'James',
    salary:9474
};

person.mobile=874634368;
person.name='Bla';
//-------------------------

// Arrays
var nos=[12,43,233];

var p={
    pname:'Praveen',
    age:77,
    "my salary":8474
}






