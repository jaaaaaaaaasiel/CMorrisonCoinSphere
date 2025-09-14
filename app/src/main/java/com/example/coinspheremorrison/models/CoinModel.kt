package com.example.coinspheremorrison.models

data class CoinModel(
    val num: Int,
    val image: String,
    val name : String,
    val price: String
)
    val coniList = listOf(
        CoinModel(1,
            "https://cdn.pixabay.com/photo/2021/04/30/16/47/btc-logo-6219386_1280.png",
            "Bitcoin",
            "$109,797.37"),
        CoinModel(2,
           "https://cryptologos.cc/logos/ethereum-eth-logo.png",
            "Ethereum",
            "$4,321.21"),
        CoinModel(3,
            "https://cryptologos.cc/logos/tether-usdt-logo.png",
            "Tether",
            "$1.0000"),
        CoinModel(4,
            "https://cryptologos.cc/logos/xrp-xrp-logo.png",
            "XRP",
            "$2.8100"),
        CoinModel(5,
            "https://cryptologos.cc/logos/bnb-bnb-logo.png",
            "BNB",
            "$845.000"),
        CoinModel(6,
            "https://cryptologos.cc/logos/solana-sol-logo.png",
            "Solana",
            "$201.8500"),
        CoinModel(7,
            "https://cryptologos.cc/logos/usd-coin-usdc-logo.png",
            "USDC",
            "$0.9998"),
        CoinModel(8,
            "https://cryptologos.cc/logos/dogecoin-doge-logo.png",
            "DogeCoin",
            "0.1320"),
        CoinModel(9,
            "https://cryptologos.cc/logos/tron-trx-logo.png",
            "TRON",
            "$0.3630")
    )

