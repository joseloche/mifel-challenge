package com.mifel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mifel.service.AES;

@RestController
@RequestMapping("/api/mifel")
@Validated
public class AESController {

	@Autowired
	private AES aes;

	@GetMapping(value="/AES/{value}")
    public ResponseEntity<?> getReport(@PathVariable String value){
    	return ResponseEntity.ok(aes.AES(value));
    }

}
