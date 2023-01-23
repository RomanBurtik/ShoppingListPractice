package com.example.shoppinglistpractice.domain

class GetShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(): ShopItem{
        return shopListRepository.getShopItem()
    }
}