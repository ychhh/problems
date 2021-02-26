package dp.principle.lsp;
//里氏替换原则（Liskov Substitution Principle,LSP）
//定义看上去还是比较抽象，我们重新理解一下，可以理解为一个软件实体如果适用一个
//        父类的话，那一定是适用于其子类，所有引用父类的地方必须能透明地使用其子类的对
//        象，子类对象能够替换父类对象，而程序逻辑不变。根据这个理解，我们总结一下：
//        引申含义：子类可以扩展父类的功能，但不能改变父类原有的功能。
//        1、子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法。
//        2、子类中可以增加自己特有的方法。
//        3、当子类的方法重载父类的方法时，方法的前置条件（即方法的输入/入参）要比父类
//        方法的输入参数更宽松。
//        4、当子类的方法实现父类的方法时（重写/重载或实现抽象方法），方法的后置条件（即
//        方法的输出/返回值）要比父类更严格或相等。
public class Rectangle {
    int width;
    int high;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }
}
