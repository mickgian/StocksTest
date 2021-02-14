package io.philippeboisney.model.financialEndpointModels


import com.google.gson.annotations.SerializedName

data class NetTangibleAssets(
    @SerializedName("fmt")
    val fmt: String? = null,
    @SerializedName("longFmt")
    val longFmt: String? = null,
    @SerializedName("raw")
    val raw: Long? = null
)