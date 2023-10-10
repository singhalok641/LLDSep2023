package introToThreads.printNumbers;

public class NumberPrinter implements Runnable{
    int toPrint;

    public NumberPrinter(int toPrint){
        this.toPrint = toPrint;
    }

    @Override
    public void run() {
        System.out.println("Printed by thread: " +
                Thread.currentThread().getName() + " => "+ toPrint);
    }
}
