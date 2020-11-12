package lln.relatorio.jw.model

data class ReportModel(
    val placements: Int? = 0,
    val videoShowings: Int? = 0,
    val hours: Int? = 0,
    val returnVisits: Int? = 0,
    val studies: Int? = 0,
    val comments: String? = ""
)