package com.example.product.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class BestSellerProduct(
    @SerialName("discount_price")
    val discountPrice: Int,
    val id: Int,
    @SerialName("is_favorites")
    val isFavorites: Boolean,
    val picture: String,
    @SerialName("price_without_discount")
    val priceWithoutDiscount: Int,
    val title: String
)