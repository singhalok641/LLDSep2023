package exceptionHandling;

public class Doer {

    public Object findStudentByRollNo(int roll) throws ClassNotFoundException {
        Integer c = 0;
//        try {
//            c = roll / 0;
//
//            if (roll < 10) {
//                return new Object();
//            }
//        }
//        catch(Exception exception){
//            System.out.println("Some exception has occured");
//        }
        throw new ClassNotFoundException();
    }

    public void doSomething(){
        int a = 1/0;
    }
}
