// Autor: Javier Alvarado 24546 - Fecha: 17 de julio de 2025
// Descripción: Programa en Kotlin que implementa varias funciones y operaciones como cálculo de promedio,
// filtrado de números impares, verificación de palíndromos, operaciones con lambdas, mapeo de personas a estudiantes,
// y manejo de listas con saludos. El código incluye ejemplos de uso en la función main.

fun calcularPromedio (numeros: List<Double>): Double {
    if (numeros.isEmpty()) {
        return 0.0
    }
    val suma = numeros.reduce { acumulado, numero -> acumulado + numero }
    return suma / numeros.size
}

fun isPalindroman(cadena: String): Boolean {
    var first = 0
    var final = cadena.length -1
    while (first < final) {
        if (cadena[first] != cadena[final]) {
            return false
        }
        first ++
        final --
    }
    return true
}

fun performOperation(a:Int, b:Int, ope:(Int, Int) -> Double): Double {
    return ope(a, b)
}

data class Person(val name: String, val age: Int, val gender: String)
data class Student(val name: String, val age: Int, val gender: String, val studentId: String)

fun mapaaEstudiante(person: Person, studentId: String): Student {
    return Student(person.name, person.age, person.gender, studentId)
}

fun main() {
    println("----------Promedio----------")
    val lista = listOf(1.1, 2.2, 3.3, 4.0, 5.6, 8.5, 10.5)
    val promedio = calcularPromedio(lista)
    println("El promedio es:  $promedio")

    println("")
    println("----------Filtro----------")
    val numero = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14)
    val impares = numero.filter { numero -> numero % 2 == 1 }
    println("El impares es: $impares")

    println("")
    println("----------Palindromo----------")
    val valor1 = "Ana"
    val valor2 = "Palabra"

    val cadena = isPalindroman(valor1)
    val cadena2 = isPalindroman(valor2)

    println("$valor1 es palindromos: $cadena")
    println("$valor2 es palindromos: $cadena2")

    println("")
    println("----------Saludo----------")
    val nombre = listOf("Juan", "Pedro", "Diego", "Javier", "Maria")
    val mapa = nombre.map { "\n ¡Hola, $it! \n" }
    println("$mapa")

    println("")
    println("----------Lambda----------")
    val suma = performOperation(a = 5, b = 6){x,y -> (x + y).toDouble()}
    val resta = performOperation(a = 5, b = 6){x,y -> (x - y).toDouble()}
    val mult = performOperation(a = 5, b = 6){x,y -> (x * y).toDouble()}
    val div = performOperation(a = 5, b = 6){x,y -> x.toDouble() / y}

    println("La suma es: $suma")
    println("La resta es: $resta")
    println("La multiplicacion: $mult")
    println("La division: $div")

    println("")
    println("----------Estudiantes----------")
    val persona = Person("Juan", 18, "Masculino")
    val estudiante = mapaaEstudiante(persona, "JUVG")

    println("El estudiante es ${estudiante.name} tiene edad de ${estudiante.age} años, de genero ${estudiante.gender} con un ID de ${estudiante.studentId}")


}