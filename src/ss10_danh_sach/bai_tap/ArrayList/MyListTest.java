package ss10_danh_sach.bai_tap.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> arrayList = new  MyList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(6);
//        arrayList.add(2, 23);
        arrayList.remove(3);

        System.out.println(arrayList.contains(6));
        System.out.println(arrayList.indexOf(3));
        System.out.println(arrayList.size());

//
//        try {
//            MyList<Integer> arrayClone = ( MyList<Integer>) arrayList.clone();
//            for (int i = 0; i < arrayClone.size(); i++) {
//                System.out.println(arrayClone.get(i));
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}}
