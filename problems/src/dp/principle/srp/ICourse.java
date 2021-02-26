package dp.principle.srp;
//单一职责（Simple Responsibility Pinciple，SRP）是指不要存在多于一个导致类变更
//        的原因。假设我们有一个 Class 负责两个职责，一旦发生需求变更，修改其中一个职责的
//        咕泡出品，必属精品 www.gupaoedu.com
//        8
//        逻辑代码，有可能会导致另一个职责的功能发生故障。这样一来，这个 Class 存在两个导
//        致类变更的原因。如何解决这个问题呢？我们就要给两个职责分别用两个 Class 来实现，
//        进行解耦。后期需求变更维护互不影响。这样的设计，可以降低类的复杂度，提高类的
//        可 读 性 ， 提 高 系 统 的 可 维 护 性 ， 降 低 变 更 引 起 的 风 险 。 总 体 来 说 就 是 一 个
//        Class/Interface/Method 只负责一项职责。
public interface ICourse {
    void study(String name);
}
