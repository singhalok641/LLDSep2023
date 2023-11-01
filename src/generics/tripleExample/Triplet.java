package generics.tripleExample;

public class Triplet<Type> {
    private Type left;
    private Type right;
    private Type middle;

    public Triplet(Type left, Type middle, Type right){
        this.left = left;
        this.middle = middle;
        this.right = right;
    }

    public Type getLeft() {
        return left;
    }

    public Type getRight() {
        return right;
    }

    public Type getMiddle() {
        return middle;
    }
}
