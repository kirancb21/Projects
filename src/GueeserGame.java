import java.util.*;
class Guesser{
	int guesNum;
	  publicint guesNum() {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("guesser guess the number");
		 guesNum=scan.nextInt();
		 return guesNum;
		 
	 }
}
class Player{
	int guesNum;
	 int guesNum() {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("player guess the number");
		 guesNum=scan.nextInt();
		 return guesNum;
	 }		 
}
class Umpire
{
	int nfg;
	int nfp1;
	int nfp2;
	int nfp3;
	void collectNumFromGuesser(){
		Guesser g=new Guesser();
		nfg=g.guesNum;
	}
	void collectNumFromPlayer() {
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		nfp1=p1.guesNum();
		nfp1=p2.guesNum();
		nfp1=p3.guesNum();
	}
		void Compare() {
			if(nfg==nfp1) {
				System.out.println("player1 won the game");
			}else if(nfg==nfp2) {
				System.out.println("player2 won the game");
			}else if(nfg==nfp3) {
				System.out.println("player3 won the game");
			}else {
				System.out.println("try again ur lost");
			}
		}
	}

	


public class GueeserGame {

	public static void main(String[] args) {
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.Compare();
		

	}

}
