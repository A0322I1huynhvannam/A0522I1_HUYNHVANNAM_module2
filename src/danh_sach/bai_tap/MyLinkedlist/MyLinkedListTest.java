package danh_sach.bai_tap;

import danh_sach.thuc_hanh.LinkedList.MyLinkedList;
import danh_sach.thuc_hanh.LinkedList.TestMyLinkedList;

public class MyLinkedListTest<E> {
    public static class Person {
        String name;
        int age;

        public Person() {

        }

        public Person(String name, int age) {
            setName(name);
            setAge(age);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person {" +
                    "name: '" + name + '\'' +
                    ", age: " + age +
                    "}.";
        }

        @Override
        public boolean equals(Object obj) {
            TestMyLinkedList.Person person = (TestMyLinkedList.Person) obj;
            return this.name.equals(((TestMyLinkedList.Person) obj).name) && this.age == ((TestMyLinkedList.Person) obj).age;
        }
    }

    public static void main(String[] args) {
        MyLinkedList1<Person> test = new MyLinkedList1<>();
        test.addFirst(new Person("Luan", 20));
        test.addLast(new Person("ha", 20));
        test.addLast(new Person("hoa", 20));

        for (int i = 0; i < test.size(); i++) {
            System.out.println(test.get(i).toString());
        }

    }


}
