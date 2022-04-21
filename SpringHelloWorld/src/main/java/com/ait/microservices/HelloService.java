package com.ait.microservices;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloService {
	
	@RequestMapping("")
	public String index() {
		return "Hello World 2022.....";
	}
	 
		@RequestMapping("/abc")
		public String index2() {
			return "Hello World 2022...abc";
		}
		
		@RequestMapping("/sayHello/{firstName}/{lastName}")
      public String HelloWorldPathParam(@PathVariable String firstName, @PathVariable String lastName) {
			return "Hello World with message: "+firstName+" "+lastName;
		}
		@RequestMapping("/say Hello")
		
		public String helloWorldRequestParam(@RequestParam String name,@RequestParam Integer age) {
			return "Your name is" +name+ "Your age is" +age;
		}
		@RequestMapping("/someperson")
		public Person getPerson() {
			return new Person("Joe","Bloggs",20);
		}
		@PostMapping("/someperson")
		public String postPerson(@RequestBody Person person) {
			return person.getFirstName()+" "+person.getLastName()+" "+person.getAge(0);
		}
}
