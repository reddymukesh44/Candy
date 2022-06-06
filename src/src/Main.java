public class Main {
    public static void main(String[] args) {
        System.out.println(CandyPlayer.getMountainCandy()); // Suppose this returns 50
        CandyPlayer player = new CandyPlayer(80);
        System.out.println(player.play(100)); // this returns false
        System.out.println(player.play(20)); // this returns true
        System.out.println(CandyPlayer.getMountainCandy()); // this returns 30
        System.out.println(player.getMyCandy()); // this returns 100 since the player gave 20 to the Candy mountain and got 40 fro
        //m the mountain
        System.out.println(player.play(50));; // this returns true
        System.out.println(CandyPlayer.getMountainCandy()); // this returns 80 because 100 > 80
        System.out.println(player.getMyCandy()); // this returns 50
    }
}
