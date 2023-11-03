package streams;

import java.util.ArrayList;
import java.util.List;

public class DataAggregator {

    public List<Integer> getItems(){
        DatabaseService service = new DatabaseService(new ArrayList<>());
        service.list.addAll(List.of(1, 2, 3, 4));
        return service.list;
    }


}
