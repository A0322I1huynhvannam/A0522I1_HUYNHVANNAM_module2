package ss16_textfile.bai_tap.filetext;

import java.io.*;

public class CopyFile {
    public static void copyFile(String input,String output){
        try{
            File inputFile = new File(input);
            FileWriter outputFile = new FileWriter(output);
            if(!inputFile.exists() ){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bufferedWriter = new BufferedWriter(outputFile);
            String line = "";
            while ((line = bufferedReader.readLine())!= null){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
        }
        catch (IOException e){
            System.out.println("Invalid!!!");
        }

    }

    public static void main(String[] args) {
          String input = "D:\\codegym\\A0522I1huynhvannam\\Module2\\A0522i1_HUYNHVANNAM_module_2\\src\\ss16_textfile\\bai_tap\\filetext\\input.txt";
          String ouput = "D:\\codegym\\A0522I1huynhvannam\\Module2\\A0522i1_HUYNHVANNAM_module_2\\src\\ss16_textfile\\bai_tap\\filetext\\output.txt";
          copyFile(input,ouput);
        System.out.println("copy thanh cong");

    }
}
