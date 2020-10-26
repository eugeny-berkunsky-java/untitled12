import kotlin.math.sin

fun main() {
    val x = readLine()!!.toDouble()
    val n = readLine()!!.toInt()
    val p1 = f1(x,n)
    val p2 = f2(x,n)
    val p3 = f3(x,n)

    println("p1 = %6.3f".format(p1))
    println("p2 = %6.3f".format(p2))
    println("p3 = %6.3f".format(p3))
}

fun f1(x: Double, n: Int): Double {
    var a = sin(x)
    var res = a
    for (i in 2..n) {
        a *= sin(x)
        res += a
    }
    return res
}

fun f2(x: Double, n: Int): Double {
    var a = x
    var res = sin(a)
    for (i in 2..n) {
        a *= x
        res += sin(a)
    }
    return res
}

fun f3(x: Double, n: Int): Double {
    var a = sin(x)
    var res = a
    for (i in 2..n) {
        a = sin(a)
        res += a
    }
    return res
}
