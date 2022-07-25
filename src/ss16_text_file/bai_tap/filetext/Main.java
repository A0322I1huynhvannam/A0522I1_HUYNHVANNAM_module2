package ss16_text_file.bai_tap;

public class Main {
  private static final String file1 = "D:\\codegym\\A0322I1huynhvannam\\Module2\\A0322i1_HUYNHVANNAM_module_2\\src\\ss16_text_file\\bai_tap\\source.csv";
    private static final String file2 = "D:\\codegym\\A0322I1huynhvannam\\Module2\\A0322i1_HUYNHVANNAM_module_2\\src\\ss16_text_file\\bai_tap\\targe.csv";
    public static void main(String[] args) {
      CopyFile copyFile = new CopyFile();
      copyFile.copyFile(file1,file2);
    }
}
