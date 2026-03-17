package es.uah.matcomp.mp.e1.ejerciciosclases.B.CustomerInvoice;

public class Invoice {

    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount){
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerId() {
        return customer.getId();
    }

    public String getCustomerName(){
        return customer.getName();
    }

    public int getCustomerDiscount(){
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount(){
        amount -= ((getCustomerDiscount()*amount)/100);
        return amount;
    }

    public String toString(){
        return "Invoice[id=" + id + ", customer=" + customer + ", amount=" + amount + "]";
    }
}
