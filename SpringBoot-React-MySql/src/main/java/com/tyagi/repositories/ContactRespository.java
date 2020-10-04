package com.tyagi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyagi.models.Contact;

public interface ContactRespository extends JpaRepository<Contact, Integer>{

	public void delete(Contact deleted);
}
