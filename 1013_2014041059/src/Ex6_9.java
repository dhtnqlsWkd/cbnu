
public class Ex6_9 {

	int x=0, y=0;
	int hp = 60;
	int weapon = 6;
	int armor = 0;
	
	void weaponUp() {
		weapon++;
	}
	
	void armorUp() {
		armor++;
	}
	
	void move(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
}

//weapon, armor 변수에 static을 붙여야 한다.
//weaponUp, armorUp 함수도 static 함수가 되어야 한다.