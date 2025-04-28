package company.com.array_programs;

public class SumOfElements {
    public static void sumOfElements(int[] array){
        int sum = 0;
        for (int j : array) {
            sum = sum + j;
        }
        System.out.println("Sum : "+sum);
    }
    public static void main(String[] args) {
        int[] array = new int[]{3,6,9,10,20};
        sumOfElements(array);
    }
}
