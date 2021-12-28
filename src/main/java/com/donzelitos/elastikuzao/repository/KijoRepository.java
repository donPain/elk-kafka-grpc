package com.donzelitos.elastikuzao.repository;

import com.donzelitos.elastikuzao.model.Kijo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface KijoRepository extends ElasticsearchRepository<Kijo, String> {

    List<Kijo> findByEquipment(String Equipment);

}
