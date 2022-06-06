import java.util.Random;

public class CandyPlayer {

  private static int totalCandy = (new Random()).nextInt(75);

  private int noOfCandy = 0;

  private static int turn = 0;

  private int uniqueId = 0;

  private static int noOfPLayers = 0;

  public static int getTurn() {
    return turn;
  }

  public static int getNumberOfPlayers() {
    return noOfPLayers;
  }

  public static void setNumberOfPlayers(int noOfPLayers) {
    CandyPlayer.noOfPLayers = noOfPLayers;
  }

  public static void setTurn(int turn) {
    CandyPlayer.turn = turn;
  }

  public CandyPlayer(int noOfCandy) {
    this.noOfCandy = noOfCandy;
    uniqueId = noOfPLayers;
    noOfPLayers++;
  }

  public int getMyCandy() {
    return noOfCandy;
  }

  public static int getMountainCandy() {
    return totalCandy;
  }

  public boolean play(int can){

    if (uniqueId != turn){
      return false;
    }

    if(can <= this.noOfCandy){
      totalCandy += can;
      this.noOfCandy -= can;
      if(2*can < totalCandy){
        totalCandy -= 2*can;
        this.noOfCandy += 2*can;
      }
      turn++;
      if (turn == noOfPLayers){
        turn = 0;
      }
      return true;
    }
    else {
      turn++;
      if (turn == noOfPLayers){
        turn = 0;
      }
      return false;
    }
  }



}