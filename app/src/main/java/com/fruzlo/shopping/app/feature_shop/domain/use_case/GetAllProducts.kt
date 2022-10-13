package com.fruzlo.shopping.app.feature_shop.domain.use_case

import com.fruzlo.shopping.app.feature_shop.data.remote.dto.CategoryListDto
import com.fruzlo.shopping.app.feature_shop.data.remote.dto.ProductListDto
import com.fruzlo.shopping.app.feature_shop.domain.repository.Repository
import javax.inject.Inject

class GetAllProducts @Inject constructor(val repository: Repository) {

    suspend operator fun invoke(): ProductListDto {
        return repository.getProductList()
    }

}