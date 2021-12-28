package com.donzelitos.elastikuzao.service;

import com.donzelitos.elastikuzao.model.Kijo;

import java.util.List;

@
public interface KijoService {

    Kijo save(Kijo kijo);
    List<Kijo> findByEquipment(String Equipment);

}
