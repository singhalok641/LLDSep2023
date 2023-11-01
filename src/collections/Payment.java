package collections;

public class Payment {
    PaymentStatus status;
    int id;

    public Payment(int id, PaymentStatus status){
        this.id = id;
        this.status = status;
    }
}
