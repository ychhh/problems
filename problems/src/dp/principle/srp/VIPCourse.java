package dp.principle.srp;

public class VIPCourse implements ICourse {

    @Override
    public void study(String name) {
        System.out.println(name+"可以调进度");
    }
}
