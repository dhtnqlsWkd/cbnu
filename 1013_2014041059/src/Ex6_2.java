
public class Ex6_2 {

	public static void main(String[] args) {
		SutdaCard card1 = new SutdaCard(3, false);
		SutdaCard card2 = new SutdaCard();
		
		System.out.println(card1.info());
		System.out.println(card2.info());
	}

}

class SutdaCard extends Ex6_1 {
	public SutdaCard() {
		num = 1;
		isKwang = true;
	}
	public SutdaCard(int num, boolean isKwang) {
		this.num = num;
		this.isKwang = isKwang;
	}
	
	String info() {
		String result = "";
		
		result += num;
		if (isKwang)
			result += 'K';
		
		return result;
	}
}