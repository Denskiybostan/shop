package sky.pro.demo;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
@SessionScope
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
