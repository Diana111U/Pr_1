//Задача 2.
//Создать приложение, которое подсчитывает количество различных символов во введенной строке. Символы в ответе расположить в алфавитном порядке.

fun main() {
    println("Данная программа подсчитывает количество различных символов во введенной строке. Символы в ответе располагаются в алфавитном порядке")
    print("Введите строку: ")

    val input = readln()
    var count = 0
    var inputList = input.toList().distinct().sorted() //distinct - избавиться от дубликатов; sorted - сортировка
    var result = ""
    for (char in inputList) {
        for (i in 0 .. input.length - 1) {
            if (input[i] == char) count++
        }
        result += "$char - $count \n"
        count = 0
    }
    println("Результат:\n$result")
}