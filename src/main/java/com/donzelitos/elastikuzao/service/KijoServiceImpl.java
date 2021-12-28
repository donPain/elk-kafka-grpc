package com.donzelitos.elastikuzao.service;

import com.donzelitos.elastikuzao.model.Kijo;
import com.donzelitos.elastikuzao.repository.KijoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<Kijo> findByEquipment(String Equipment) {
        return kijoRepository.findByEquipment(Equipment);
    }
}
