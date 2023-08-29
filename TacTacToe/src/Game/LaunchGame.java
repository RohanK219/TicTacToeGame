package Game;

public class LaunchGame {

	public static void main(String[] args) {
		
		TicTacToe t = new TicTacToe();
		
		HumanPlayer P1 = new HumanPlayer("ROHAN",'x');
		HumanPlayer P2 = new HumanPlayer("ASHISH",'o');
		
		HumanPlayer CurrentPlayer;
		CurrentPlayer = P1;
		
		while(true)
		{
			System.out.println(CurrentPlayer.name+" Turn");
			CurrentPlayer.MakeMove();
			t.displayBoard();
			if(t.CheckColWin() || t.CheckRowWin() || t.CheckDigWin())
			{
				System.out.println(CurrentPlayer.name+"Has WON");
				break;
			}
			else
			{
				if(CurrentPlayer == P1)
				{
					CurrentPlayer = P2;
				}
				else
				{
					CurrentPlayer = P1;
				}
			}
		}
	}
}
