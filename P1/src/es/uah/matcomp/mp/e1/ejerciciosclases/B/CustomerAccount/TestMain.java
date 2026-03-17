package es.uah.matcomp.mp.e1.ejerciciosclases.B.CustomerAccount;

public class TestMain {
    public static void main(String[] args) {
// Test Customer class
        Customer c1 = new Customer (75, "Eric", 'f');
        System.out.println(c1);
        System.out.println("id is: " + c1.getId());
        System.out.println("name is: " + c1.getName());
        System.out.println("gender is: " + c1.getGender());
// Test Account class
        Account a1 = new Account ( 66, c1, 700.5);
        System.out.println(a1);
        a1.setBalance(900.9);
        System.out.println(a1);
        System.out.println("id is: " + a1.getId());
        System.out.println("customer is: " + a1.getCustomer());
        System.out.println("balance is: " + a1.getBalance());
        System.out.println("customer's id is: " + a1.getCustomer().getId());
        System.out.println("customer's name is: " + a1.getCustomer().getName());
        System.out.println("customer's gender is: " + a1.getCustomer().getGender());
        System.out.println("balance after deposit is: " + a1.deposit(99.5));
        System.out.println("balance after withdraw is: " + a1.withdraw(1000));
        System.out.println("balance after withdraw is: " + a1.withdraw(100));

    }
}
