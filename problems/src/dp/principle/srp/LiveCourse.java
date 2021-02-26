package dp.principle.srp;

public class LiveCourse implements ICourse {

    @Override
    public void study(String name) {
        System.out.println(name+"不可以调整进度");
    }
}
