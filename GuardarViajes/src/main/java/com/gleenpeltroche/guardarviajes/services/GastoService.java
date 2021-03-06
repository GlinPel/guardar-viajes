package com.gleenpeltroche.guardarviajes.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gleenpeltroche.guardarviajes.models.Gasto;
import com.gleenpeltroche.guardarviajes.repositories.GastoRepository;

@Service
public class GastoService {
	private final GastoRepository gastoRepository;
    
    public GastoService(GastoRepository gastoRepository){
        this.gastoRepository = gastoRepository;
    }
    
    public List<Gasto> allGastos(){
    	return gastoRepository.findAll();
    }
    
    public Gasto createGasto(Gasto gasto) {
        return gastoRepository.save(gasto);
    }
   
    /*public List<Book> allBooks() {
        return bookRepository.findAll();
    }

    public Book createBook(Book b) {
        return bookRepository.save(b);
    }

    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }*/
}
