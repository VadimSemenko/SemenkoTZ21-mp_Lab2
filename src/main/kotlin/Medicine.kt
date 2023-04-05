import java.time.LocalDate

data class Medicine(
    val name: String,
    val form: String,
    val manufacturer: String,
    val productionDate: LocalDate,
    val shelfLife: Int,
    val price: Double,
    val requiresPrescription: Boolean
): Comparable<Medicine> {
    override fun compareTo(other: Medicine): Int {
        val cmp = name.compareTo(other.name)
        return if (cmp != 0) cmp else price.compareTo(other.price)
    }
}
