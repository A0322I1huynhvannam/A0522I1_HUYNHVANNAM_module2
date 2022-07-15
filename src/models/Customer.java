package models;

public class Customer extends Person {
     private String endow;
     private String membershipcard;
     public Customer(){
     }
     public Customer(String ten , long cccd , String diachi, String endow, String membershipcard){
         super(ten, cccd, diachi);
         this.endow=endow;
         this.membershipcard=membershipcard;
     }
    public String getEndow() {
        return endow;
    }

    public void setEndow(String endow) {
        this.endow = endow;
    }

    public String getMembershipcard() {
        return membershipcard;
    }

    public void setMembershipcard(String membershipcard) {
        this.membershipcard = membershipcard;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "endow='" + endow + '\'' +
                ", membershipcard='" + membershipcard + '\'' +
                '}';
    }

    @Override
    public String show() {
        return this.toString();
    }

    public static void main(String[] args) {
        Customer customer = new Customer("nam",323232,"ddn","thanh vien vip giam 20%","thanh vien the vip");
        System.out.println(customer);
    }
}
