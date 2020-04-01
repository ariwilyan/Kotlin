fun main() {

    // TODO 1
    val vehicle = mapOf(
            "type" to "Motorcycle",
            "maxSpeed" to 230,
            "maxTank" to 10
    )

    // TODO 2
    val type = vehicle["type"]
    val maxSpeed = vehicle["maxSpeed"]
    val maxTank = vehicle["maxTank"]

    // TODO 3
    println("Vehicle")
    println("Type: " + type)
    println("Maximal Speed: " + maxSpeed + "Km/s")
    println("Maximal Tank: " + maxTank + "Ltr")
}