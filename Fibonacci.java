public class Fibonacci {
    public static void Fibonacci(int n, int a, int b){
        if (n == 1) {
            return;
        } else {
            System.out.println(a+" * ");
            Fibonacci (n-1,b,a+b);
            
        }
    }
    public static void main(String[] args) {
        int n = 10;
        int a = 1;
        int b = 1;
        Fibonacci(n,a,b);
        
    }
}
