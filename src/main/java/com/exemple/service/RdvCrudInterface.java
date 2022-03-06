package com.exemple.service;

import java.util.List;
import java.util.Optional;

import com.exemple.model.Rdv;


public interface RdvCrudInterface {
	Rdv addRdv(Rdv r);
	List<Rdv> showRdvs();
	Optional<Rdv> findRdvByid(long id);
	void deleteRdv(long id);
}
