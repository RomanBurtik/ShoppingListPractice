package com.example.shoppinglistpractice.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

//    я не могу просто так получить элемент из списка. Нужно представить таблицу. если мне нужно получить
//    все данные, кторые содержатся в колонках x для строки y, то мне нужно сослаться на какое-то значение
//    в колонке x, которое будет служить только для этого. В моём случае, чтобы получить нужную строку y
//    я ищу соответствующее ей значение в колонке х. после того, как я нашёл эту строку, мне её нужно показать
//    поэтому метод возвращает найденный объект.
    fun getShopItem(shopItemId: Int): ShopItem{
        return shopListRepository.getShopItem(shopItemId)
    }
}