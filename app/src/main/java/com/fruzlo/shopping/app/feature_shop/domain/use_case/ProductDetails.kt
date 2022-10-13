package com.fruzlo.shopping.app.feature_shop.domain.use_case

import com.fruzlo.shopping.app.feature_shop.data.remote.dto.ProductDto
import com.fruzlo.shopping.app.feature_shop.domain.repository.Repository
import javax.inject.Inject

class ProductDetails @Inject constructor(val repository: Repository) {

    suspend operator fun invoke(id:Int): ProductDto {
        return repository.getProductDetails(id)
    }

}