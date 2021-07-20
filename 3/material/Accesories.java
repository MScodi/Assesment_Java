package material;

import stock.Inventory;

public class Accesories extends Inventory {
	
	int uniqueId=0;
	int modelNo;
	int quantity =0;
	public Accesories(int uniqueId, int modelNo) {
		super();
		this.uniqueId = uniqueId;
		this.modelNo = modelNo;
		quantity++;
		
	}
	public Accesories() {
		// TODO Auto-generated constructor stub
	}

}
