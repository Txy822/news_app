package com.example.news_app.domain.model


import com.google.gson.annotations.SerializedName

data class Data(
    @SerializedName("author")
    val author: String = "",
    @SerializedName("content")
    val content: String = "",
    @SerializedName("date")
    val date: String = "",
    @SerializedName("id")
    val id: String = "",
    @SerializedName("imageUrl")
    val imageUrl: String = "",
    @SerializedName("readMoreUrl")
    val readMoreUrl: String = "",
    @SerializedName("time")
    val time: String = "",
    @SerializedName("title")
    val title: String = "",
    @SerializedName("url")
    val url: String = ""
)