package ss03_mang_phuong_thuc_java.bai_tap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class XoaPhanTuMang {
    public static void main(String[] args) {
        String[] arr = {"1", "5" , "3", "4", "2", "5"};

        System.out.println("Mang ban dau:\n"+ Arrays.toString(arr));

        List<String> testList = new ArrayList<>(Arrays.asList(arr));

        System.out.println("ArrayList chua mang:\n"+ testList);

        testList.remove(4);

        System.out.println("Xoa phan tu thu 4 trong ArrayList:\n"+ testList);

        arr = testList.toArray(new String[0]);

        System.out.println("Mang ket qua :\n"+Arrays.toString(arr));

    }
}

