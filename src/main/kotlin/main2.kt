fun main() {
    val x = readLine()!!.toDouble()
    // Нужно заметить, что:
    //     у слагаемых чередуются знаки
    //     числитель следующего слагаемого получается из предыдущего умножением на x*x
    //     знаменатель следующего слагаемого (с номером i, начиная с 0) получается из предыдущего умножением на (2*i)*(2*i+1)

    var a = x // слагаемое с номером 0
    var s = x
    for (i in 1..6) {
        a = - a * x * x / ((2*i)*(2*i+1))
        s += a
    }
    println("s = %6.3f".format(s))
}
