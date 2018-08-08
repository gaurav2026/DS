
// Java program to demonstrate accessing 
// a static nested class
 
// outer class
class OuterClass
{ 
    // static member
    static int outer_x = 10;
     
    // instance(non-static) member
    int outer_y = 20;
     
    // private member
    private static int outer_private = 30;
     
    // static nested class
     class StaticNestedClass
    {
    	 int k = 50;
    	 
        public int getK() {
			return k=50;
		}

		public void setK(int k) {
			this.k = k;
		}

		void display()
        {
            // can access static member of outer class
            System.out.println("outer_x = " + outer_x);
             
            // can access display private static member of outer class
            System.out.println("outer_private = " + outer_private);
             
            // The following statement will give compilation error
            // as static nested class cannot directly access non-static membera
             System.out.println("outer_y = " + outer_y);
         
        }
    }
}
 
// Driver class
public class StaticNestedClassDemo
{
    public static void main(String[] args)
    {
        // accessing a static nested class
    //	OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
    	OuterClass outerClass = new OuterClass();
    	OuterClass.StaticNestedClass nested = outerClass.new StaticNestedClass();
         
    	nested.display();
        System.out.println(nested.getK());
    }
}
