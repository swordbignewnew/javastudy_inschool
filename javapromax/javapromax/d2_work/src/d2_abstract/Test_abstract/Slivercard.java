package d2_abstract.Test_abstract;

public class Slivercard extends Card{
    @Override
    public void payfunction(double money){
        System.out.println("get 85% discout!");
        System.out.println("you should pay:"+money*0.85);
    }
}
