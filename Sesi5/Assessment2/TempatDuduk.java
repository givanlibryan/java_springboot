package Assessment2;

public class TempatDuduk {
    public static void main(String[] args) {
        String[][] framework = { { "php", "ruby", "java" },
                { "golang", "javascript", "swift" } };

        for (int x = 0; x <= framework.length; x++) {
            System.out.println("Siapa yang akan duduk di kelas (0," + x + ") : " + framework[0][x]);
        }
        for (int x = 0; x <= framework.length; x++) {
            System.out.println("Siapa yang akan duduk di kelas (1," + x + ") : " + framework[1][x]);
        }
        System.out.println(" ");
        System.out.println("===========================================");
        for (int x = 0; x <= framework.length; x++) {
            System.out.print("  | " + framework[0][x] + " |       ");
        }
        System.out.println("");
        for (int x = 0; x <= framework.length; x++) {
            System.out.print("| " + framework[1][x] + " |     ");
        }
        System.out.println("");
        System.out.println("===========================================");
    }
}
