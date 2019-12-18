fun main(){
    val animalerie = Animalerie()

    animalerie.ajouterAnimal(Chat())
    animalerie.ajouterAnimal(Chat())
    animalerie.ajouterAnimal(Chien())
    animalerie.ajouterAnimal(Perroquet())

    for (ajout in animalerie.list) {
        ajout.quiSuisJe()
        ajout.parler()
    }
}
