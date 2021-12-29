package com.donzelitos.elastikuzao.service;

import com.donzelitos.elastikuzao.model.Kijo;
import org.springframework.data.domain.Page;


public interface KijoService {

    Kijo save(Kijo kijo);
    Page<Kijo> findByEquipment(String Equipment);

}
