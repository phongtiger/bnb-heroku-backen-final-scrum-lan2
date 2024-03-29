package com.codegym.lastproject.service.impl;

import com.codegym.lastproject.model.HouseStatus;
import com.codegym.lastproject.repository.HouseStatusRepository;
import com.codegym.lastproject.service.HouseStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseStatusServiceImpl implements HouseStatusService {
    @Autowired
    private HouseStatusRepository houseStatusRepository;

    @Override
    public List<HouseStatus> findAll() {
        return houseStatusRepository.findAll();
    }

    @Override
    public HouseStatus findById(Long id) {
        return houseStatusRepository.findById(id).get();
    }

    @Override
    public void save(HouseStatus houseStatus) {
        houseStatusRepository.save(houseStatus);
    }

    @Override
    public void deleteById(Long id) {
        houseStatusRepository.deleteById(id);
    }

    @Override
    public List<HouseStatus> findAllByHouseId(Long houseId) {
        return houseStatusRepository.findAllByHouseId(houseId);
    }
}
