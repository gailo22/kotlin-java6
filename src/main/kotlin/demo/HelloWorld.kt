package demo

import kotlinx.coroutines.delay

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        System.exit(1)
    } else {
        println(args[0])
    }
}

suspend fun workload(n: Int): Int {
    delay(1000)
    return n
}