package ru.vbutkov.lsp;

public class RectangleFactory implements AbstractRectangleFactory {
    @Override
    public Rectangle get() {
        return new Rectangle();
    }
}
