package com.ns.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ns.repo.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
