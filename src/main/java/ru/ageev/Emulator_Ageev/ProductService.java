package ru.ageev.Emulator_Ageev;


public class ProductService {


    public Shop saveProduct(Product product,String s){
        Shop shop = ShopNet.FindByName(s);
        shop.getProducts().add(product);
        shop.setCountProd(shop.getCountProd() + product.getCount());
        return shop;
    }
}
