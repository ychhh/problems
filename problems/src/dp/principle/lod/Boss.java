package dp.principle.lod;
//迪米特原则（Law of Demeter lod）是指一个对象应该对其他对象保持最少的了解，又
//        叫最少知道原则（Least Knowledge Principle,LKP），尽量降低类与类之间的耦合。迪
//        米特原则主要强调只和朋友交流，不和陌生人说话。出现在成员变量、方法的输入、输
//        出参数中的类都可以称之为成员朋友类，而出现在方法体内部的类不属于朋友类。
public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }
}
