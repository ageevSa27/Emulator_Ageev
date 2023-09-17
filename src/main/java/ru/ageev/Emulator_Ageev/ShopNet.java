package ru.ageev.Emulator_Ageev;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShopNet {
     public static Map<String,Shop> shops = new HashMap();
     private static List<Shop> allShop = new ArrayList<Shop>(shops.values());

     public static Shop FindByName(String name){
         return shops.get(name);
     }


}
