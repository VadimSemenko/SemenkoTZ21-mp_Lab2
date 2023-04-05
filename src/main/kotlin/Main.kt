import org.springframework.context.annotation.AnnotationConfigApplicationContext
import java.time.LocalDate

fun main() {
    val context = AnnotationConfigApplicationContext(AppConfig::class.java)
    val hospitalContainer = context.getBean(Container::class.java) as HospitalContainer

    val medicines = listOf(
        Medicine("Aspirin", "Tablet", "Bayer", LocalDate.of(2022, 1, 1), 2, 1.99, false),
        Medicine("Paracetamol", "Tablet", "GSK", LocalDate.of(2023, 3, 1), 3, 2.99, false),
        Medicine("Ibuprofen", "Tablet", "Advil", LocalDate.of(2022, 5, 1), 2, 3.99, false)
    )

    hospitalContainer.add(
        Hospital("St. Mary's Hospital", "123 Main St.", "General", LocalDate.of(1990, 1, 1), 10, 500, true, medicines)
    )
    hospitalContainer.add(
        Hospital("Children's Hospital", "456 Elm St.", "Pediatrics", LocalDate.of(2000, 1, 1), 5, 200, true, medicines)
    )
    hospitalContainer.add(
        Hospital("City Hospital", "789 Oak St.", "General", LocalDate.of(1980, 1, 1), 15, 1000, false, medicines)
    )
}
