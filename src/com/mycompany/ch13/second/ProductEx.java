package com.mycompany.ch13.second;

public class ProductEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product<String, Integer> product = new Product<>();
		
		product.setKind("kim");
		product.setModel(100);
		
		System.out.println(product.getKind());
		System.out.println(product.getModel());
		
		Product<Tv, String> product2 = new Product<>();
		

	}

}
