package dhtnqlsWkd;

class Product2
{
	
	int price;
	int bonusPoint;
	
	Product2() {}
	
	Product2(int price) {
		this.price = price;
		bonusPoint =(int)(price / 10.0);
	}
	
}

class Tv2 extends Product2 {
	
	Tv2() {}
	
	public String toString() {
		return "Tv";
	}
	
}

class Ex7_5 {
	
	public static void main(String[] args) {
		Tv2 tv = new Tv2();
	}
	
}