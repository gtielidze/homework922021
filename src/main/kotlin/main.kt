fun <T> Iterable<T>.homeWork1(predicate: (T) -> Boolean): T? {
    for (element in this) if (predicate(element)) return element
    return null
}

fun <T> Iterable<T>.homeWork2(predicate: (T) -> Boolean): T {
    for (element in this) if (predicate(element)) return element
    throw Exception("NoSuchElementException")
}

fun <T> Iterable<T>.forEach(action: (T) -> Unit) {
    for (element in this) action(element)
}

fun <T> Iterable<T>.homeWork4(predicate: (T) -> Boolean): Boolean {
    if (this is Collection && isEmpty()) return true
    for (element in this) if (!predicate(element)) return false
    return true
}

fun main(args: Array<String>) {

    val list = listOf(1, 2, 3, 5, 7, 8, 9, 11, 14)

    println(list.homeWork1 { it < 2 })  //1 დავალება
    println(list.find { it > 9 })       //1 დავალება ჩაშენებული ფუნქციით
    println(list.homeWork2 { it == 2 }) //2 დავალება
    println(list.homeWork4 { it == 3 }) //4 დავალება
    println(list.all { it > 0 })        //4 დავალება ჩაშენებული ფუნქციით

}