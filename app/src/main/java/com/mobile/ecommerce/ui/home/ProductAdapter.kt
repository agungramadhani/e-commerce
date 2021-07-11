package com.mobile.ecommerce.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.mobile.ecommerce.databinding.ProductItemBinding
import com.mobile.ecommerce.model.Product

class ProductAdapter(
    private val productList: ArrayList<Product>,
) : RecyclerView.Adapter<ProductAdapter.ViewHolder>(){

    inner class ViewHolder(private val binding: ProductItemBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(product: Product){
            with(itemView){
                Glide.with(context)
                    .load(product.imageUrl)
                    .placeholder(android.R.color.darker_gray)
                    .error(android.R.color.darker_gray)
                    .into(binding.productImage)
                binding.productName.text = product.name
                binding.productPrice.text = "Rp. ${product.price}"
                binding.productDescription.text = ""
//                setOnClickListener{
//                    mainInterface.click(product)
//                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ProductItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = productList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(productList[position])

}