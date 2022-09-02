package com.example.clip.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.clip.service.TransactionService;

@RestController
@RequestMapping("/api/clip")
@Validated
public class TransactionController {


    @Autowired
    private TransactionService transactionService;


    @GetMapping(value="/users/payment")
    public ResponseEntity<?> getUserWithPayment(){
    	return ResponseEntity.ok(transactionService.getUsers());
    }
        
}
