fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    val toRemove = mutableListOf<Int>()
    for (item in list) {
        if (item % 2 == 0) {
            toRemove.add(item)
        }
    }
    list.removeAll(toRemove)
    println(list) // Output: [1, 3, 5]

    val list2 = mutableListOf(1, 2, 3, 4, 5)
    val toRemove2 = list2.filter { it % 2 == 0 }
    list2.removeAll(toRemove2)
    println(list2) // Output: [1, 3, 5]
}
