package company.com.basic_programs;

public class FactorialNumber {
    public static void findFactorial(int number){
        int sum = 1;
        for(int i = number; i>=1; i--){
            sum = sum * i;
        }
        System.out.println("Factorial Of "+number+" is : "+sum);
    }
    public static void findFactorialWhile(int number){
        int sum = 1;
        while(number >= 1){
            sum = sum * number;
            number --;
        }
        System.out.println("Factorial Of "+number+" With While Loop is  : "+sum);

    }
    public static void findFactorialDoWhile(int number){

        int sum =1;
        do{
            sum = sum * number;
            number --;
        }while (number >=1);
        System.out.println("Factorial Of "+number+" With Do While Loop is  : "+sum);

    }
    public static void findFactorialWithRecursion(int number , int sum){
        if(number == 1){
            System.out.println("Factorial Of "+number+" With Recursion Is  : "+sum);
            return;
        }
        findFactorialWithRecursion(number - 1, sum * number);
    }
    public static void main(String[] args){
        findFactorial(5);
        findFactorialWhile(5);
        findFactorialDoWhile(5);
        findFactorialWithRecursion(5, 1);
    }
}
