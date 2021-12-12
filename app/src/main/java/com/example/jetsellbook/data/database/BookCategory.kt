package com.example.jetsellbook.data.database

data class BookCategory(
    val id: Long = 0,
    val book_type: String="",
    val image: String="",
    val description: String="",
)
val DEFAULT_CATEGORY_BOOK = listOf(
    BookCategory(
        1,
        "Tinh cảm",
        "https://cuahang.revisach.com/wp-content/uploads/2021/03/sach-duong-may-qua-xu-tuyet.png",
        "",
    ),
    BookCategory(
        2,
        "Sách Giáo Khoa",
        "https://cdn.chanhtuoi.com/uploads/2018/05/nhung-cuon-sach-hay-6.jpg.webp",
        ""
    ),
    BookCategory(
        3,
        "Truyện Cười",
        "https://cdn.chanhtuoi.com/uploads/2018/05/nhung-cuon-sach-hay-6.jpg.webp",
        ""
    ),
    BookCategory(
        4,
        "Sách đời sống",
        "https://cdn.chanhtuoi.com/uploads/2018/05/nhung-cuon-sach-hay-6.jpg.webp",
        ""
    ),
    BookCategory(
        5,
        "Sách Hay",
        "https://cdn.chanhtuoi.com/uploads/2018/05/nhung-cuon-sach-hay-6.jpg.webp",
        ""
    ),
)