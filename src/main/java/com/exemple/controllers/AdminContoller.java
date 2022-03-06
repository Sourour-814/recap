package com.exemple.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.model.Admin;

import com.exemple.service.AdminCrudImplement;

@RestController
@RequestMapping("/admin")
public class AdminContoller {
	@Autowired
	 AdminCrudImplement adminCrudImplement;
	
	@GetMapping
	public List<Admin> findall()
	{
	return adminCrudImplement.showAdmins();	

	}
	
	@PostMapping
	public Admin addUser(@Valid @RequestBody Admin a)
	{
		return	adminCrudImplement.addAdmin(a);

	}
	@GetMapping("/{id}")
	public Optional<Admin> findOneAdmin(@PathVariable(value = "id") long id)
	{
	return adminCrudImplement.findAdminByid(id);	

	}

}
