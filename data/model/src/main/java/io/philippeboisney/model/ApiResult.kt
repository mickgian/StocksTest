package io.philippeboisney.model

import com.google.gson.annotations.SerializedName

data class ApiResult<T>(val items: List<T>)