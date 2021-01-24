package io.philippeboisney.model

import com.google.gson.annotations.SerializedName

data class ApiResult<T>(@SerializedName("total_count") val totalCount: Int = arrayListOf<T>(Stocks.Result).size,
                     @SerializedName("items") val items: List<T>)