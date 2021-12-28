package sa.edu.tuwaiq.tsuki.Model.MediaRelationShipsModel.Franchieses


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("installments")
    val installments: Installments
)