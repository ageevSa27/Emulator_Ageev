package ru.ageev.Emulator_Ageev;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    private ProductService productService = new ProductService();

    @PostMapping(
            value = "/addProduct", consumes = "application/json", produces = "application/json")
    public Shop createProduct(@RequestParam("shop") String s,@RequestBody Product product) {
        productService.saveProduct(product,s);
        return ShopNet.FindByName(s);
    }


}
