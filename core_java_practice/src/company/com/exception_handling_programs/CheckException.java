package company.com.exception_handling_programs;

import java.io.*;

public class CheckException {
    public static void main(String[] args) throws IOException {
        try {
            // if the file
            File file = new File("C:Users//nanip//Downloads//insurance_project_requirement.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            while (bufferedReader.readLine() != null) {
                String line = bufferedReader.readLine();
                System.out.println(line);
            }
            bufferedReader.close();
        } catch(IOException ioException){
            throw new IOException("Exception occurred while reading the file", ioException);
        }

    }
}
