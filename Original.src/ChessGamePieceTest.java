import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ChessGamePieceTest {

    @Test
    void calculatePossibleMoves() {
    }

    @Test
    void calculateSouthMoves() {
    }

    @Test
    void calculateNorthMoves() {
    }

    @Test
    void calculateEastMoves() {
    }

    @Test
    void calculateWestMoves() {
    }

    @Test
    void calculateNorthWestMoves() {
    }

    @Test
    void calculateNorthEastMoves() {
    }

    @Test
    void calculateSouthWestMovesTest() {
        ChessGameBoard board = new ChessGameBoard();
        Bishop bishop = new Bishop(board,1,1,ChessGamePiece.BLACK);
        ArrayList<String> result = bishop.calculateSouthWestMoves(board, 0);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, result);
    }

    @Test
    void calculateSouthEastMoves() {
    }

    @Test
    void createImageByPieceType() {
    }

    @Test
    void getImage() {
    }

    @Test
    void getColorOfPiece() {
    }

    @Test
    void isOnScreen() {
    }

    @Test
    void isPieceOnScreen() {
    }

    @Test
    void move() {
    }

    @Test
    void canMove() {
    }

    @Test
    void updatePossibleMoves() {
    }

    @Test
    void setPieceLocation() {
    }

    @Test
    void getRow() {
    }

    @Test
    void getColumn() {
    }

    @Test
    void showLegalMoves() {
    }

    @Test
    void hasLegalMoves() {
    }

    @Test
    void isEnemyTest() {
        ChessGameBoard board = new ChessGameBoard();
        // Agregar algunas piezas en el tablero
        ChessGamePiece enemyPiece = new Pawn(board,1,1,ChessGamePiece.BLACK);
        ChessGamePiece playerPiece = new Pawn(board,1,2,ChessGamePiece.WHITE);
        board.getCell(1, 1).setPieceOnSquare(enemyPiece);
        board.getCell(2, 2).setPieceOnSquare(playerPiece);

        ChessGamePiece.EnemyPieceChecker enemyPieceChecker; // El jugador actual es blanco
        enemyPieceChecker = new ChessGamePiece.WhiteEnemyPieceChecker();

        // Verificar que la pieza enemiga es enemiga
        assertTrue(enemyPieceChecker.isEnemy(playerPiece, enemyPiece));

        // Verificar que la pieza del jugador actual no es enemiga
        //assertFalse(enemyPieceChecker.isEnemy(playerPiece, new ChessGamePiece(ChessGamePiece.WHITE)));
    }

    @Test
    void getCurrentAttackers() {
    }

    @Test
    void testToString() {
    }
}