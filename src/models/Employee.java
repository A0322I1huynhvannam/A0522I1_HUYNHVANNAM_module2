package models;

public class Employee extends Person {
    private String receivesalary;
    public Employee(){
    }
    public Employee(String ten,long cccd,String diachi,String receivesalary){
        super(ten, cccd, diachi);
        this.receivesalary=receivesalary;
    }

    public String getReceivesalary() {
        return receivesalary;
    }

    public void setReceivesalary(String receivesalary) {
        this.receivesalary = receivesalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ten='" + ten + '\'' +
                ", cccd=" + cccd +
                ", diachi='" + diachi + '\'' +
                "receivesalary: '" + receivesalary + '\'' +
                '}';
    }

    @Override
    public String show() {
        return this.toString();
    }

    public static void main(String[] args) {
        Employee employee = new Employee("nam",324243,"dn","40 trieu");
        System.out.println(employee);
    }
}
