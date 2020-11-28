package myproblems.stackdemo;

public class Arraystack {
    private String[] items;
    //栈中数据个数
    private int count;
    //栈的大小
    private int n;

    public Arraystack(int n) {
        this.items=new String[n];
        this.n = n;
        this.count=0;
    }
    public boolean push(String item){
        if (count==n)
            return false;
        items[count]=item;
        count++;
        return true;
    }
    public String pop(){
        if (count==0)
            return null;
        String item=items[count-1];
        count--;
        return item;
    }
    public boolean isEmpty(){
        if (count==0){
            return true;
        }else {
            return false;
        }
    }
    public String peek(){
        if (count==0)
            return null;
        String item=items[count-1];
        return item;
    }
}
