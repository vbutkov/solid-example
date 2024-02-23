package ru.vbutkov.lsp;

import com.google.auto.service.AutoService;

import java.util.Scanner;

//@AutoService(AbstractRectangleFactory.class)
public class SquareFactory implements AbstractRectangleFactory {
    @Override
    public Rectangle get() {
        return new Square();
    }
}
