package cisc_191_midterm;

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
        System.out.println("The sum of " + num1 + " and " + num2 + " is "  + add(num1, num2));
        System.out.println("The difference between " + num1 + " and " + num2 + " is " + subtract(num1, num2));        
    }
   
}
