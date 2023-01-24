package com.example.shoppinglistpractice.domain

data class ShopItem(var id: Int= DEFAULT_ID, val text: String, val count: Int, val isActive: Boolean){
    companion object{
        const val DEFAULT_ID=-1
    }
}
