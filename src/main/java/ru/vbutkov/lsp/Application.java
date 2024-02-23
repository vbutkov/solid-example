package ru.vbutkov.lsp;

public class Application {

    public static void main(String[] args) {
        AnimalShelter animalShelter = new CatShelter();
        animalShelter.accept(new Cat());
    }
}
