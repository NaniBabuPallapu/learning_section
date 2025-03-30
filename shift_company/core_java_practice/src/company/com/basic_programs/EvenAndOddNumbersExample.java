package company.com.basic_programs;

public class EvenAndOddNumbersExample {
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            if(i % 2  == 0){
                System.out.println(i+" Even Number");
            } else{
                System.out.println(i+" Odd Number");
            }
        }
        System.out.println("\n");

        int i = 1;
        while(i<=100){
            if(i % 2  == 0){
                System.out.println(i+" Even Number");
            } else{
                System.out.println(i+" Odd Number");
            }
            i++;
        }
    }
}
