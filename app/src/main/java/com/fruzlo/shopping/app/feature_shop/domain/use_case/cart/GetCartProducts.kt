package com.fruzlo.shopping.app.feature_shop.domain.use_case.cart

import android.content.SharedPreferences
import javax.inject.Inject

class GetCartProducts @Inject constructor(var sf: SharedPreferences) {

    operator fun invoke(): MutableSet<String>? {
        return sf.getStringSet("id", null)
    }

}