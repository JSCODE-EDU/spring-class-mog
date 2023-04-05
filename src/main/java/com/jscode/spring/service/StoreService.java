package com.jscode.spring.service;

import com.jscode.spring.entity.Store;
import com.jscode.spring.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StoreService {
    private final StoreRepository storeRepository;

    public List<Store> findAll() {
        return storeRepository.findAll();
    }

    public Optional<Store> findById(Long id) {
        return storeRepository.findById(id);
    }

    public Store save(Store store) {
        return storeRepository.save(store);
    }
}
