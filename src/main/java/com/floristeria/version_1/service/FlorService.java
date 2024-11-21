package com.floristeria.version_1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.floristeria.version_1.repository.florRepository;
import com.floristeria.version_1.model.Flores;
@Service
public class FlorService   {
    
    @Autowired 
    private florRepository florRepository;
    
    public List<Flores> listarTodo() {
        return florRepository.findAll();
    }
}
