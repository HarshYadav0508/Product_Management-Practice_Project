package com.example.ProductSPRINGWeb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {
    @Autowired
    ProductDB db;


    public void addProduct(Product p) {
//        products.add(p);

        db.save(p);
    }

    public List<Product> getAllProducts() {
        return db.findAll();
    }

    public Product getProduct(String name) {
        return db.findByName(name);
    }
//
//    ##[The Below Code is for Without Spring Boot]##
//
//    public Product getProduct(String name)
//    {
//        for (Product p : products)
//        {
//            if (p.getName().equals(name))
//                return p;
//        }
//
//        return null;
//    }
//
//
//    public List<Product> getProductWithText(String name)
//    {
//        //To set the string name in LowerCase We can Create a Object of String and use Lowercase method of String
//        //String str = name.toLowerCase();
//        //Also converting the list item in for loop to lowercase
//        List<Product> products1= new ArrayList<>();//Created ArrayList for adding the selected data in for loop
//
//        for(Product p : products)//From the above product list
//        {
//            if(p.getName().contains(name) || p.getPlace().contains(name)|| p.getType().contains(name))//Contain methods consist of everything in the object
//            {
//                products1.add(p);//Adding the selected products.
//            }
//        }
//
//        return products1;
//    }
}
