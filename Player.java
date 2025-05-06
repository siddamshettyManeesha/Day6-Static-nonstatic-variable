public class Player{
public  static int totalPlayers=0;
public String playerName;
public static void main(String[]args){
Player objref=new Player();
objref.playerName="Virat";
Player.totalPlayers++;
Player objref1=new Player();
objref1.playerName="Dhoni";
Player.totalPlayers++;
System.out.println("Total Players:"+Player.totalPlayers);
}
}



