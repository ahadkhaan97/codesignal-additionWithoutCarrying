fun main() {
    print(solution(456, 1734))
}

fun solution(param1: Int, param2: Int): Int {
    var first = param1.toString()
    var second = param2.toString()
    if (first.length > second.length) {
        second = second.padStart(first.length, '0')
    } else {
        first = first.padStart(second.length, '0')
    }

    var finalString = ""

    for (i in first.length - 1 downTo 0) {
        val sum = (first[i].digitToInt() + second[i].digitToInt()).toString()
        finalString += if (sum.length > 1) {
            sum[sum.length - 1].toString()
        } else {
            sum
        }
    }

    return finalString.reversed().toInt()
}
