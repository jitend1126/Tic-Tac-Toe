package Aolfk;

public class Board {
    public cell[][] getBoxes() {
        return boxes;
    }

    public void setBoxes(cell[][] boxes) {
        this.boxes = boxes;
    }

    public cell [][] boxes;



    private final int noOfCell;

    public Board(int noOfCell) {
        this.noOfCell = noOfCell;
        boxes=new cell[noOfCell][noOfCell];
        initializeBoard();
        boardStatus();

    }

    public int getNoOfCell() {
        return noOfCell;
    }




    public void initializeBoard()
    {
        for (int i=0;i<noOfCell;i++)
        {
            for(int j=0;j<noOfCell;j++)
            {
                boxes[i][j]=new cell(i,j,null);
            }
        }
        System.out.println("Game Started");
    }
    public void boardStatus()
    {
        System.out.println("----------------------");
        for(int i=0;i<noOfCell;i++)
        {
            for(int j=0;j<noOfCell;j++)
            {
                if(boxes[i][j].getPiece()==null)
                {
                    System.out.print(" | "+" "+" | ");
                }
                else
                {
                    System.out.print(" | "+ boxes[i][j].getPiece()+" | ");
                }
            }
            System.out.println();

        }
        System.out.println("---------------------");
    }
}
