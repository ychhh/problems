package dp.principle.ocp;
//开闭原则（Open-ClosedPrinciple,OCP）是指一个软件实体如类、
// 模块和函数应该对扩展开放，对修改关闭。所谓的开闭，也正是对扩展和修改两个行为的一个原则。
// 强调的是用抽象构建框架，用实现扩展细节。可以提高软件系统的可复用性及可维护性。开闭原则，
// 是面向对象设计中最基础的设计原则。它指导我们如何建立稳定灵活的系统，例如：我们版本更新，
// 我尽可能不修改源代码，但是可以增加新功能。
public interface ICourse {
    Integer getId();
    String getName();
    double getprice();
}
