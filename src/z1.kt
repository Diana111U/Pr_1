//Задача 1.
//Создать приложение, которое подсчитывает количество подряд идущих одинаковых символов во введенной строке.
// На вход подается, например, строка AAADSSSRRTTHAAAA. На выходе получаем A3DS3R2T2HA4. То есть, если количество подряд идущих символов меньше двух, то мы не пишем единицу


fun main() {
    println("Данная программа подсчитывает количество подряд идущих одинаковых символов во введенной строке.")
    print("Введите строку символов:")
    val inputVal = readln()

    var result = ""
    var countChar = 1
    var previousChar = inputVal[0]

    for (i in 1 .. inputVal.length - 1) {
        if (previousChar == inputVal[i]) {
            countChar+=1
            previousChar = inputVal[i]
        }
        else {
            if (countChar>1) {
                result = result + countChar + previousChar
            }
            else {
                result  = result + previousChar
            }
            countChar = 1
            previousChar = inputVal[i]
        }

    }
    if (countChar>1) {
        result = result + countChar + previousChar
    }
    else {
        result  = result + previousChar
    }
    println(result)

}