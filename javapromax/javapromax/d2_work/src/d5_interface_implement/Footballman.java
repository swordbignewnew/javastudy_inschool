package d5_interface_implement;

//多接口案例！

public class Footballman implements Sportman,Law{
    private  String name;

    public Footballman(String name) {
        this.name = name;
    }

    public Footballman() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name+" run fast!");
    }

    @Override
    public void competite() {
        System.out.println(this.name+" get a great grade");
    }

    @Override
    public void law() {
        System.out.println(this.name+" 遵纪守法！");
    }
}
