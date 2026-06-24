package in.RiteshKumar;

import in.kumar.CartService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);

        OrderService order=context.getBean(OrderService.class);
        order.placeOrder();

        User user=context.getBean(User.class);
        System.out.println(user.getName());

        CartService cart=context.getBean(CartService.class);
        cart.cartAdded();

//        CartService cart=new CartService();
//        cart.cartAdded();


//        PaymentService payment=context.getBean(PaymentService.class);
//        payment.pay();

//        Class<Student> c1= Student.class;

    }
    /*
    c1 store metadata of class Student:
    Class name:Student
    Fields: Name,age also its datatype
    Constructor:Student
    Methods:getAttendece() ,print()
    Private member,public member
    Annotation

    */
}



class Student{
    private String name;
    private int age;

    public Student(){}

    public void getAttendence(){

    }
    public void print(){}

}