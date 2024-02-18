package sky.pro.demo.Services;

import sky.pro.demo.ShoppingCart;

import java.util.List;

public class ShopService {
    private final ShoppingCart shoppingCart = new ShoppingCart();
    public void add (Integer... ids) {
        shoppingCart.add (ids);
    }

    public List<Integer> getAll(){
        return shoppingCart.getAll();
    }
}
