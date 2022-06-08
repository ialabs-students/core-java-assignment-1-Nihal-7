package iaassignment;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
List<Product> pr=new ArrayList<>();
public List<Product> getList(){
Product p1=new Product(1,"bag",1200,"stationary");
Product p2=new Product(2,"pen",12,"stationary");
Product p3=new Product(3,"nachos",30,"food");
Product p4=new Product(4,"cake",450,"bakery");
Product p5=new Product(5,"jeans",1450,"clothing");
Product p6=new Product(6,"shirt",1780,"clothing");
pr.add(p1);
pr.add(p2);
pr.add(p3);
pr.add(p4);
pr.add(p5);
pr.add(p6);
return pr;
}


}
