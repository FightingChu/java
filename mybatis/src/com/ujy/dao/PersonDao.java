package com.ujy.dao;

import java.util.List;

import com.ujy.bean.PersonBean;

public interface PersonDao {
	
	/**
	 * 获取所有人员
	 * @return
	 */
	List<PersonBean> getAll();
}
