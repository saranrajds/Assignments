package interfacesandpackages.playable;

public class CDPlayer implements IPlayable{

	@Override
	public void play() {
		System.out.println("Started CDPlayer");
	}

	@Override
	public void pause() {
		System.out.println("Paused CDPlayer");
	}

	@Override
	public void stop() {
		System.out.println("Stoped CDPlayer");
	}
}
