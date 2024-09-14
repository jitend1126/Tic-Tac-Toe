package Aolfk;

public class cell {
    int row;
    int col;
    piece piece;

    public cell(int row, int col, piece piece) {
        this.row = row;
        this.col = col;
        this.piece = piece;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public piece getPiece() {
        return piece;
    }

    public void setPiece(piece piece) {
        this.piece = piece;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }
}

