package com.example.shoppinglistpractice.domain

class GetListOfShopItemsUseCase(private val shopListRepository: ShopListRepository) {

    fun getListOfShopItems(): List<ShopItem> {
        return shopListRepository.getListOfShopItems()
    }
}