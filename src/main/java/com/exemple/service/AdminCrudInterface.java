package com.exemple.service;

import java.util.List;
import java.util.Optional;

import com.exemple.model.Admin;



public interface AdminCrudInterface {
	Admin addAdmin(Admin a);
	List<Admin> showAdmins();
	Optional<Admin> findAdminByid(long id);

}
