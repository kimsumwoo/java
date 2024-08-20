package com.mycompany.ch15.first;

import java.util.ArrayList;
import java.util.List;

public class LanguageEx {

	public static void main(String[] args) {
		Language language1 = new Language("korean", 80);
		
		System.out.println(language1.name);
		
		List<Language> languages = new ArrayList<>();
		
		languages.add(language1);
		
		Language language2 = new Language("USA", 10);
		Language language3 = new Language("japan", 20);
		languages.add(language2);
		languages.add(language3);
		
		languages.add(new Language("England", 15));
		
//		Car car = new Car("HYundal",2000);
		
//		list.add(Car);	//error language 객체만 담을 수  있다.
		
		List<Car> cars = new ArrayList<>();
		
		cars.add(new Car("Hyundai", 2000));
		cars.add(new Car("BMW", 2000));
		cars.add(new Car("KIA", 2000));
		
		for(Car car: cars) {
			System.out.println("cars.getName: " + car.getName());
		}
		
		for(int i=0; i<cars.size(); i++) {
			System.out.println("cars.get("+i+").Name: " + cars.get(i).getName());
			
		}
		
		languages.get(3).name = "UK";
		
		for(int i=0; i<languages.size(); i++) {
			System.out.println("languages.get("+i+").name: " + languages.get(i).name);
			
		}
		
		for(Language language: languages) {
			System.out.println("language.name: " + language.name);
		}
		
		
		
		
		

	}

}
