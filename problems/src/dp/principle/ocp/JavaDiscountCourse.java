package dp.principle.ocp;

public class JavaDiscountCourse extends JavaCourse{
    public JavaDiscountCourse(Integer id, String name, double price) {
        super(id, name, price);
    }
    public double getOriginPrice(){
        return super.price;
    }

    public double getPrice(){
        return super.price*0.6;
    }
}
