package com.exemple.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exemple.model.Admin;
import com.exemple.repository.AdminRepository;

@Service
public class AdminCrudImplement implements AdminCrudInterface {
	@Autowired
	AdminRepository adminRepository;
	@Override
	public Admin addAdmin(Admin a) {
		// TODO Auto-generated method stub
		return adminRepository.save(a);
	}

	@Override
	public List<Admin> showAdmins() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

	@Override
	public Optional<Admin> findAdminByid(long id) {
		// TODO Auto-generated method stub
		return adminRepository.findById(id);
	}

}
