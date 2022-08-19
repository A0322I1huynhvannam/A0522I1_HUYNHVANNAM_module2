package thi.util;

import thi.models.NganHang;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    public List<String> read(String path){
        List<String> list = new ArrayList<>();
        try{
            File file = new File(path);
            if (!file.exists()){
                file.createNewFile();
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine())!= null){
                if (line.trim().isEmpty()){
                    list.add(line);
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return list;
    }

    public void writer(String path, List<NganHang> phones, boolean isAppen){
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path,isAppen));){

            for (NganHang p : phones){
                bufferedWriter.write(p.toData());
                bufferedWriter.newLine();

            }
            bufferedWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
