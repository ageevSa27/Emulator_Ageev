# Emulator_Ageev
___Заглушка для добаления товаров в магазин___

Имеется 2 магазина "Magnit" "Diksi"
На Url ../addProduct?shop=(магазин) поступает __POST__ запрос 
с телом в виде JSON.

Включается себя  3 параметра:
_name_ - название товара
_price_ - цена
_count_ - колл-во товара
```JSON
{
  "name": "Snickers",
  "price": 65,
  "count": 3
}
``` 
В ответ приходит JSON включащий в себя информацию о магазине (название, колл-во всех товаров) и сами товары данного магазина.

```JSON
{
    "name": "Diksi",
    "countProd": 91,
    "products": [
        {
            "name": "Snickers",
            "price": 65,
            "count": 3
        },
        {
            "name": "Bounty",
            "price": 47,
            "count": 14
        },
        {
            "name": "nuts",
            "price": 83,
            "count": 74
        }
    ]
}
```
