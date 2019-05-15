//import java.io.PrintStream;
/*
-> System is a class belongs to java.lang package
-> out is the static objct which belongs to java.io.PrintStream
-> Combining System.out, you get access to PrintSteam class object
-> On top of PritStream class object, we can invoke any methods in it
-> print() and println() belongs to PrintStream class

Note:
1. for each loop -> iterates only array content

*/
class Sample{

void f1(){} // need object
static void f2() {} // object does not required
    public static void main(String[] cities){

        for(String cityName:cities){
            System.out.println(cityName);
        }

       // String c1=cities[0];
       // String c2=cities[1];
      // PrintStream ps= System.out;
       //ps.println("--- Welcome....");
       //System.out.println("City name is "+c1);
       //  System.out.println("City name is "+c2);
        System.out.println("Total Cities: "+cities.length);
         System.out.println(" --- Done ---");
    }
}