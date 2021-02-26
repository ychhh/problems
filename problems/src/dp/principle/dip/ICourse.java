package dp.principle.dip;
//依赖倒置原则（Dependence Inversion Principle,DIP）是指设计代码结构时，高层模
//块不应该依赖底层模块，二者都应该依赖其抽象。抽象不应该依赖细节；细节应该依赖
//抽象。通过依赖倒置，可以减少类与类之间的耦合性，提高系统的稳定性，提高代码的
//可读性和可维护性，并能够降低修改程序所造成的风险
public interface ICourse {
    void study();
}
