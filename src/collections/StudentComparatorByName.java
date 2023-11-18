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

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public Comparator<Student> reversed() {
        return Comparator.super.reversed();
    }
}
