ublic class Product {
	 private String Productname;
	   private int productid;
	    private double price;
	    
	public  void  setProductDetails ( String name, int id, double price) {
	    String productName=name; 
	    productid=id;
	      price=price;
	}
	public String getProductDetails() {

    return "Product name: " + name + " id: " + id + " price: " + price;
	      }
}
