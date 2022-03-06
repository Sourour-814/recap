package com.exemple.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.model.Rdv;
import com.exemple.repository.RdvRepository;

@Service
public class RdvCrudImplement implements RdvCrudInterface {
	@Autowired
	RdvRepository rdvRepository;
	@Override
	public Rdv addRdv(Rdv r) {
		// TODO Auto-generated method stub
		return rdvRepository.save(r);
	}

	@Override
	public List<Rdv> showRdvs() {
		// TODO Auto-generated method stub
		return rdvRepository.findAll();
	}

	@Override
	public Optional<Rdv> findRdvByid(long id) {
		// TODO Auto-generated method stub
		return rdvRepository.findById(id);
	}

	@Override
	public void deleteRdv(long id) {
		// TODO Auto-generated method stub
		rdvRepository.deleteById(id);
	}

}
