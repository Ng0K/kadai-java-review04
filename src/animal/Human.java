package animal;

public class Human extends Animal implements Thinkable {
	private String hobby;

	public Human() {

	}

	public Human(String humanName, int humanOld, String hobby) {
		super(humanName, humanOld);
		this.hobby = hobby;
	}

	@Override
	public void think() {
		System.out.println("私は" + hobby + "について考えています。");

	}

}
