package synchronization.AdderSubtractor;

public class Subtractor implements Runnable{
    Count count;

    public Subtractor(Count count){
        this.count = count;
    }
    @Override
    public void run() {
        for(int i=1; i<= 10000 ; i++){
            count.value -= i;
        }
    }
}
