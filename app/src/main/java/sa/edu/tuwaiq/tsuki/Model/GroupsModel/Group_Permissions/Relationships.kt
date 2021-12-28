package sa.edu.tuwaiq.tsuki.Model.GroupsModel.Group_Permissions


import com.google.gson.annotations.SerializedName

data class Relationships(
    @SerializedName("groupMember")
    val groupMember: GroupMember
)