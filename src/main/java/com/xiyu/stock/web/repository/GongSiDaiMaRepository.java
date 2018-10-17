package com.xiyu.stock.web.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.xiyu.stock.web.model.GongSiDaiMa;

public interface GongSiDaiMaRepository extends JpaRepository<GongSiDaiMa, Long> {
	
	@Modifying
	@Transactional
	@Query(value="delete from GongSiDaiMa gsdm where gsdm.GONGSI_ID in (?1)")
	void delByGongSiID(String str);
}
