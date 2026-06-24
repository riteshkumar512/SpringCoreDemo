package in.RiteshKumar;

import in.RiteshKumar.Payment.PaymentService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component
public class OrderService {

    private PaymentService paymentService;

//    Field Dependency Injection (Not Recommended)
//    @Autowired
//   private PaymentService paymentService;


//   Constructor Dependency Injection (Mostly Used)
//    @Autowired
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    //Setter Dependency Injection
//    @Autowired
//    public void setPaymentService(PaymentService paymentService) {
//        this.paymentService = paymentService;
//    }

    public void placeOrder(){
        paymentService.pay();
        System.out.println("Order Placed");
    }
}
