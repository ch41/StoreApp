package com.example.product.api

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class HomeStoreProduct(
    val id: Int,
    @SerialName("is_buy")
    val isBuy: Boolean,
    @SerialName("is_new")
    val isNew: Boolean,
    val picture: String,
    val subtitle: String,
    val title: String
)