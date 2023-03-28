package d2_abstract.Test_abstract;

public abstract class Card {
    private String name;
    private double money;

    public Card() {
    }

    public Card(String name, Double money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public abstract void payfunction(double money);
}
