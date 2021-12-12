package com.example.jetsellbook.model

import android.net.Uri

data class BooksModel(
    val id: String,
    val book_name: String,
    val image: String,
    val price: Int,
    val author:String,
    val price_promotion:Int,
    val description: String,
    val created_at: String,
    val updated_at: String,
)
//{
//    constructor() : this("", "", Ur, "","","","","")
//}
