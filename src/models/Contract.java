package models;

public class Contract {
    private String codebooking;
    private String codecustomer;
    private long depositamount;
    private long totalmoney;
    private String Somecontracts;

    public Contract(String codebooking, Booking booking, String depositamount, String totalmoney, String customer){
    }

    public Contract(String codebooking, String codecustomer, long depositamount, long totalmoney, String somecontracts) {
        this.codebooking = codebooking;
        this.codecustomer = codecustomer;
        this.depositamount = depositamount;
        this.totalmoney = totalmoney;
        Somecontracts = somecontracts;
    }

    public String getCodebooking() {
        return codebooking;
    }

    public void setCodebooking(String codebooking) {
        this.codebooking = codebooking;
    }

    public String getCodecustomer() {
        return codecustomer;
    }

    public void setCodecustomer(String codecustomer) {
        this.codecustomer = codecustomer;
    }

    public long getDepositamount() {
        return depositamount;
    }

    public void setDepositamount(long depositamount) {
        this.depositamount = depositamount;
    }

    public long getTotalmoney() {
        return totalmoney;
    }

    public void setTotalmoney(long totalmoney) {
        this.totalmoney = totalmoney;
    }

    public String getSomecontracts() {
        return Somecontracts;
    }

    public void setSomecontracts(String somecontracts) {
        Somecontracts = somecontracts;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "codebooking='" + codebooking + '\'' +
                ", codecustomer='" + codecustomer + '\'' +
                ", depositamount=" + depositamount +
                ", totalmoney=" + totalmoney +
                ", Somecontracts='" + Somecontracts + '\'' +
                '}';
    }
}
