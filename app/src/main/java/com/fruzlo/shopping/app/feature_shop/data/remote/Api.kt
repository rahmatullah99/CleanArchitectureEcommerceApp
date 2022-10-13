package com.fruzlo.shopping.app.feature_shop.data.remote

import com.fruzlo.shopping.app.feature_shop.data.remote.dto.CategoryListDto
import com.fruzlo.shopping.app.feature_shop.data.remote.dto.ProductDto
import com.fruzlo.shopping.app.feature_shop.data.remote.dto.ProductListDto
import com.fruzlo.shopping.app.feature_shop.domain.model.ProductOrder
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem
import org.json.JSONObject
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface Api {

    @GET("/services/listCategory")
    suspend fun getCategories(): CategoryListDto

    @GET("/services/listProduct")
    suspend fun getProductList(): ProductListDto

    @GET("/services/listFeaturedNews")
    suspend fun getRecentOffers(): List<CarouselItem>

    @GET("/services/listProduct")
    suspend fun getSelectedProductList(@Query("q")query:String): ProductListDto

    @GET("/services/getProductDetails")
    suspend fun getProductDetails(@Query("id")id:Int): ProductDto

    @GET("/services/listProduct")
    suspend fun getLatestProductList(@Query("count")count:Int): ProductListDto

    @POST("/services/submitProductOrder")
    suspend fun orderProduct(@Body productOrder: ProductOrder): Call<JSONObject>

}