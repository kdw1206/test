
package com.example.demo;


import java.util.HashMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
* <pre> 
* simple : 계좌 Controller Module.
* detail : .
* kr.co.kospo.accounts.controller
* |_ AccountsController.java
* </pre>
*
* @company : RayfulPlus Co., Ltd.
* @author : csc
* @date : 2020. 10. 16. 오전 9:28:32
* @version : 1.0
* @History :
* name : date : document : content
* ------------------------------------------------------
* csc : 2020. 10. 16. : : new.
*/

@RestController
public class DemoController {

	@RequestMapping(value = "test")
	public @ResponseBody String test(@RequestParam HashMap<String, Object> reqMap) throws Exception {
		 
		System.out.println("test start");
		
		return "welcome";
	}
	
}
