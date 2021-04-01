package com.mzgy.springbootes.repository;

import com.mzgy.springbootes.model.UserInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * @author dongzh
 * @date 2021年04月01日 15:38
 * @function
 */
public interface UserInfoRepository extends PagingAndSortingRepository<UserInfo, Long> {

//    @Query("{\"bool\" : {\"must\" : {\"field\" : {\"name\" : \"?\"}}}}")
    Page<UserInfo> findByName(String name, Pageable pageable);

    List<UserInfo> findByName(String name);

}
