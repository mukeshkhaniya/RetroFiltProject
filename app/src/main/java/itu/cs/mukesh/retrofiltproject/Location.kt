package itu.cs.mukesh.retrofiltproject

data class Location(
    val country: String,
    val lat: Double,
    val localtime: String,
    val localtime_epoch: Int,
    val lon: Int,
    val name: String,
    val region: String,
    val tz_id: String
)