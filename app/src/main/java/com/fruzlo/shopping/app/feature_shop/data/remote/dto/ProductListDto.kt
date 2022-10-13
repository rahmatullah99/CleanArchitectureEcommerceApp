package com.fruzlo.shopping.app.feature_shop.data.remote.dto

data class ProductListDto(
    val count: Int,
    val count_total: Int,
    val pages: Int,
    val products: List<ProductDto>,
    val status: String
)