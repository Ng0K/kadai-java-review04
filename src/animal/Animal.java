package animal;

public class Animal {
	private String humanName;
	private int humanOld;

	public Animal() {

	}

	public Animal(String humanName, int humanOld) {
		this.humanName = humanName;
		this.humanOld = humanOld;

	}

	public String getHumanName() {
		return humanName;

	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;

	}

	public int getHumanOld() {
		return humanOld;

	}

	public void setHumanOld(int humanOld) {
		this.humanOld = humanOld;
	}

	public void say() {
		System.out.println(humanName + "です。" + humanOld + "歳です。");

	}
}
