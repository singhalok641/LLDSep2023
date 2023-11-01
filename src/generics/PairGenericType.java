package generics;

public class PairGenericType<FIRST, SECOND> {
    private FIRST first;
    private SECOND second;

    public PairGenericType(FIRST first, SECOND second){
        this.first = first;
        this.second = second;
    }

    public FIRST getFirst() {
        return first;
    }

    public SECOND getSecond() {
        return second;
    }
}
