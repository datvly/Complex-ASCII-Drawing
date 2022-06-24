//Drawing a tower
public class Tower {

    public static void main(String[] args) {
        top();
        middle();
        trapezoid();
        base();
    }

    //print spaces in top of tower
    public static void spaceTop() {
        final int NUM_SPACES = 4 * SIZE + 2;
        for (int spaceTop = 0; spaceTop < NUM_SPACES; spaceTop++) {
            System.out.print(" ");
        }
    }

    //print the hashtags in tower
    public static void hashtagLine() {
        spaceTop();
        final int NUM_HASHTAG = SIZE * 2 - 1;
        for (int hashtagLine = 0; hashtagLine < NUM_HASHTAG; hashtagLine++) {
            System.out.print("#");
        }
        System.out.println();
    }

    //print the vertical lines in tower
    public static void verticalLine() {
        spaceTop();
        final int NUM_VERTICAL = SIZE * 2 - 1;
        for (int verticalLine = 0; verticalLine < NUM_VERTICAL; verticalLine++) {
            System.out.print("|");
        }
        System.out.println();
    }

    //print out the entire top
    public static void top() {
        hashtagLine();
        for (int verticalLineRow = 0; verticalLineRow < 2 * SIZE - 2; verticalLineRow++) {
            verticalLine();
        }
        hashtagLine();
    }

    //print out space for tower's body
    public static void spaceMid() {
        final int NUM_SPACES = 4 * SIZE;
        for (int mid = 0; mid < NUM_SPACES; mid++) {
            System.out.print(" ");
        }

    }

    //print out the waves
    public static void wave() {
        spaceMid();
        final int NUM_WAVE = 2 * SIZE + 3;
        for (int wave = 0; wave < NUM_WAVE; wave++) {
            System.out.print("~");
        }
        System.out.println();
    }

    //print out the windows
    public static void windows() {
        spaceMid();
        System.out.print("|");
        final int NUM_WINDOWS = SIZE;
        for (int windows = 0; windows < NUM_WINDOWS; windows++) {
            System.out.print("-O");
        }
        System.out.println("-|");
    }


    //print out the middle
    public static void middle() {
        for (int fullWindow = 0; fullWindow < SIZE * SIZE; fullWindow++) {
            wave();
            windows();
        }
        wave();
    }

    //print out the trapezoid steps
    public static void trapezoid() {
        //the spaces for steps
        final int NUM_LEVEL = SIZE / 2 + 1;
        final int NUM_SPACES = 3;
        int maxSpaces = SIZE / 2 * 3;

        //the inner steps
        final int NUM_BASE_STEPS = SIZE * 5;
        for (int spaceTrapezoid = 0; spaceTrapezoid < NUM_LEVEL; spaceTrapezoid++) { //Levels
            for (int j = 0; j < maxSpaces; j++) { //Spaces each level
                System.out.print(" ");
            }
            System.out.print("/");
            for (int k = 0; k < NUM_BASE_STEPS - maxSpaces; k++) {
                System.out.print("\"'");
            }
            maxSpaces -= NUM_SPACES;
            System.out.print("\"");
            System.out.println("\\");
        }
    }

    //print out the base windows
    public static void baseWindows() {
        System.out.print("/");
        final int NUM_BASE_WINDOWS = SIZE * 5;
        for (int baseWindows = 0; baseWindows < NUM_BASE_WINDOWS; baseWindows++) {
            System.out.print("\"O");
        }
        System.out.println("\"\\");
    }

    //print out the entire base
    public static void base() {
        for (int fullWindow = 0; fullWindow < SIZE; fullWindow++) {
            baseWindows();
        }
        System.out.println();
    }
}
