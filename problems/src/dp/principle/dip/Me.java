package dp.principle.dip;

public class Me {
    public static void study(ICourse course){
        course.study();
    }

    public static void main(String[] args) {
        study(new JavaCourse());
    }
}
