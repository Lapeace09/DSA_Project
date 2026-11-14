import java.util.Scanner;

public class Main {

        // Node Class 
    static class Song {
        int songNumber;
        String songName;
        int duration;
        Song prev, next;

        Song(int songNumber, String songName, int songDuration) {
            this.songNumber = songNumber;
            this.songName = songName;
            this.duration = songDuration;
            this.prev = null;
            this.next = null;
        }
    }

      static class MusicPlaylist { // Dito Mag iistart ang doubly linked list 

        Song head, tail, current;

        // 1. Add Song Function na ito ng Add Song
        void addSong(int songNumber, String songName, int songDuration) {

            // Check for duplicate Song Number
            Song temp = head;

            while (temp != null) {
                if (temp.songNumber == songNumber) {
                    System.out.println("Song Number already exists!");
                    return;
                }
                temp = temp.next;
            }

            if (songDuration <= 0) {
                System.out.println("Duration must be greater than zero!");
                return;
            }

            Song newSong = new Song(songNumber, songName, songDuration);

            if (head == null) {
                head = tail = newSong;
                current = newSong;
            } else {
                tail.next = newSong;
                newSong.prev = tail;
                tail = newSong;
            }

            System.out.println("Song added successfully!");
        }

        // 2. Delete Song - Limson 
        //public void deleteSong()

        // 3. Search Song - Limson - Velasco
        //public void searchSong()

        // 4. Display Playlist - Nagrampa
        //public void displayPlaylist() 

        // 5. Play Song - Alabado
        //public void playSong()

        // 6. Next Song - Rivera
        //public void nextSong()

        // 7. Previous Song - Lanon
        //public void previousSong()

        // 8. Count Total Songs - Echaves
        //public void countTotalSongs()


        // Variable name na gagamitin 
        // Song Name = songName
        // Song Number = songNumber
        // Song Duration = songDuration
        // Scanner = sc

        
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
}