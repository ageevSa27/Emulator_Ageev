package ru.ageev.Emulator_Ageev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class EmulatorAgeevApplication {

    public static Shop shop1 = new Shop("Magnit");
    public static Shop shop2 = new Shop("Diksi");



    public static void main(String[] args) {
        ShopNet.shops.put(shop1.getName(),shop1);
        ShopNet.shops.put(shop2.getName(),shop2);
        SpringApplication.run(EmulatorAgeevApplication.class, args);
    }
}
