package com.fruzlo.shopping.app.feature_shop.domain.model

import com.fruzlo.shopping.app.feature_shop.data.remote.dto.ProductDto

data class ProductList(
    val count: Int,
    val count_total: Int,
    val pages: Int,
    val products: List<ProductDto>,
    val status: String
)
