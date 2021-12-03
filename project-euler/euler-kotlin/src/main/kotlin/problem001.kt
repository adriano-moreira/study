fun multiplesOf3and5v1(n: Int): Int {
    var sum = 0
    for (i in 1 until n) {
        if (i % 3 == 0 || i % 5 == 0) {
            sum += i
        }
    }
    return sum
}


fun multiplesOf3and5v2(n: Int): Int {
    val isMod3Or5: (Int) -> Boolean = { it % 3 == 0 || it % 5 == 0; }
    return (3 until n).filter(isMod3Or5).sum()
}
