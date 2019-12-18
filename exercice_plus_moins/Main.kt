fun main(args: Array<String>){

    println("Ecrit le chiffre '1000' pour quitter le jeu ")

    println("Écrit un premier nombre: ")

    val (nombreReference) = readLine()!!.split(' ').map(String::toInt)
    println(nombreReference.toInt())

    println("Premier essai: ")

    val deuxiemeNombre : Int? = null

    var nombreTentatives : Int = 1

    while (nombreReference != deuxiemeNombre) {

        val (deuxiemeNombre) = readLine()!!.split(' ').map(String::toInt)

        if (deuxiemeNombre < nombreReference) {
            println("C'est plus")
        }

        if (deuxiemeNombre > nombreReference) {
            println("C'est moins")
        }


        if (deuxiemeNombre != nombreReference){
            nombreTentatives++
            println("$nombreTentatives eme tentative")
        }

        if (deuxiemeNombre == 1000){
            return
        }

        if (deuxiemeNombre == nombreReference) {
            println("Gagner !!")
            return
        }

    }


}






