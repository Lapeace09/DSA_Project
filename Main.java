import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

            System.out.println("\n================================");
            System.out.println("         MUSIC PLAYLIST");
            System.out.println("================================");
            System.out.println("[1 Add Song");
            System.out.println("[2] Delete Song");
            System.out.println("[3] Search Song");
            System.out.println("[4] Display Playlist");
            System.out.println("[5] Play Song");
            System.out.println("[6] Next Song");
            System.out.println("[7] Previous Song");
            System.out.println("[8] Count Total Songs");
            System.out.println("[9] Exit");
            System.out.println("================================");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Song Number:");
                    int songNumber = sc.nextInt();

                    System.out.println("Enter Song Name & Artist Name:");
                    String songName = sc.nextLine();

                    sc.nextLine();

                    System.out.println("Enter Song Duration:");
                    int songDuration = sc.nextInt();

                    


            }
    }
}