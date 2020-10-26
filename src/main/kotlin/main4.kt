fun main() {
    val n = readLine()!!.toInt()
    val a = countDigits(n)
    val b = sumOfDigits(n)
    val c = firstDigit(n)

    println("количество цифр = $a")
    println("сумма цифр = $b")
    println("Первая цифра = $c")
}

fun countDigits(n: Int): Int {
    var t = n
    var count = 0
    while (t > 0) {
        t /= 10
        count++
    }
    return if (count==0) 1 else count
}

fun sumOfDigits(n: Int): Int {
    var t = n
    var sum = 0
    while (t > 0) {
        sum += t % 10
        t /= 10
    }
    return sum
}

fun firstDigit(n: Int): Int {
    var t = n
    var res = 0
    while (t > 0) {
        res = t % 10
        t /= 10
    }
    return res
}
