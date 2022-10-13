package com.fruzlo.shopping.app.feature_shop.data.repository

import com.fruzlo.shopping.app.feature_shop.data.remote.Api
import com.fruzlo.shopping.app.feature_shop.data.remote.dto.CategoryListDto
import com.fruzlo.shopping.app.feature_shop.data.remote.dto.ProductDto
import com.fruzlo.shopping.app.feature_shop.data.remote.dto.ProductListDto
import com.fruzlo.shopping.app.feature_shop.domain.repository.Repository
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem
import javax.inject.Inject

class RepositoryImpl @Inject constructor(val api:Api):Repository {
    override suspend fun getProductList(): ProductListDto {
        return api.getProductList()
    }

    override suspend fun getCategoryList(): CategoryListDto {
        return api.getCategories()
    }

    override suspend fun getRecentOffers(): List<CarouselItem> {
        return api.getRecentOffers()
    }

    override suspend fun getSelectedProductList(query: String): ProductListDto {
        return api.getSelectedProductList(query)
    }

    override suspend fun getLatestProductList(count: Int): ProductListDto {
        return api.getLatestProductList(count)
    }

    override suspend fun getProductDetails(id: Int): ProductDto {
        return api.getProductDetails(id)
    }

    override suspend fun productOrder(id: Int): ProductDto {
        TODO("Not yet implemented")
    }


}