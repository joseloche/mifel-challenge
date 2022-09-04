package com.mifel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mifel.service.TransactionService;

@RestController
@RequestMapping("/api/mifel")
@Validated
public class TransactionController {


    @Autowired
    private TransactionService transactionService;


    @GetMapping(value="/users/catalog")
    public ResponseEntity<?> getUserWithPayment(){
    	return ResponseEntity.ok(transactionService.getUsers(null));
    }
        
    @GetMapping(value="/users/catalog/{value}")
    public ResponseEntity<?> getReport(@PathVariable String value){
    	return ResponseEntity.ok(transactionService.getUsers(value));
    }

}
