package danh_sach.bai_tap.Mylist.Mylist;

public class MyListTest2 {
    String name;
    public MyListTest2(){

    }

    public MyListTest2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MyListTest2{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        danh_sach.bai_tap.Mylist.Mylist.MyList list = new danh_sach.bai_tap.Mylist.Mylist.MyList();
        list.add(0,new MyListTest2("Huynh van nam"));
        list.add(1,new MyListTest2("Huynh van nam1"));
        list.add(2,new MyListTest2("Huynh van nam2"));
       for(int i=0;i< list.size();i++){
           System.out.println(list.get(i).toString());
       }
    }
}
