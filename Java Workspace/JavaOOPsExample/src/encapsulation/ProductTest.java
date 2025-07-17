package encapsulation;

public class ProductTest {

	public static void main(String[] args) {
		Product p = new Product();
		p.setPid(100);
		p.setPname("Ravi");
		p.setPrice(45000);
		
		
		System.out.println("pid is "+p.getPid());
		System.out.println("pname is "+p.getPname());
		System.out.println("price is "+p.getPrice());
	}

}
