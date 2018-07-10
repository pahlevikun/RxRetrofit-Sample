package id.pahlevikun.rxretrofitsample.model

import com.google.gson.annotations.SerializedName

data class Mockup(
        @SerializedName("msg") val msg: String,
        @SerializedName("name") val name: String,
        @SerializedName("full_name") val fullName: String,
        @SerializedName("owner") val owner: OwnerX
)