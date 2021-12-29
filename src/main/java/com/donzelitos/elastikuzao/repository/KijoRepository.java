package com.donzelitos.elastikuzao.repository;

import com.donzelitos.elastikuzao.model.Kijo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface KijoRepository extends ElasticsearchRepository<Kijo, String> {

    @Query("{\"bool\": {\"must\": [{\"match\": {\"kijo.equipment\": \":Equipment\"}}]}}")
    Page<Kijo> findByEquipment(String Equipment, Pageable pageable);

}
