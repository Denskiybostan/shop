package sky.pro.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCart {
    private final List<Integer> items = new ArrayList<>();

    public void add(Integer... ids) {
        for (Integer id : ids) {
            items.add(id);
        }
    }

    public List<Integer> getAll() {
        return Collections.unmodifiableList(items);
    }


}
