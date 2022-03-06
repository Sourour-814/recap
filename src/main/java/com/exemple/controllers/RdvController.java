package com.exemple.controllers;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemple.model.Rdv;
import com.exemple.service.RdvCrudImplement;


@RestController
@RequestMapping("/rdv")
public class RdvController {
	@Autowired
	RdvCrudImplement rdvCrudImplement;
	@GetMapping
	public List<Rdv> findall()
	{
	return rdvCrudImplement.showRdvs();	

	}
	@PostMapping
	public Rdv addRdv(@Valid @RequestBody Rdv u)
	{
		return	rdvCrudImplement.addRdv(u);

	}
	@DeleteMapping("/{id}")
	public void deleteRdv(@PathVariable(value = "id") long id)
	{
	rdvCrudImplement.deleteRdv(id);	

	}
	@GetMapping("/{id}")
	public Optional<Rdv> findOneRdv(@PathVariable(value = "id") long id)
	{
	return rdvCrudImplement.findRdvByid(id);	

	}

}
