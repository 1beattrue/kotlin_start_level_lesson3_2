fun main() {
    // функции высшего порядка
    val listOfNumbers = mutableListOf<Int>()
    for (i in 1..100) {
        listOfNumbers.add(i)
    }

    // filter()

    val listOfEvenNumbers = listOfNumbers.filter({ number: Int -> number % 2 == 0 }) // список четных эелементов
    val listOfUnevenNumbers = listOfNumbers.filter { it % 2 != 0 } // более простая запись
    /* почему мы можем убрать скобки при передачи lambda в качестве аргумента? Правило: это можно сделать,
       если лямбда является последней в списке параметров метода */

    // задача
    val listOfNames = listOf("Max", "John", "Bill", "Anastasiya")
    val listOfNamesStartedWithA = listOfNames.filter { it[0] == 'A' }
    println(listOfNamesStartedWithA)

    // map()

    val numbers = (0..100).toList()
    val doubledNumbers = numbers.map { number: Int -> number * 2 }
    println(doubledNumbers)
    val employees = numbers.map { "Employee $it" } // можно преобразовывать в другие типы с помощью map
    println(employees)

    // sorted()
    val array = arrayOf(4, 3, 6, 2, 6, 9, 1)
    println(array.sorted())
    println(array.sortedDescending()) // сортировка по убыванию

    println("HW")

    // домашнее задание
    val list = (0..1000).toMutableList()
    list.shuffle()

    val a = list.filter { it % 5 == 0 || it % 3 == 0 }
    println(a)

    val b = a.map { it * it }
    println(b)

    val c = b.sortedDescending()
    println(c)

    val d = c.map { "number $it" }
    println(d)

    // решение в одну строчку
    println(list.filter { it % 5 == 0 || it % 3 == 0 }.map { it * it }.sortedDescending().map { it.toString() })
}