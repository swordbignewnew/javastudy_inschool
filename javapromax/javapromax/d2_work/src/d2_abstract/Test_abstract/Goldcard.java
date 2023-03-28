package d2_abstract.Test_abstract;

public class Goldcard extends Card{
    @Override
    public void payfunction(double money1){
        System.out.println("you have"+getMoney());
        System.out.println("get 80% discount!");
        System.out.println("you should pay:"+money1*0.8);
        setMoney(getMoney()-money1*0.8);
        System.out.println("you still have:"+getMoney());
    }
}
