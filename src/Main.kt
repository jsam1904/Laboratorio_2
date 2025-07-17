fun calcularPromedio (numeros: List<Double>): Double {
    if (numeros.isEmpty()) {
        return 0.0
    }
    val suma = numeros.reduce { acumulado, numero -> acumulado + numero }
    return suma / numeros.size
}

fun main() {
    val lista = listOf(1.1, 2.2, 3.3, 4.0, 5.6, 8.5, 10.5)
    val promedio = calcularPromedio(lista)
    println("El promedio es:  $promedio")
}