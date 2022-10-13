package com.fruzlo.shopping.app.feature_shop.domain.use_case.cart

import android.content.SharedPreferences
import javax.inject.Inject

class AddProduct @Inject constructor(var sf:SharedPreferences) {

    operator fun invoke(productId:Int)  {

        val editor = sf.edit()
        val set: MutableSet<String> = HashSet()
        set.add(productId.toString())
        editor.putStringSet("id", set)
        editor.apply()

    }

}