package streams;

import java.util.List;

public class DatabaseService {
    List<Integer> list;

    public DatabaseService(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getList() {
        return list;
    }
}
