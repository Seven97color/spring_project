package com.example.demo.fizzbuzz.fizzbuzzcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.fizzbuzz.fizzbuzzservice.FizzBuzzService;

@Controller
public class FizzBuzzController {

	private final FizzBuzzService fizzBuzzService;

	public FizzBuzzController(FizzBuzzService fizzbuzzService) {
		this.fizzBuzzService = fizzbuzzService;
	}

	@GetMapping("fizzbuzz")
	public String fizzbuzz(Model model) {

		model.addAttribute("result", fizzBuzzService.FizzBuzz());

		return "fizzbuzz.html";
	}

}
