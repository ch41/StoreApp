package com.example.product.api

import kotlinx.serialization.Serializable

@Serializable
data class Products(
    val best_seller: List<BestSellerProduct>,
    val home_store: List<HomeStoreProduct>
)