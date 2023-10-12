package synchronization.AdderSubtractorMutex;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Count count;
//    Lock lock;

    public Subtractor(Count count){
        this.count = count;
//        this.lock = lock;
    }
    @Override
    public void run() {
        for(int i=1; i<= 1000000 ; i++){
//            lock.lock();
            synchronized (count) {
                count.value -= i;
            }
//            lock.unlock();
        }
    }
}
