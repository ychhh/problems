package dp.principle.srp;

public class Course implements ICourse {
    @Override
    public void study(String name) {
        if (name.equals("直播课")){
            System.out.println(name+"不可以调整进度");
        }else {
            System.out.println(name+"可以调整进度");
        }
    }
}
