package sky.pro.demo.Services;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import sky.pro.demo.ShoppingCart;

import java.util.List;
@Component
@SessionScope
public class ShopService {
    private final ShoppingCart shoppingCart = new ShoppingCart();
    public void add (Integer... ids) {
        shoppingCart.add (ids);
    }

    public List<Integer> getAll(){
        return shoppingCart.getAll();
    }
}
