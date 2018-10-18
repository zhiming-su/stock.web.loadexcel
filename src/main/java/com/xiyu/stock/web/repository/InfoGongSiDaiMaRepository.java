package com.xiyu.stock.web.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.xiyu.stock.web.model.InfoGongSiDaiMa;

public interface InfoGongSiDaiMaRepository extends JpaRepository<InfoGongSiDaiMa, Long> {
	
	@Modifying
	@Transactional
	@Query(value="delete from InfoGongSiDaiMa gsdm where gsdm.GONGSI_ID in (?1)")
	void delByGongSiID(String str);
}
