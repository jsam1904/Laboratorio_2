fun calcularPromedio (numeros: List<Double>): Double {
    if (numeros.isEmpty()) {
        return 0.0
    }
    val suma = numeros.reduce { acumulado, numero -> acumulado + numero }
    return suma / numeros.size
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
    println("----------Filtro----------")
}