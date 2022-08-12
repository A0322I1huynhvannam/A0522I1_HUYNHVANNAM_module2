package models;

public class Booking {
    private String idBooking;
    private String codecustomer;
    private String servicename;
    private String typeofservice;
    private Number startday;
    private Number enddate;

    public Booking(){
    }

    public Booking(String codebooking, String codecustomer, String servicename, String typeofservice, Number startday, Number enddate) {
        this.idBooking = idBooking;
        this.codecustomer = codecustomer;
        this.servicename = servicename;
        this.typeofservice = typeofservice;
        this.startday = startday;
        this.enddate = enddate;
    }

    public Booking(int id, String startDate, String endDate, Customer customer, Facility facility) {
    }

    public String getCodebooking() {
        return idBooking;
    }

    public void setCodebooking(String codebooking) {
        this.idBooking = idBooking;
    }

    public String getCodecustomer() {
        return codecustomer;
    }

    public void setCodecustomer(String codecustomer) {
        this.codecustomer = codecustomer;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public String getTypeofservice() {
        return typeofservice;
    }

    public void setTypeofservice(String typeofservice) {
        this.typeofservice = typeofservice;
    }

    public CharSequence getStartday() {
        return (CharSequence) startday;
    }

    public void setStartday(Number startday) {
        this.startday = startday;
    }

    public CharSequence getEnddate() {
        return (CharSequence) enddate;
    }

    public void setEnddate(Number enddate) {
        this.enddate = enddate;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "codebooking='" + idBooking + '\'' +
                ", codecustomer='" + codecustomer + '\'' +
                ", servicename='" + servicename + '\'' +
                ", typeofservice='" + typeofservice + '\'' +
                ", startday=" + startday +
                ", enddate=" + enddate +
                '}';
    }
}
