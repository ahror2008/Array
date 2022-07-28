package Main

fun main(args: Array<String>) {
    val array = arrayOf(15, 22, 73, 94, 25, 55, 77, 18, 59)
    val arrayOdd = IntArray(100)
    var count = 0
    var res=0
    for (i in array.indices) {
        print(" " + array[i])
        if (array[i] % 11 == 0) {
            arrayOdd[count] = array[i]
            count++
        }
    }
    println()
    for (num in 0 until count) {
        println(" " + arrayOdd[num])

        res +=arrayOdd[num]
    }
    println("Bunday sonlar $count ta")
    println(res)

}