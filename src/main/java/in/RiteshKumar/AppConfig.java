package in.RiteshKumar;

import in.RiteshKumar.Payment.CardPayment;
import in.RiteshKumar.Payment.PaymentService;
import in.RiteshKumar.Payment.UpiPayment;
import in.kumar.CartService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan("in.RiteshKumar")
public class AppConfig {
    @Bean
    public User createUser(){
        return new User("Ritesh",22);
    }

    @Bean
    public CartService createCart(){
        return new CartService();
    }

    @Qualifier("cp")
    @Bean
    public PaymentService createCardPayment(){
        return new CardPayment();
    }

//    @Primary
    @Qualifier("up")
    @Bean
    public PaymentService createUpiPayment(){
        return new UpiPayment();
    }
    @Bean
    public OrderService createOrderService(@Qualifier("up") PaymentService paymentService){
        return new OrderService( paymentService);
    }
}
