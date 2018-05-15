package mobup;

public class Items {

	private String name;
	private int id;
	private int quantity;
	private String detail;
	
	public Items(int Id, String Name, int Quantity, String Detail) {
		this.name = Name;
		this.id = Id;
		this.quantity = Quantity;
		this.detail = Detail;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public String getDetail() {
		return this.detail;
	}

	public void setName(String Name) {
		this.name = Name;
	}
	
	public void setId(int Id) {
		this.id = Id;
	}
	
	public void setQuantity(int Quantity) {
		this.quantity = Quantity;
	}
	
	public void setDetail(String Detail) {
		this.detail = Detail;
	}
}
