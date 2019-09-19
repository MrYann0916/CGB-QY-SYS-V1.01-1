package com.cy.pj.sys.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cy.pj.sys.entity.SysRole;

public interface SysRoleDao {

	List<SysRole> findPageObjects(
			@Param("name")String name,@Param("startIndex")Integer startIndex,
			@Param("pageSize")Integer pageSize

			);
	int getRowCount(@Param("name")String name);
}
