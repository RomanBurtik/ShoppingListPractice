package com.example.shoppinglistpractice.data

import androidx.lifecycle.MutableLiveData
import com.example.shoppinglistpractice.domain.ShopItem
import com.example.shoppinglistpractice.domain.ShopListRepository

// object является заменой singletone, чтобы я везде использовал одну и ту же версию своего списка,
// а не в каждом классе новый.
object ShopListRepositoryImpl : ShopListRepository {

    private val shopList = mutableListOf<ShopItem>()

    private var distributedId=0

//    так как базы данных нету, пришлось вручную добавлять новому элементу списка уникальный айди.
//    по умолчанию id = -1. далее, при создании нового элемента, если его айди не равен id по умолчанию,
//    ему будет выдан новый айди из переменной раздача айди и переменная увеличится на 1.
    override fun addShopItem(shopItem: ShopItem) {
        if (shopItem.id==ShopItem.DEFAULT_ID){
            shopItem.id=distributedId++
        }
        shopList.add(shopItem)
    }

    override fun deleteShopItem(shopItem: ShopItem) {
        shopList.remove(shopItem)
    }

//    данная реализация получает объект, на который нажали, удаляет его из списка и заново добавляет в список.
    override fun editShopItem(shopItem: ShopItem) {
        val oldItem= getShopItem(shopItem.id)
        shopList.remove(oldItem)
        addShopItem(shopItem)
    }

    override fun getListOfShopItems(): List<ShopItem> {
//        .toList() делает копию коллекции. то есть теперь я возврашаю копию.
        return shopList.toMutableList()
    }

    override fun getShopItem(shopItemId: Int): ShopItem {
//        .find возвращает либо то, что от него хотим, либо null, поэтому приходится обрабатывать null
        return shopList.find { it.id == shopItemId }
            ?: throw NoSuchElementException("ShopItem with id $shopItemId has not been fount")
    }
}