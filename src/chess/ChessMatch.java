package chess;

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

import static chess.Color.BLACK;
import static chess.Color.WHITE;

public class ChessMatch {

    private Board board;

    public ChessMatch() {
        this.board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces() {
        ChessPiece[][] pieces = new ChessPiece[board.getRows()][board.getColumns()];

        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                pieces[i][j] = (ChessPiece) board.piece(i, j);
            }
        }
        return pieces;
    }

    private void initialSetup() {
        board.placePiece(new Rook(board, WHITE), new Position(0,0));
        board.placePiece(new Rook(board, WHITE), new Position(0,7));
        board.placePiece(new King(board, WHITE), new Position(0,3));
        board.placePiece(new King(board, BLACK), new Position(7,3));
    }
}
