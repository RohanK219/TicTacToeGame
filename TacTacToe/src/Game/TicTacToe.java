package Game;

public class TicTacToe {
		
    char [] [] board;
	
	public TicTacToe()
	{
		board = new char[3][3];
		initBoard();
	}
	
	void initBoard()
	{
		for(int i=0; i<board.length;i++)
		{
			for(int j=0;j<board[i].length;j++)
			{
				board[i][j]=' ';
			}
		}
	}
	
	void displayBoard()
	{
		System.out.println(" -------------");
		for(int i=0; i<board.length;i++)
		{
			System.out.print(" | ");
			for(int j=0;j<board[i].length;j++)
			{
				System.out.print(board[i][j]+" | ");
			}
			System.out.println();
			System.out.println(" -------------");

		}
	
	}
	
	void PlaceMark(int raw,int col,char mark)
	{
		if(raw >=0 && raw <=2 && col >=0 && col <=2)
		{
			board[raw][col]=mark;
		}
		else
		{
			System.out.println("Invalid Position");
		}
		
	}
	
	boolean CheckColWin()
	{
		for(int j=0;j<=2;j++)
		{
			if(board[0][j] !=' ' &&  board[0][j] == board[1][j] && board[1][j] == board[2][j])
			{
				return true;
			}
		}
		return false;
	}
	
	boolean CheckRowWin()
	{
		for(int i=0;i<=2;i++)
		{
			if(board[i][0] !=' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2])
			{
				return true;
			}
		}
		return false;
	}
	
	
	boolean CheckDigWin()
	{
		if(board[0][0] !=' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2] ||
				board[0][2] !=' ' && board[0][2] == board[1][1] && board[1][1] == board[2][0])
		{
			return true;
		}
		else
		{
			return false;
		}		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
