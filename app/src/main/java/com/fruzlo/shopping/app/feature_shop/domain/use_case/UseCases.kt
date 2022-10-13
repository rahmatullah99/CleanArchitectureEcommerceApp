package com.fruzlo.shopping.app.feature_shop.domain.use_case

import com.fruzlo.shopping.app.feature_shop.domain.use_case.cart.AddProduct
import com.fruzlo.shopping.app.feature_shop.domain.use_case.cart.GetCartProducts
import com.fruzlo.shopping.app.feature_shop.domain.use_case.cart.RemoveProduct


class UseCases(
    val addProduct: AddProduct,
    val getCartProducts: GetCartProducts,
    val removeProduct: RemoveProduct,
    val getCategories: GetCategories,
    val getRecentOffers: GetRecentOffers,
    val getRecentProducts: GetRecentProducts,
    val productDetails: ProductDetails,
    val getSingleProduct: GetSingleProduct,
    val search: Search
    )