package Aolfk;


import java.util.Scanner;

public class Game {
    public final  Board board;
    private Player[] players;
    private GameStatus gameStatus;
    private Player currentPlayer;
    private final int cellCount=3;
    private final int noOfPlayer=2;
    private final int [] arrRow=new int[cellCount];
    private final int [] arrCol=new int [cellCount];

    private int dlr=0;
    private int drl=0;
    public Game(Player p1,Player p2)
    {
        players=new Player[noOfPlayer];
        players[0]=p1;
        players[1]=p2;
        board=new Board(cellCount);
        currentPlayer=players[0];
        gameStatus=GameStatus.PLAYING;
        start();


    }
    public void start()
    {

        for(int i=0;i<9;i++)
        {
            int ro,co;
            Scanner in = new Scanner(System.in);
            System.out.println("enter row and coleume");
            ro = in.nextInt();
            co=in.nextInt();

            play(ro,co);




        }
    }



    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }


    public boolean play(int row, int col)
    {


        if(GameStatus.PLAYING==gameStatus) {
            if (validMove(row, col)) {
                board.boxes[row][col].setPiece(currentPlayer.getPiece());
                if (checkIfWon(row, col) || checkIfdraw(row, col)) {
                    board.boardStatus();
                    return false;
                }

                gameStatus = GameStatus.PLAYING;
                changeturn();
                board.boardStatus();
                return true;
            }

            System.out.println(currentPlayer.getUsername() + "Not a Valid Move ");
            board.boardStatus();
            return false;
        }
        else {
            System.out.println(currentPlayer.getUsername()+"is already Win the Aolfk.Game");
            board.boardStatus();
            return false;

        }



    }
    private  boolean checkIfdraw(int row,int col)
    {
        if (drl > cellCount || dlr > cellCount || arrCol[col] > cellCount || arrRow[row] > cellCount
                || -cellCount > arrRow[row] || drl < -cellCount || dlr < -cellCount || arrCol[col] < -cellCount)
        {
            gameStatus=GameStatus.DRAW;
            System.out.println("game has been finished with Draw!");
            return true;
        }
        return false;

    }
    public void changeturn()
    {
        if(currentPlayer.getUserId().equals(players[0].getUserId()))
        {
            currentPlayer=players[1];

        }
        else {
            currentPlayer=players[0];
        }
    }
    private boolean checkIfWon(int row,int col)
    {
        if (currentPlayer.getUserId().equals(players[0].getUserId())) {
            if (row == col) {
                dlr++;
            } else if (row + col == cellCount - 1) {
                drl++;
            }
            arrRow[row] = arrRow[row] + 1;
            arrCol[col] = arrCol[col] + 1;
            if (arrRow[row] == cellCount || arrCol[col] == cellCount || drl == cellCount || dlr == cellCount) {
                gameStatus = GameStatus.WON;
                System.out.println(currentPlayer.getUsername() + " has won the Aolfk.Game!!");
                return true;
            }
        } else {
            if (row == col) {
                dlr--;
            } else if (row + col == -(cellCount - 1)) {
                drl--;
            }
            arrRow[row] = arrRow[row] - 1;
            arrCol[col] = arrCol[col] - 1;
            if (arrRow[row] == -cellCount || arrCol[col] == -cellCount || drl == -cellCount || dlr == -cellCount) {
                gameStatus = GameStatus.WON;
                System.out.println(currentPlayer.getUsername() + " has won the Aolfk.Game!!");
                return true;
            }

        }

        return false;
    }
    private  boolean validMove(int row,int col)
    {
        if(row<cellCount&&col<cellCount&&board.boxes[row][col].getPiece()==null)
        {
            return true;
        }
    return false;}


}

