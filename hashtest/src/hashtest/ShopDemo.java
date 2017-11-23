package hashtest;

public class ShopDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop<Food> foodshop = new Shop<Food>(new Food("tudou"));
		Shop<Pet> petshop = new Shop<Pet>(new Pet("pet"));
		System.out.println(foodshop.buy());
		System.out.println(petshop.buy());
		
		Shop shop = new Shop(new Object());
	}

}

class Shop<P> {
	P product;

	public Shop(P p) {
		product = p;
	}
	P buy(){
		return product;
	}
}

class Food{
	String name;
	public Food(String name){
		this.name=name;
	}
	public String toString(){
		return name;
	}
}

class Pet{
	String name;
	public Pet(String name){
		this.name=name;
	}
	public String toString(){
		return name;
	}
}