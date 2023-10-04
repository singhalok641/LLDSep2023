package accessModifiersCheck;

import accessModifiers.Student;

public class StudentChild extends Student {
    public double doSomething(){
        if (psp < 50) return -1;
        return psp;
    }
}
