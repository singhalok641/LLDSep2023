package collections;

import java.util.Comparator;

public class StudentComparatorByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.name.equals(o2.name)){
            return 0;
        }
        if(o1.name.compareTo(o2.name) < 0){
            return -1;
        }
        return 1;
    }
}
