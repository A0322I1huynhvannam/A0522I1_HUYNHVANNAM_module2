package ss16_textfile.bai_tap.file;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String FILE_NAME = "D:\\codegym\\A0522I1huynhvannam\\Module2\\A0522i1_HUYNHVANNAM_module_2\\src\\ss16_textfile\\bai_tap\\file\\student.csv";
    public static final String COMMA = ",";

    public static void main(String[] args) {
        Student student1 = new Student(1, "XXXX", "NAM");
        Student student2 = new Student(2, "XXXX", "BAO");
        Student student3 = new Student(3, "XXXX", "TIN");
        List<Student> studentList = new ArrayList<>();


        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        String line = null;
        for (Student student : studentList) {
            line = student.getId() + COMMA + student.getCode() + COMMA + student.getName() ;
            FileUtils.writeFile(FILE_NAME,line);

        }
//        Input file
        List<String> listLine = FileUtils.readFile(FILE_NAME);
        System.out.println(listLine);
    }
}
