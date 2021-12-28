package sa.edu.tuwaiq.tsuki.Model.UsersModel.Stats


import com.google.gson.annotations.SerializedName

data class StatsData(
    @SerializedName("all_years")
    val allYears: AllYears,
    @SerializedName("averageDiffs")
    val averageDiffs: AverageDiffs,
    @SerializedName("categories")
    val categories: Categories,
    @SerializedName("completed")
    val completed: Int,
    @SerializedName("days")
    val days: Days,
    @SerializedName("first")
    val first: String,
    @SerializedName("last")
    val last: String,
    @SerializedName("media")
    val media: Int,
    @SerializedName("percentiles")
    val percentiles: Percentiles,
    @SerializedName("time")
    val time: Int,
    @SerializedName("total")
    val total: Int,
    @SerializedName("total_media")
    val totalMedia: Int,
    @SerializedName("units")
    val units: Int
)