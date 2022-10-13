package com.fruzlo.shopping.app.feature_shop.presentation.adapters

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fruzlo.shopping.app.databinding.ItemProductBinding
import com.fruzlo.shopping.app.feature_shop.domain.model.Product
import com.fruzlo.shopping.app.feature_shop.presentation.product.ProductDetailActivity

class ProductAdapter(val context: Context)
    : RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    private val productList = ArrayList<Product>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val binding = ItemProductBinding.inflate(LayoutInflater.from(parent.context),
            parent, false)
        return ProductViewHolder(context,binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val (_, _, id, image, _, name, price) = productList[position]

        Glide.with(context)
            .load(image)
            .into(holder.binding.image)

        holder.binding.label.text = name
        holder.binding.price.text = "INR $price"

        holder.bind(productList[position])

    }

    override fun getItemCount(): Int {
        return productList.size
    }

    fun setList(products:List<Product>){
        productList.clear()
        productList.addAll(products)
    }

    class ProductViewHolder(val context: Context, val binding:ItemProductBinding)
        :RecyclerView.ViewHolder(binding.root) {

        val TAG ="ProductViewHolder"

            fun bind(product: Product){

                Log.d(TAG,"in bind")

                binding.productView.setOnClickListener {
                    val intent = Intent(context, ProductDetailActivity::class.java)
                    intent.putExtra("name", product.name)
                    intent.putExtra("image", product.image)
                    intent.putExtra("id", product.id)
                    intent.putExtra("price", product.price)
                    context.startActivity(intent)
                }

            }

    }

}