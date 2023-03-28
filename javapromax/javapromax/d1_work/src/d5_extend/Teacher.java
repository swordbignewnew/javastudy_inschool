package d5_extend;

public class Teacher extends People{
    String work;

    public Teacher(String work) {
        this.work = work;
    }

    public Teacher() {
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void givequesttion(){
        System.out.println("发布问题！");
    }
}
