package iaassignment;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
List<Product> prod=new ArrayList<>();
public List<Product> getList(){
Product product1=new Product(1,"powerbank",2000,"mobileAccesory");
Product product2=new Product(2,"earphones",1100,"mobileAccesory");
Product product3=new Product(3,"tshirts",30,"clothing");
Product product4=new Product(4,"shirts",450,"clothing");
Product product5=new Product(5,"hats",1450,"accesory");
Product product6=new Product(6,"purse",1780,"accesory");
prod.add(product1);
prod.add(product2);
prod.add(product3);
prod.add(product4);
prod.add(product5);
prod.add(product6);
return prod;
}


}
