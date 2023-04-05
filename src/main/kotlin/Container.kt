interface Container<T> {
    fun add(element: T)
    fun remove(index: Int)
    fun update(index: Int, element: T)
    fun get(index: Int): T
    fun getAll(): List<T>
}

class HospitalContainer : Container<Hospital> {
    private val hospitals: MutableList<Hospital> = mutableListOf()

    override fun add(element: Hospital) {
        hospitals.add(element)
    }

    override fun remove(index: Int) {
        hospitals.removeAt(index)
    }

    override fun update(index: Int, element: Hospital) {
        hospitals[index] = element
    }

    override fun get(index: Int): Hospital {
        return hospitals[index]
    }

    override fun getAll(): List<Hospital> {
        return hospitals
    }
}
