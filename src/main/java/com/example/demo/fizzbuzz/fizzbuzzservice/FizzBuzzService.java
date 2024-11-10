package com.example.demo.fizzbuzz.fizzbuzzservice;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

	public List<String> FizzBuzz() {

		List<String> fizzBuzzList = new ArrayList<>();

		for (int i = 0; i <= 100; i++) {

			if (i % 3 == 0 && i % 5 == 0) {

				fizzBuzzList.add("FizzBuzz");
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				fizzBuzzList.add("Fizz");
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				fizzBuzzList.add("Buzz");
				System.out.println("Buzz");
			} else {
				fizzBuzzList.add(Integer.toString(i));

				System.out.println(i);
			}
		}
		return fizzBuzzList;
	}
}
