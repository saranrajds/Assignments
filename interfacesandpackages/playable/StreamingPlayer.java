package interfacesandpackages.playable;

public class StreamingPlayer implements IPlayable {
	
	@Override
	public void play() {
		System.out.println("Started Speaker");
	}

	@Override
	public void pause() {
		System.out.println("Paused Speaker");
	}

	@Override
	public void stop() {
		System.out.println("Stoped Speaker");
	}
}
