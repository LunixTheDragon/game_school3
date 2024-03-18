package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class  Eshop {
    private ArrayList<Product>products;
    private ArrayList<Customer> customers;
    //TODO: Doplnit atributy pro produkty a zákazníky

    public Eshop() {
    this.customers=new ArrayList<>();
    this.products=new ArrayList<>();
        //TODO: Inicializovat kolekce
    }

    public void addProduct(Product product) {
        products.add(product);
        //TODO: Doplnit metodu
    }

    public void removeProduct(int productId) {
        products.remove(findProduct(productId));
        //TODO: Doplnit metodu
    }

    public Product findProduct(int productId) {
        for (Product product:products){
            if (productId== product.getId()){
                return product;
            }
        }
        return null;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
        //TODO: Doplnit metodu
    }

    public void removeCustomer(int customerId) {
        customers.remove(findCustomer(customerId));
        //TODO: Doplnit metodu
    }

    public Customer findCustomer(int customerId) {
        for(Customer customer:customers){
            if(customerId==customer.getId()){
                return customer;
            }
        }
        return null;
    }

    public List<Product> listAllProducts() {
        return new ArrayList<>(products); //TODO: Doplnit správnou implementaci
    }

    public List<Customer> listAllCustomers() {
        return new ArrayList<>(customers); //TODO: Doplnit správnou implementaci
    }

    public List<Product> findProductsByName(String searchTerm) {
        return products.stream()
                .filter(product -> product.getName().toLowerCase().contains(searchTerm.toLowerCase()))
                .collect(Collectors.toList());
                 //TODO: Doplnit správnou implementaci
    }

    public List<Customer> findCustomersByEmailDomain(String domain) {
        return customers.stream()
                .filter(customer -> customer.getEmail().toLowerCase().contains(domain.toLowerCase()))
                .collect(Collectors.toList());
        //TODO: Doplnit správnou implementaci
    }

}