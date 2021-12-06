package com.example.myreceycleview

object KopiData {

    private val kopiNames = arrayOf("Affogato",
        "Americano",
        "Cappuccino",
        "Latte",
        "Cotardo",
        "Esspresso",
        "Flat Latte",
        "Macchiato",
        "Mocaccino",
        "Ristretto")

    private val kopiDetails = arrayOf("affogato adalah es krim vanila yang dituang espresso shot. Paduan pahitnya kopi hitam dan es krim yang manis dan lembut menciptakan sensasi rasa menyenangkan",
        "Americano terdiri dari satu shot espresso yang dituangkan dalam cangkir berukuran 178 mililiter yang dicampur dengan air panas hingga memenuhi gelas. Minuman ini kerap disajikan dalam panas maupun dingin yang disebut iced Americano.",
        "Coppucino merupakan minuman yang terdiri dari espresso dan steamed milk dengan rasio 1:1. Namun, ada juga yang memakai perbandingan 1/3 espresso, 1/3 steamed milk, dan 1/3 susu foam.",
        "Latte adalah racikan espresso sama seperti cappuccino. Tetapi dua jenis racikan ini berbeda dengan komposisi dan rasio bahannya. Latte biasanya menggunakan perbandingan espresso dan susu 2:1. Selain rasanya nikmat, latte biasanya disajikan dalam cangkir dengan motif indah di atasnya atau yang banyak disebut latte art.",
        "Kopi Cortado merupakan minuman kopi yang disajikan hangat berukuran lebih kecil yang terdiri dari espresso dan susu hangat (steamed milk). Kopi Cortado juga banyak digemari karena strukturnya yang sederhana dan disajikan dengan ukuran yang kecil.",
        "Minuman kopi paling dasar ini biasanya disajikan dalam demitasse alias cangkir khusus espresso berukuran 30 mililiter (satu shot) sampai 118 mililiter. Espresso bertekstur pekat dan pahit, dengan buih putih alias crema di atasnya",
        "Flat White yang secara umum punya tampilan yang hampir sama dengan Macchiato. Hanya saja, Flat White terlihat lebih halus dengan tekstur seperti beludru dan warna putih rata sesuai namanya. Flat White adalah minuman kopi berbasis espresso yang terdiri dari dua gelas espresso yang kaya dan kuat dengan lapisan microfoam berbusa yang dihasilkan dari steamed milk disajikan pada gelas berukuran lebih kecil",
        "Kalau kamu penikmati kopi yang cenderung tidak terlalu pahit, kamu bisa pesan macchiato sebagai alternatif. Rasio steamed milk dalam minuman ini lebih besar dari espresso, sehingga ada sentuhan milky dan gurih. ",
        "Espresso, susu, dan cokelat merupakan paduan ideal dari secangkir moccacino. Dibanding kopi, lembutnya cokelat dan susu lebih mendominasi. Biasanya minuman ini menggunakan cokelat bubuk untuk campuran dan garnish, tapi ada juga yang memakai sirup cokelat di atasnya.",
        "Ristretto berarti terbatas atau terlarang dalam bahasa Italia. Istilah ini kemudian diadopsi menjadi salah satu nama sajian minuman yang memiliki porsi lebih sedikit dibandingkan dengan Espress. takaran air yang harus digunakan, namun dalam bentuk perbandingan dapat digambarkan dengan 1:2 untuk Espresso dan 1:1 artinya takaran air untuk Ristretto adalah setengah dari yang digunakan untuk membuat Espresso.")


    private val kopiImages = intArrayOf(R.drawable.affogato,
        R.drawable.americano,
        R.drawable.capuccino,
        R.drawable.cotardo,
        R.drawable.esspresso,
        R.drawable.flatlatte,
        R.drawable.latte,
        R.drawable.macchiato,
        R.drawable.mocaccino,
        R.drawable.ristretto)

    val listData: ArrayList<Kopi>
        get() {
            val list = arrayListOf<Kopi>()
            for (position in kopiNames.indices) {
                val kopi = Kopi()
                kopi.name = kopiNames[position]
                kopi.detail = kopiDetails[position]
                kopi.photo = kopiImages[position]
                list.add(kopi)
            }
            return list
        }

}