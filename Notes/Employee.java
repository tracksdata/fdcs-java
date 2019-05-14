class Employee{

    int empId; // instance 
    static String companyName; // static 


    void m1(){ // non static method
        empId=1000;
        companyName="Cognizant Technologies";
        Test t=new Test();
        t.x=999;
    }

    static void m2(){ // static
    //empId=2000; // invalid
     Employee obj=new Employee();
     obj.empId=100000;
     companyName="Bla Bla";
     Test t=new Test();
     t.x=777;
    }

    public  static void main(String args[]){

m2();

        Employee e1=new Employee();
        Employee e2=new Employee();
        Employee e3=new Employee();

       e1.empId=10;
       e2.empId=20;
       e3.empId=30;
e1.m1();

       // companyName="Cognizant";
        //companyName="CTS";
        System.out.println("Company Name: "+companyName);
        System.out.println("E1: "+e1.empId);
        System.out.println("E2: "+e2.empId);
        System.out.println("E3: "+e3.empId);

        System.out.println("------------------");
        
        
       
        System.out.println("Y: "+Test.y);
    }

}