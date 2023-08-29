package Game;
import java.util.*;
public class HumanPlayer {
	
		TicTacToe T=new TicTacToe();
		Scanner sc=new Scanner(System.in);
		String name;
		char mark;
		
		public HumanPlayer(String name, char mark) 
		{
			this.name = name;
			this.mark = mark;
		}
		
		void MakeMove()
		{
			int row;
			int col;
			do
			{
				System.out.println("Enter the row and coloumn");
				row = sc.nextInt();
			    col = sc.nextInt();
			}
			
			while(!IsValidMove(row, col));
			
			T.PlaceMark(row, col, mark);
			
		}

		boolean IsValidMove(int row , int col)
		{
			if(row >=0 && row <=2 && col >=0 && col<=2)
			{
				if(T.board[row][col]  == ' ')
				{
					return true;
				}
			}
			return false;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
