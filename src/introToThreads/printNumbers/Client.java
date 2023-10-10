package introToThreads.printNumbers;

import staticVariablesMethods.Student;

public class Client {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
//            System.out.println("Client: " + numberPrinter +
//                    "value: " + numberPrinter.toPrint);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }
    }
}
