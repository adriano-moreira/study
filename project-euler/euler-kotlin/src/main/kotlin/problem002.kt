fun fibonacciSequence(n: Int): List<Int> {
    val list = mutableListOf(1, 2)
    while (list.size < n) {
        val last = list.last()
        val penultimate = list[list.size - 2]
        list.add(last + penultimate)
    }
    return list;
}

fun fibonacciEvenSum(n: Int): Int {
    val isEven: (Int) -> Boolean = { it % 2 == 0 }
    return fibonacciSequence(n).filter(isEven).sum()
}