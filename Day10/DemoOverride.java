// Why we use Overriding 

class A extends Object{
      @Override
      public String toString() {

         return "This is object of A class";

   }

}
class B extends A{
      @Override
      public String toString() {

         return "This is object of B class";

   }

}

public class DemoOverride {
public static void main(String[] args) {

      A ob1=new A();
      B ob2=new B();
         System.out.println(ob1); 
         System.out.println(ob2);
         System.out.println(ob1.toString()); 
         System.out.println(ob2.toString());
   }
}