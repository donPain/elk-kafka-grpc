package com.donzelitos.elastikuzao.service;

import com.donzelitos.elastikuzao.model.Kijo;
import com.donzelitos.elastikuzao.repository.KijoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class KijoServiceImpl implements KijoService{

    private KijoRepository kijoRepository;

    @Autowired
    public void setKijoRepository (KijoRepository kijoRepository){
        this.kijoRepository = kijoRepository;
    }


    @Override
    public Kijo save(Kijo kijo) {
        return kijoRepository.save(kijo);
    }

    @Override
    public Page<Kijo> findByEquipment(String Equipment) {
        return kijoRepository.findByEquipment(Equipment, PageRequest.of(0, 10));
    }
}
