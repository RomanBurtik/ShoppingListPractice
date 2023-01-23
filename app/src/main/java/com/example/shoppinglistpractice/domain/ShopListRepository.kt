package com.example.shoppinglistpractice.domain

interface ShopListRepository {

    fun addShopItem(shopItem: ShopItem)
    fun deleteShopItem(shopItem: ShopItem)
    fun editShopItem(shopItem: ShopItem):ShopItem
    fun getListOfShopItems(): List<ShopItem>
    fun getShopItem(): ShopItem
}


