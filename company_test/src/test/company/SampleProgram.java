package test.company;

/**
 aaaaabbbccaab
 5a3b2c2a1b
 *
 */

public class SampleProgram {

    public static void main(String[] args) {
        String value = "aaaaabbbccaab";
        char[] data = value.toCharArray();

        for(int i=0; i<data.length;i++){
            int count = 1;
            for(int j=i+1;j<data.length;j++){
                if(data[i] == data[j]){
                    data[j] = '_';
                    count++;
                } else if(data[i] != data[j]){
                    break;
                }
            }
            if(data[i] != '_'){
                String check = ""+count+data[i];
                System.out.print(check);
            }
        }
    }

}

