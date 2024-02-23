package ru.vbutkov.lsp;

public class Square extends Rectangle {

    void setSize(int size) {
        this.height = size;
        this.width = size;
    }

    @Override
    public void setWidth(int width) {
        this.setSize(width);
    }

    @Override
    public void setHeight(int height) {
        this.setSize(height);
    }
}
