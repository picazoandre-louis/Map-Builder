import java.util.Random;
public class Main {
    public static int mapWidth = 100;
    public static int mapHeight = 100;
    public static void main(String[] args) {
        buildMap();
    }
    public static void buildMap() {

        int zombie= 0;
        while (zombie<mapWidth) {
            int cow = 0;
            while (cow<mapHeight) {

                System.out.printf("%s", getCell());

                cow++;
            }
           System.out.println();
            zombie++;

        }

    }
    public static String getCell() {
        Random rand = new Random();
        int turn = rand.nextInt(5);
        String minecraft;
        if (turn == 0) {
            minecraft= ".";
        }
        else if (turn ==1){
            minecraft= ":";

        }
        else if (turn==2) {
            minecraft= "^";
        }
        else if (turn==3) {
            minecraft= "T";

        }
        else {
            minecraft= "~";
        }
        return minecraft;
// Legend
// . = grass
// : = thick grass
// ^ = mountain
// T = tree
// ~ = water
// Code to randomly select a terrain type
    }
}
