package sky.pro.demo.Services;

import sky.pro.demo.ShoppingCart;

import java.util.List;
public class ShopService {
    private final ShoppingCart shoppingCart;

    public ShopService(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void add (Integer... ids) {
        shoppingCart.add (ids);
    }

    public List<Integer> getAll(){
        return shoppingCart.getAll();
    }
}
