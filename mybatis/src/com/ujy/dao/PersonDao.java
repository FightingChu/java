package com.ujy.dao;

import java.util.List;

import com.ujy.bean.PersonBean;

public interface PersonDao {
	
	/**
	 * ��ȡ������Ա
	 * @return
	 */
	List<PersonBean> getAll();
}