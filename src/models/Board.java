package models;

import java.util.List;

public class Board {

    private int size;

    private List<List<Cell>> board;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
