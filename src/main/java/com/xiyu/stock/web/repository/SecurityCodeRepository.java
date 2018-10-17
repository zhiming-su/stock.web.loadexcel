package com.xiyu.stock.web.repository;

import org.springframework.data.repository.CrudRepository;
import com.xiyu.stock.web.model.SecurityCodeNew;

public interface SecurityCodeRepository extends CrudRepository<SecurityCodeNew, Long> {

}
