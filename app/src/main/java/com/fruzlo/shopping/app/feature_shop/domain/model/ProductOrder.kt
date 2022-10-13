package com.fruzlo.shopping.app.feature_shop.domain.model

import java.sql.Time

data class ProductOrder(

    val address:String,
    val buyer:String,
    val comment:String,
    val created_at: Time,
    val last_update: Time,
    val date_ship: Time,
    val email:String,
    val phone:String,
    val serial:String,
    val shipping:String,
    val shipping_location:String,
    val shipping_rate:String,
    val status:String,
    val tax:String,
    val total_fees:String

)
