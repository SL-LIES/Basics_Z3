fun main() {
    print("Введите число: ")
    var num = readln().toInt();
    var binary = ""
    while (num > 0){
        binary = (num % 2).toString() + binary;
        num /= 2;
    }
    print(binary)
}