class Test{

/*
1. Properties/Variables/Fields
2. Methods
3. Constrcutors
4. Blocks

1. Properties/Variables/Fields
---------------------------------
Two types of Properties
    -> instance Properties
    -> static properties
   
    instance Properties
    ----------------------
        -> Values of instance properties are 
           available only to a specified object
   
    static properties
    ------------------
        -> Values of static properties are 
           available to all the obejcts.
        -> static data can be accessed directly with out help of object
        -> If The static data is defined in another class, then
           data can be accessed with class name

    2. Methods
    -----------
        Two Types
        -> instance methods
            -> non static  method allows instance and static data
            -> instance methods must be called with a object, if you
               are calling from a static method
        -> static methods
            -> static methods allows static data directly
            -> static methods never allow instance data directly
            

Q1: Why I need object?
    -> To access non static data from a static method in the same class
    -> To access non static data from a non static method in the 
       different class
*/

int x=1000; // instance variable
static int y=2000; // static variable


void f1(){ // non static -> instance
x=877;
y=7777;
}

static void f2(){ // static method


Test obj=new Test();
y=77772;
obj.x=7777;
obj.f1(); // valid
}
    public static  void main(String[] abc){
        //System.out.println("--- hello world");
        
       Test t1= new Test();
       Test t2= new Test();


        System.out.println(y);
        System.out.println(t1.x);
    }
}