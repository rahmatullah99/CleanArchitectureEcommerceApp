package com.fruzlo.shopping.app.feature_shop.presentation.adapters

import android.app.AlertDialog
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.fruzlo.shopping.app.databinding.ItemCartBinding
import com.fruzlo.shopping.app.databinding.QuantityDialogBinding
import com.fruzlo.shopping.app.feature_shop.domain.model.Product

class CartAdapter(val context: Context)
    : RecyclerView.Adapter<CartAdapter.CartViewHolder>() {

    private val productList = ArrayList<Product>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CartViewHolder {
        val binding = ItemCartBinding.inflate(LayoutInflater.from(parent.context),
            parent, false)
        return CartViewHolder(context,binding)
    }

    override fun onBindViewHolder(holder: CartViewHolder, position: Int) {
        val (_, _, id, image, _, name, price) = productList[position]

        Glide.with(context)
            .load(image)
            .into(holder.binding.image)

        holder.binding.name.text = name
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

    class CartViewHolder(val context: Context, val binding: ItemCartBinding)
        :RecyclerView.ViewHolder(binding.root) {

        val TAG ="ProductViewHolder"

        fun bind(product: Product){

            Log.d(TAG,"in bind")

            binding.cartItemView.setOnClickListener {

                val quantityDialogBinding = QuantityDialogBinding.inflate(LayoutInflater.from(context));

                val dialog = AlertDialog.Builder(context)
                    .setView(quantityDialogBinding.root)
                    .create();

                dialog.window?.setBackgroundDrawableResource(me.relex.circleindicator.R.color.mtrl_btn_transparent_bg_color)

                quantityDialogBinding.productName.text = product.name
                quantityDialogBinding.productStock.text = "Stock: " + product.stock
                quantityDialogBinding.quantity.setText("............");//To write
                val stock = product.stock


                quantityDialogBinding.plusBtn.setOnClickListener {
                    //on plus
                }

                quantityDialogBinding.minusBtn.setOnClickListener{
                    //on minus
                }

                quantityDialogBinding.saveBtn.setOnClickListener {
                    //on save
                }

                dialog.show();

            }

        }

    }

}