<<<<<<< HEAD
package stackandqueue;

public class Question4 {

	public static void main(String[] args) {

		Playlist playlist = new Playlist();

        playlist.addSong(new Song("Shape of You", "Ed Sheeran"));
        playlist.addSong(new Song("Someone Like You", "Adele"));
        playlist.addSong(new Song("Uptown Funk", "Mark Ronson ft. Bruno Mars"));

        playlist.displayPlaylist();

        Song songToRemove = new Song("Someone Like You", "Adele");
        playlist.removeSong(songToRemove);

        playlist.displayPlaylist();
	}
}
=======
package stackandqueue;

public class Question4 {

	public static void main(String[] args) {

		Playlist playlist = new Playlist();

        playlist.addSong(new Song("Shape of You", "Ed Sheeran"));
        playlist.addSong(new Song("Someone Like You", "Adele"));
        playlist.addSong(new Song("Uptown Funk", "Mark Ronson ft. Bruno Mars"));

        playlist.displayPlaylist();

        Song songToRemove = new Song("Someone Like You", "Adele");
        playlist.removeSong(songToRemove);

        playlist.displayPlaylist();
	}
}
>>>>>>> 3610e59443eaa8a9a7e03cf305c60ba9ba85572f
