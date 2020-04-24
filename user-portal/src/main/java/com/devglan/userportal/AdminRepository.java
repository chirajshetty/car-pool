package com.devglan.userportal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.Repository;


public interface AdminRepository extends JpaRepository <Admin, Integer> {
	 Admin findByMemailAndMpassword(String Memail, String Mpassword);
}
