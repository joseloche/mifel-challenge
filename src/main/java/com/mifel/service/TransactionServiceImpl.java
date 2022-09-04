package com.mifel.service;

import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Service;

import com.mifel.entity.Catalog;
import com.mifel.exception.NotDataFoundException;
import com.mifel.repository.CatalogRepository;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private CatalogRepository usersRepository;

	@Autowired
	private MessageSource messageSource;
	

	@Override
	public List<Catalog> getUsers(String value) {
		List<Catalog> users = value==null 
				? usersRepository.findAll() : usersRepository.findByName(value);
		if(users.isEmpty()) { 
			throw new NotDataFoundException(messageSource.getMessage("sin.informacion", null, Locale.getDefault()));			
		}
		return users;
	}
	

}
