package com.example.demo.Service;

import com.example.demo.Entity.Restorent;
import com.example.demo.Repository.RestorentRepository;
import org.springframework.stereotype.Service;

@Service
public class RestorentService {
    private final RestorentRepository repository;

    public RestorentService(RestorentRepository repository){
        this.repository=repository;
    }
    public Restorent SaveRestorent(Restorent restorent){
        return repository.save(restorent);
    }
}
