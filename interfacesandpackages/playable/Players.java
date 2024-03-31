package interfacesandpackages.playable;

public class Players {

	public static void main(String[] args) {
	
		IPlayable mp3Player = new MP3Player();
        IPlayable cdPlayer = new CDPlayer();
        IPlayable streamingPlayer = new StreamingPlayer();
        
        System.out.println("------MP3Player------");
        mp3Player.play();
        mp3Player.pause();
        mp3Player.stop();

        System.out.println("\n------CDPlayer------");
        cdPlayer.play();
        cdPlayer.pause();
        cdPlayer.stop();

        System.out.println("\n------StreamingPlayer------");
        streamingPlayer.play();
        streamingPlayer.pause();
        streamingPlayer.stop();
	}
}
