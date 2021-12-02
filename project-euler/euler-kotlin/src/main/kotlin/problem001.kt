fun multiplesOf3and5(n: Int): Int {
    var sum = 0
    for (i in 1..n) {
        if ((i % 3 == 0) || (i % 5 == 0)) {
            println(n)
            sum += i
        }
    }
    return sum
}