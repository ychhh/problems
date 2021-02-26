public class abstractDemo extends abstractClass {
    int x=2;

    public abstractDemo(int y) {
        super(y);
    }

    @Override
    public void b(int a) {
        System.out.println(super.x);
    }
//    public static void c(){
//        System.out.println("zi");
//    }
    public static void main(String[] args) {
        abstractDemo abstractDemo=new abstractDemo(5);
        abstractDemo.b(1);
        abstractDemo.c();
        System.out.println(abstractDemo.x);
    }
}
