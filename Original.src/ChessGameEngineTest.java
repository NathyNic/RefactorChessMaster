import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class ChessGameEngineTest {

    private ChessGamePiece currentPiece;
    private boolean        firstClick;
    private int            currentPlayer;
    private ChessGameBoard board;
    private King           king1;
    private King           king2;

    @org.junit.jupiter.api.Test
    void reset() {
    }

    @org.junit.jupiter.api.Test
    void getCurrentPlayer() {
    }

    @org.junit.jupiter.api.Test
    void playerHasLegalMoves() {
    }

    @org.junit.jupiter.api.Test
    public void isKingInCheck() {
        JFrame frame = new JFrame( "YetAnotherChessGame 1.0" );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        ChessPanel chessPanel = new ChessPanel();
        // Paso 1: Crear una instancia de la clase ChessGameEngine
        ChessGameBoard board = new ChessGameBoard();
        chessPanel.add(board);
        frame.getContentPane().add(chessPanel);
        ChessGameEngine engine = new ChessGameEngine(board);
        frame.pack();
        frame.setVisible(false);

        // Paso 2: Configurar el estado del objeto
        // Se coloca un rey en la posición (3,3) y una pieza que pueda amenazarlo en (3,6)

        ChessGamePiece blackking = board.getCell(0,3).getPieceOnSquare();
        ChessGamePiece whiteRook = board.getCell(7,0).getPieceOnSquare();
        blackking.setPieceLocation(3,3);
        whiteRook.setPieceLocation(3,6);
        board.getCell(3, 3).setPieceOnSquare(blackking);
        board.getCell(3, 6).setPieceOnSquare(whiteRook);
        board.clearCell(0,3);
        board.clearCell(7,0);
        ChessGamePiece bking = board.getCell(3,3).getPieceOnSquare();
        ChessGamePiece wrook = board.getCell(3,6).getPieceOnSquare();
        bking.updatePossibleMoves(board);
        wrook.updatePossibleMoves(board);

        // Paso 3: Llamar al método y guardar el resultado en una variable
        boolean isInCheck = engine.isKingInCheck(false);

        // Paso 4: Verificar el resultado
        assertTrue(isInCheck);
    }

    @org.junit.jupiter.api.Test
    void determineActionFromSquareClick() {
    }

    @org.junit.jupiter.api.Test
    void checkGameConditions(){
    }
}