package com.fruzlo.shopping.app.feature_shop.presentation.cart

import androidx.lifecycle.ViewModel
import com.fruzlo.shopping.app.feature_shop.domain.model.Product
import com.fruzlo.shopping.app.feature_shop.domain.model.ProductList
import com.fruzlo.shopping.app.feature_shop.domain.use_case.UseCases
import com.fruzlo.shopping.app.feature_shop.domain.use_case.cart.GetCartProducts
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CartViewModel @Inject constructor(private val useCases: UseCases):ViewModel() {


    fun getCartProducts():MutableList<Product>{
        var cartProducts:MutableList<Product> = emptyList<Product>() as MutableList<Product>
        var productsIds = useCases.getCartProducts()
        for(i in productsIds!!){
            GlobalScope.launch {
                useCases.getSingleProduct(i.toInt())
            }

        }

        return cartProducts
    }

    fun increaseProduct(id:Int){
        val foo = useCases.getCartProducts()
    }

}