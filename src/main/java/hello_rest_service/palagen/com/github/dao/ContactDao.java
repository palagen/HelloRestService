package hello_rest_service.palagen.com.github.dao;

import hello_rest_service.palagen.com.github.model.Contact;

import java.util.List;

public interface ContactDao {

    List<Contact> findAll();

}
