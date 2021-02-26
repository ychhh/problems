package dp.principle.ocp;

import dp.principle.ocp.ICourse;

public class JavaCourse implements ICourse {
    Integer id;
    String name;
    double price;

    public JavaCourse(Integer id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getprice() {
        return price;
    }
}
