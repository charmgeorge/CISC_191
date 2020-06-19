package cisc191_final;

public class Driver {

    public static void main(String[] args) {
       MathFunc app1 = new App1(25, 5);
       app1.printResult();
       
       MathFunc app2 = new App2(75, 20, 4);
       app2.printResult();
    }
}

abstract class MathFunc {
    abstract int add(int a, int b);
    abstract int subtract(int a, int b);
    abstract void printResult();
}

class App1 extends MathFunc{
    private int num1 ;
    private int num2 ;

    public App1(int a, int b){
        this.num1 = a;
        this.num2 = b;
    }
    
    public int add(int a, int b){
        return a + b;
    }
    
    public int subtract(int a, int b){
        return a - b;
    }  
    
    public void printResult(){
        System.out.println("The sum of " + num1 + " and " + num2 + " is "  
                + add(num1, num2));
        System.out.println("The difference between " + num1 + " and " + num2 
                + " is " + subtract(num1, num2));        
    } 
}

class App2 extends App1{
    private int num3;
    int num1;
    int num2;
    
    public App2(int e, int f, int g){ 
        super(e, f);
        this.num3 = g;
        this.num1 = f;
        this.num2 = e;
        
    }

    public void printResult(){
        System.out.println("Printing the 3 variables " + num1 + " and " + num2 
                + " and " + num3 );
    }             
}
