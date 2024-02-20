package sky.pro.demo.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.demo.Services.ShopService;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShopController {
    private final ShopService service;

    public ShopController(ShopService service) {
        this.service = service;
    }

    @GetMapping("/add")

    public void add(@RequestParam Integer[] ids) {
        service.add(ids);

    }

    @GetMapping("/get")
    public List<Integer> get() {
        return service.getAll();

    }


}
