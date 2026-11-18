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
        public void deleteSong(int songNumber) {

            // Case 1: playlist is empty
            if (head == null) {
                System.out.println("Playlist is empty!");
                return;
            }

            // Search for the song with this song number
            Song temp = head;
            while (temp != null && temp.songNumber != songNumber) {
                temp = temp.next;
            }

            // Case 2: song number not found
            if (temp == null) {
                System.out.println("Song Number not found!");
                return;
            }

            // If the song being deleted is the current song, move current to a neighbor
            if (temp == current) {
                current = (temp.next != null) ? temp.next : temp.prev;
            }

            // Case 3: it's the only song
            if (temp == head && temp == tail) {
                head = tail = null;
            }
            // Case 4: deleting the first song
            else if (temp == head) {
                head = head.next;
                head.prev = null;
            }
            // Case 5: deleting the last song
            else if (temp == tail) {
                tail = tail.prev;
                tail.next = null;
            }
            // Case 6: deleting a song in the middle
            else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }

            System.out.println("Song deleted successfully!");
        }
        // 3. Search Song - Velasco
        public void searchSong(int songNumber) {
            // Check if playlist is empty
            if (head == null) {
                System.out.println("Playlist is empty!");
                return;
            }

            // Start checking from the head (first song)
            Song temp = head;
            while (temp != null) {
                if (temp.songNumber == songNumber) {
                    System.out.println("Song Found!");
                    System.out.println("Number: " + temp.songNumber);
                    System.out.println("Name: " + temp.songName);
                    System.out.println("Duration: " + temp.duration + " seconds");
                    return;
                }
                temp = temp.next; 
            }

            // If it finishes the loop without finding it
            System.out.println("Song not found!");
        }

        // 4. Display Playlist - Nagrampa
        //public void displayPlaylist() 

        // 5. Play Song - Alabado
        //public void playSong()

        // 6. Next Song - Rivera
        //public void nextSong()

        // 7. Previous Song - Lanon
        //public void previousSong()
                public void previousSong() {
            // Case 1: Playlist is empty
            if (head == null || current == null) {
                System.out.println("Playlist is empty!");
                return;
            }

            // Case 2: Already at the first song (no previous node)
            if (current.prev == null) {
                System.out.println("You are already at the first song: " + current.songName);
                return;
            }

            // Case 3: Move current pointer to the previous song
            current = current.prev;
            System.out.println("Now playing previous song: [" + current.songNumber + "] " 
                    + current.songName + " (" + current.duration + "s)");
        }

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
