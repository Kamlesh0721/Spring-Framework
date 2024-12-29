package com.SpringBoot.simpleWebApp.service;

import com.SpringBoot.simpleWebApp.Error.ProductNotFoundException;
import com.SpringBoot.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(
            Arrays.asList(
                    new Product(101, "Iphone", 50000),
                    new Product(102, "Samsung", 45000),
                    new Product(103, "Nothing", 32000)
            )
    );
    public List<Product> getProducts(){
        System.out.println(products);
        return products;
    }

    public Product getProductById(Integer prodId) {
        return products.stream()
                .filter(p -> p.getId() == prodId)
                .findFirst()
                .orElseThrow(() -> new ProductNotFoundException("Product with ID " + prodId + " not found"));
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index=0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getId()==prod.getId()){
                index=i;
            }
        }
        products.set(index,prod);
    }

    public void deleteProdById(Integer id) {
        int index=0;
        for(int i=0;i<products.size();i++){
            if(products.get(i).getId()==id){
                index=i;
            }
        }
        products.remove(index);
    }
}
