public abstract class abstractClass {

    public abstractClass(int y){
        this.y=y;
    }
    int x=100;
    int y;
    public void a(int a){
        System.out.println("A方法");
    }
    public abstract void b(int a);
    public static void c(){
        System.out.println("fu");
    }
}
