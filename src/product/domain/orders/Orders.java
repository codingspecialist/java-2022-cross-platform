package product.domain.orders;

public class Orders {
	private int id;
	private int customerId;
	private int productId;
	
	public Orders() {
	
	}
	
	public Orders(int id, int customerId, int productId) {
		this.id = id;
		this.customerId = customerId;
		this.productId = productId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	
}
