package com.fruzlo.shopping.app.feature_shop.presentation.search

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.fruzlo.shopping.app.databinding.ActivitySearchBinding
import com.fruzlo.shopping.app.feature_shop.domain.model.Product
import com.fruzlo.shopping.app.feature_shop.presentation.adapters.ProductAdapter

class CheckoutActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySearchBinding
    lateinit var productAdapter: ProductAdapter
    lateinit var products: ArrayList<Product>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        val layoutManager = GridLayoutManager(this, 2)
        binding.productList.layoutManager = layoutManager
        binding.productList.adapter = productAdapter

    }
}