public class Main {
    public static void main(String[] args) {
        Queen queen = new Queen(4, 4);

        Position p1 = new Position(4, 7);
        Position p2 = new Position(1, 1);
        Position p3 = new Position(5, 6);

        System.out.println(queen.isValidMove(p1)); // true
        System.out.println(queen.isValidMove(p2)); // true
        System.out.println(queen.isValidMove(p3)); // false
    }
}

