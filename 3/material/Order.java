package material;

import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		Laptops laptop = new Laptops("Asus",120000,021);
		Laptops laptop1 = new Laptops("Dell",340000,561);
		Laptops laptop2 = new Laptops("Acer",120050,341);
		Laptops laptop3= new Laptops("Hp",50000,156);
		Laptops laptop4= new Laptops("Apple",127840,271);
		
		Accesories a1= new Accesories(23,45);
		Accesories a2= new Accesories(45,22);
		Accesories a3= new Accesories(90,45);
		Accesories a4= new Accesories(77,45);
		Accesories a5= new Accesories(44,45);
		Accesories a6= new Accesories(22,45);
		Accesories a7= new Accesories(12,45);
		Accesories a8= new Accesories(34,45);
		Accesories a9= new Accesories(344,45);
		Accesories a10= new Accesories(908,45);
		placeOrder();
	}
	private static void placeOrder() {
		Scanner sc = new Scanner(System.in);
		Laptops l1= new Laptops();
		Accesories a1 = new Accesories();
		System.out.println("No. of Laptop you want to Order");
		int n = sc.nextInt();
		
		System.out.println("No. of Acessories you want to Order");
		int m = sc.nextInt();
		sc.close();
		if(n< l1.lowOrderLevelQuantity   ) {
			System.out.println("RequestForMaterial (RFM)");
		}
		if(m<5) {
			System.out.println("RequestForMaterial (RFM)");
		}
		if(n>3 && n<l1.qty) {
			System.out.println("Invoice Generated");
		}
		if(m>5 && m<a1.quantity) {
			System.out.println("Invoice Generated");
		}
		
	}
	public Order() {
		
		
	}

}
