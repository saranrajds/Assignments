<<<<<<< HEAD
package stackandqueue;

public class Playlist {

	private SongNode head;

    private static class SongNode {
        private Song song;
        private SongNode next;

        public SongNode(Song song) {
            this.song = song;
            this.next = null;
        }
    }

    public Playlist() {
        this.head = null;
    }

    public void addSong(Song song) {
        SongNode newNode = new SongNode(song);
        if (head == null) {
            head = newNode;
        } else {
            SongNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    public void removeSong(Song song) {
        if (head == null) {
            return;
        }

        if (head.song.equals(song)) {
            head = head.next;
            return;
        }

        SongNode current = head;
        while (current.next != null) {
            if (current.next.song.equals(song)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    
    public void displayPlaylist() {
        SongNode current = head;
        System.out.println("Playlist:");
        while (current != null) {
            System.out.println("- " + current.song);
            current = current.next;
        }
        System.out.println();
    }
}
=======
package stackandqueue;

public class Playlist {

	private SongNode head;

    private static class SongNode {
        private Song song;
        private SongNode next;

        public SongNode(Song song) {
            this.song = song;
            this.next = null;
        }
    }

    public Playlist() {
        this.head = null;
    }

    public void addSong(Song song) {
        SongNode newNode = new SongNode(song);
        if (head == null) {
            head = newNode;
        } else {
            SongNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }
    
    public void removeSong(Song song) {
        if (head == null) {
            return;
        }

        if (head.song.equals(song)) {
            head = head.next;
            return;
        }

        SongNode current = head;
        while (current.next != null) {
            if (current.next.song.equals(song)) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }
    
    public void displayPlaylist() {
        SongNode current = head;
        System.out.println("Playlist:");
        while (current != null) {
            System.out.println("- " + current.song);
            current = current.next;
        }
        System.out.println();
    }
}
>>>>>>> 3610e59443eaa8a9a7e03cf305c60ba9ba85572f
