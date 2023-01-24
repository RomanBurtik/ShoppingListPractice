package com.example.shoppinglistpractice.domain

class EditShopItemUseCase(private val shopListRepository: ShopListRepository) {

//    данный метод ничего не возвращает, потому что его задача получить элемент списка по его айди,
//    изменить поля объекта, не трогая поле айди и вставить изменённый объект обратно в список.
//    изменение объекта я буду писать в другом классе, поэтому этот метод является только совмещениемм двух,
//    уже имеющихся методов.
    fun editShopItem(shopItem: ShopItem){
        return shopListRepository.editShopItem(shopItem)
    }
}