class Queen extends Piece {

    public Queen(int row, int column) {
        this.row = row;
        this.column = column;
    }


    boolean isValidMove(Position newPosition) {

        if (
                newPosition.column == this.column ||
                        newPosition.row == this.row ||
                        Math.abs(newPosition.column - this.column) == Math.abs(newPosition.row - this.row)
        ) {
            return true;
        } else {
            return false;
        }
    }
}

