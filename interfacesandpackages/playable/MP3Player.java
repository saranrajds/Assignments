package interfacesandpackages.playable;

public class MP3Player implements IPlayable {

	@Override
	public void play() {
		System.out.println("Started MP3Player");
	}

	@Override
	public void pause() {
		System.out.println("Paused MP3Player");
	}

	@Override
	public void stop() {
		System.out.println("Stoped MP3Player");
	}
}
