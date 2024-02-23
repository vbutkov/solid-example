package ru.vbutkov.lsp;

import java.io.IOException;

public class CatShelter extends AnimalShelter {

    void accept(Cat cat) {
        System.out.println("It`s a cat");
    }

    @Override
    Cat get() throws IOException {
        return new Cat();
    }
}
