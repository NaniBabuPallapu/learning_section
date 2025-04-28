package company.com.array_programs;

public class RemoveDuplicatesFromArray {
   public static void removeDuplicatesFromArray(int[] array){
       for(int i=0;i<array.length;i++){
           for(int j=i+1;j<array.length;j++){
               if(array[i] == array[j]){
                   array[j] = -1;
               }
           }
           if(array[i] != -1){
               System.out.print(array[i]+" ");
           }
       }
       System.out.println("\n");
   }
    public static void main(String[] args) {
        int[] array = {2,3,5,6,21,4,2,6,12,4,2,1,7,5};
        removeDuplicatesFromArray(array);
    }
}
