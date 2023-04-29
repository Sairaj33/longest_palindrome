package com.example.demo;

import org.springframework.web.bind.annotation.*;
import com.mycompany.app.*;
import java.util.*;


@RestController
public class DemoController 
{
	@PostMapping("/palindrome")
	public String patrudu(@RequestBody Map<String,String> data)
	{
		String str=data.get("pal_input");
		
		Palindrome myObj= new Palindrome();
		String substring= myObj.answer(str);
		
		return substring;
	}	
}
