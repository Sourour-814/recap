package com.exemple.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemple.model.Admin;



public interface AdminRepository extends JpaRepository<Admin, Long> {

}
