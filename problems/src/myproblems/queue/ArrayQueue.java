package myproblems.queue;

public class ArrayQueue {

    private String[] items;
    //数组大小
    private int n=0;
    private int head=0;
    private int tail=0;

    public ArrayQueue(int n) {
        this.n = n;
        this.items=new String[n];
    }

    //入队
    public boolean enqueue(String item){
        if (tail==n)
            return false;
        items[tail]=item;
        tail++;
        return true;
    }
    //出队
    public String dequeue(){
        if (head==tail)
            return null;
        String item=items[head];
        head++;
        return item;
    }
}
