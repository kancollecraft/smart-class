package me.hibiki.smartclass.service;

import me.hibiki.smartclass.domain.SystemMenu;

import java.util.List;

public interface SystemMenuService{


    int deleteByPrimaryKey(Integer menuId);

    int insert(SystemMenu record);

    int insertSelective(SystemMenu record);

    SystemMenu selectByPrimaryKey(Integer menuId);

    int updateByPrimaryKeySelective(SystemMenu record);

    int updateByPrimaryKey(SystemMenu record);
    List<SystemMenu> listSystemMenus();
    List<SystemMenu> listByRolePidSystemMenus(Integer rolePid);

}
