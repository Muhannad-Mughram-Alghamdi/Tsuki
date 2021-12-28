package sa.edu.tuwaiq.tsuki.Model.GroupsModel.Group_Members


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("group")
    val group: Group,
    @SerializedName("notes")
    val notes: Notes,
    @SerializedName("permissions")
    val permissions: Permissions,
    @SerializedName("user")
    val user: User
)