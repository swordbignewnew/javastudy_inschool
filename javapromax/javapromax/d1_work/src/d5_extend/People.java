package d5_extend;

public class People {
    int age;
    String name;

    public People(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public People() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getclass(){
        System.out.println("查看课表！");
    }
}
