package iaassignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ProductService {
	ProductRepository prod = new ProductRepository();
	List<Product> product=prod.getList();
	String name2;
	public String findNameByCode(int productcode){
		for(Product pro:product) {
			try {
				//System.out.println(i.getProductcode());
				if(productcode==pro.getProductcode()) {
					name2 = pro.getName();
					
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return name2;
			
		}
	double temp=0;
	String name;
	public String findMaxPriceProduct(String category){
		for(Product pro:product) {
			try {
				if(category==pro.getCategory()) {
				if(temp<pro.getPrice()) {
				temp=pro.getPrice();
				}
				
				}
				
				
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for(Product pro:product) {
			if(temp==pro.getPrice()) {
				name= pro.getName();
	}
			
			}
		return name;
	}
	ArrayList<Product> pr=new ArrayList<>();

	public ArrayList<Product> getProductByCategory(String category){
		for(Product pro:product) {
			//System.out.println(i.getCategory());
			if(category==pro.getCategory()) {
				pr.add(pro);
			}
			
		}
		return  pr;
	}

	public static void main(String[] args) {
		ProductService ps=new ProductService();
		System.out.println(ps.findNameByCode(2));
		System.out.println(ps.findMaxPriceProduct("mobileAccesory"));
		System.out.println(ps.findMaxPriceProduct("clothing"));
		ArrayList<Product> cat =ps.getProductByCategory("clothing");
		//System.out.println(cat.size());
		Iterator<Product> itr =cat.iterator();
		while(itr.hasNext()) {
			Product product =itr.next();
			System.out.println(product.getCategory()+","+product.getName()+","+product.getPrice()+","+product.getProductcode());
		}
	}

}
