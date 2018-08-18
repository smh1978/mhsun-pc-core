package org.mhsun.pc.core.controller;

import org.mhsun.pc.core.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

		@RequestMapping(value="/greeting", method = RequestMethod.GET)
		public Greeting greeting(){
			Greeting greeting = new Greeting(1, "first SpringBoot App!");
			return greeting;
		}
}
