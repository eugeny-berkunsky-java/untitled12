fun main() {
    val a = readLine()!!.toDouble()
    val x = readLine()!!.toDouble()
    val n = readLine()!!.toInt()

    var res = x
    for (i in 1..n) {
        res = (res+a) * (res+a)
    }
    res += a // нужно обратить внимание, что при последнем сложении возводить в квадрат не нужно

    println("res = %6.3f".format(res))
}
