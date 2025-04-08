package company.com.array_programs;

public class SortArrayInAscAndDesc {
    public static void ascendingOrder(int[] array) {
        System.out.println("=== ARRAY SORTED IN ASCENDING ORDER ====");
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.print(array[i] + " ");
        }

    }

    public static void descendingOrder(int[] array) {
        System.out.println("=== ARRAY SORTED IN DESCENDING ORDER ====");
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] < array[j]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 5, 6, 1, 7, 2, 1, 9, 26, 20, 12, 6, 3, 18};
        ascendingOrder(array);
        System.out.println("\n");
        descendingOrder(array);
        System.out.println("\n");

    }
}
