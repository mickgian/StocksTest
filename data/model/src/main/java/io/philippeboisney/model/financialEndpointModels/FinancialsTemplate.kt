package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class FinancialsTemplate(
    @SerializedName("code")
    val code: String? = null,
    @SerializedName("maxAge")
    val maxAge: Int? = null
)