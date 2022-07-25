package ss16_text_file.bai_tap;

import java.io.*;

public class CopyFile {
  public void copyFile(String source, String targe){
   String line = "";
   try {
       File sourceFile = new File(source);
       File targeFile = new File(targe);
       if(!sourceFile.exists() || !targeFile.exists()) {
           throw new FileNotFoundException();
       }
       FileReader fileReader = new FileReader(sourceFile);
       FileWriter fileWriter = new FileWriter(targeFile);
       BufferedReader bufferedReader = new BufferedReader(fileReader);
       BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
       while ((line = bufferedReader.readLine())!= null){
           bufferedWriter.write(line +"\n" );
       }

       bufferedReader.close();
       bufferedWriter.close();


   }  catch (FileNotFoundException e) {
       e.printStackTrace();
   } catch (IOException e) {
       e.printStackTrace();
   } finally {
       System.out.println("chuong trinh copy thanh cong");
   }
  }
}

