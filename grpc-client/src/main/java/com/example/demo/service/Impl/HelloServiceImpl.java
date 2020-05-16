
package com.example.demo.service.Impl;

import com.example.demo.service.HelloService;

public class HelloServiceImpl implements HelloService {
	 
    public String sayHi(String name) {
        return "Hi, " + name;
    }
 
}