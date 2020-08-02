public class Jaeger {

	private String name;
	private String mark;
	private String weapon;

	public Jaeger(String name, String mark, String weapon) {
		this.name = name;
		this.mark = mark;
		this.weapon = weapon;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name =="") {
			System.out.println("Blank line!");
		} else {
			this.name = name;
		}
	}

	public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	public void move(int moveDistance) {
		System.out.println(name + " moved for " + moveDistance + " meters");
	}

	public void strike() {
		System.out.println(name + " fires " + weapon);
	}

	public void scanKaiju() {
		System.out.println("Scanning for kaiju... done");
	}
}