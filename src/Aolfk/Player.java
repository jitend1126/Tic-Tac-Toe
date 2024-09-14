package Aolfk;

import java.util.Scanner;

public class Player extends  user{
    private  final piece piece;

    public  Board board;
    public  Game game;



    public piece getPiece() {
        return piece;
    }

    public Player(String userId, String username, piece piece) {
        super(userId, username);
        this.piece= piece;

    }

}
