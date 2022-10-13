package com.fruzlo.shopping.app.feature_shop.domain.repository

import com.fruzlo.shopping.app.feature_shop.data.remote.dto.CategoryListDto
import com.fruzlo.shopping.app.feature_shop.data.remote.dto.ProductDto
import com.fruzlo.shopping.app.feature_shop.data.remote.dto.ProductListDto
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

interface Repository {

    suspend fun getProductList(): ProductListDto
    suspend fun getCategoryList(): CategoryListDto
    suspend fun getRecentOffers(): List<CarouselItem>
    suspend fun getSelectedProductList(query:String): ProductListDto
    suspend fun getLatestProductList(count:Int): ProductListDto
    suspend fun getProductDetails(id:Int): ProductDto
    suspend fun productOrder(id:Int): ProductDto
}