package ss10_danh_sach.bai_tap.LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("2");
        linkedList.addFirst("1");
        linkedList.addLast("3");
        linkedList.add(1, "CodeGym");

        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.contains("2"));
        System.out.println(linkedList.indexOf("3"));

        linkedList.remove(1);
    }
}
