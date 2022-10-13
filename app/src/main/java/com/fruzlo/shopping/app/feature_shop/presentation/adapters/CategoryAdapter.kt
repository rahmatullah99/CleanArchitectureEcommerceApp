package com.fruzlo.shopping.app.feature_shop.presentation.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.fruzlo.shopping.app.databinding.ItemCategoryBinding
import com.fruzlo.shopping.app.feature_shop.domain.model.Category
import com.fruzlo.shopping.app.feature_shop.presentation.category.CategoryActivity

class CategoryAdapter(private val context: Context) :
    RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder?>() {

    private val categoryList = ArrayList<Category>()

    override fun getItemCount(): Int {
        return categoryList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : CategoryViewHolder {
        val binding = ItemCategoryBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false)
        return CategoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        holder.bind(context,categoryList[position])
    }

    fun setList(categories:List<Category>){
        categoryList.clear()
        categoryList.addAll(categories)
    }

    class CategoryViewHolder(private val binding: ItemCategoryBinding)
        :RecyclerView.ViewHolder(binding.root) {

        fun bind(context: Context,category: Category){

            binding.categoryView.setOnClickListener {
                val intent = Intent(context, CategoryActivity::class.java)
                intent.putExtra("catId", category.id)
                intent.putExtra("categoryName", category.name)
                context.startActivity(intent)
            }

        }
    }

}