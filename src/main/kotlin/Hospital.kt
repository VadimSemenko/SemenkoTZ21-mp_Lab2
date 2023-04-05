import java.time.LocalDate

data class Hospital(
    val name: String,
    val address: String,
    val profile: String,
    val openingDate: LocalDate,
    val numOfDepartments: Int,
    val numOfBeds: Int,
    val hasPediatricsDepartment: Boolean,
    val medicines: List<Medicine>
): Comparable<Hospital> {
    override fun compareTo(other: Hospital): Int {
        val cmp = name.compareTo(other.name)
        return if (cmp != 0) cmp else numOfBeds.compareTo(other.numOfBeds)
    }
}
