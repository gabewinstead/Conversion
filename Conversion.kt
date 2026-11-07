fun main() {
    print("What do you want to convert?\n 1) Celsius to Fahrenheit (C)\n 2) Fahrenheit to Celsius (F)\n 3) Kilometers to Miles (K)\n 4) Miles to Kilometers (M)\n")

    val option = readln().toIntOrNull()
        if (option == 1) {
            print("Temperature in Celsius: ")
            val celsius = readln().toDoubleOrNull()
            if (celsius != null) {
                val fahrenheit = (celsius * 1.8) + 32
                println("$celsius Celsius is equal to $fahrenheit Fahrenheit")
            }
        } else if (option == 2) {
            print("Temperature in Fahrenheit: ")
            val fahrenheit = readln().toDoubleOrNull()
            if (fahrenheit != null) {
                val celsius = (fahrenheit - 32) / 1.8
                println("$fahrenheit Fahrenheit is equal to $celsius Celsius")
            }
        } else if (option == 3) {
            print("Distance in Kilometers: ")
            val kilometers = readln().toDoubleOrNull()
            if (kilometers != null) {
                val miles = (kilometers * 0.621371)
                println("$kilometers Kilometers is equal to $miles Miles")
            }
        } else if (option == 4) {
            print("Distance in Miles: ")
            val miles = readln().toDoubleOrNull()
            if (miles != null) {
                val kilometers = (miles * 0.621371)
                println("$miles Miles is equal to $kilometers Kilometers")
            }
        }
}