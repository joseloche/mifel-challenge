package com.example.clip.service;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.example.clip.entity.Catalog;
import com.example.clip.exception.NotDataFoundException;
import com.example.clip.repository.CatalogRepository;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private CatalogRepository usersRepository;

	@Autowired
	private MessageSource messageSource;
	

	@Override
	public List<Catalog> getUsers() {
		List<Catalog> users = usersRepository.findAll();
		if(users.isEmpty()) {
			throw new NotDataFoundException(messageSource.getMessage("sin.informacion", null, Locale.getDefault()));			
		}
		return users;
	}
	

}
