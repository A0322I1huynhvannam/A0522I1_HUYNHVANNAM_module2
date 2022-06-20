package ss05_access_modifier.bai_tap;

public class Student {
    private String name;
    private String classes;
    // ham khoi tao ban dau
    public Student(){
        this.name="john";
        this.classes="C02";
    }

    // ham khoi tao co doi so
    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student n=new Student("nam","A0322i1");
        System.out.println("Moi :"+n.classes+n.name);
    }
}
