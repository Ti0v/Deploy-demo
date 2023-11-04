package com.test.est.Service;

import com.test.est.Repository.ContactRepository;
import com.test.est.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {
    @Autowired
    private ContactRepository contactRepository;


    public List<Contact> allContacts(){
     return   contactRepository.findAll();
    }
    public Contact saveContact(Contact contact) {

        return contactRepository.save(contact);
    }
}
