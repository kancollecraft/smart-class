package me.hibiki.smartclass.service.impl;

import me.hibiki.smartclass.domain.SystemMenu;
import me.hibiki.smartclass.mapper.SystemMenuMapper;
import me.hibiki.smartclass.service.SystemMenuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SystemMenuServiceImpl implements SystemMenuService {

    @Resource
    private SystemMenuMapper systemMenuMapper;

    @Override
    public int deleteByPrimaryKey(Integer menuId) {
        return systemMenuMapper.deleteByPrimaryKey(menuId);
    }

    @Override
    public int insert(SystemMenu record) {
        return systemMenuMapper.insert(record);
    }

    @Override
    public int insertSelective(SystemMenu record) {
        return systemMenuMapper.insertSelective(record);
    }

    @Override
    public SystemMenu selectByPrimaryKey(Integer menuId) {
        return systemMenuMapper.selectByPrimaryKey(menuId);
    }

    @Override
    public int updateByPrimaryKeySelective(SystemMenu record) {
        return systemMenuMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SystemMenu record) {
        return systemMenuMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<SystemMenu> listSystemMenus() {
        return systemMenuMapper.listSystemMenus();
    }

    @Override
    public List<SystemMenu> listByRolePidSystemMenus(Integer rolePid) {
        return systemMenuMapper.listByRolePidSystemMenus(rolePid);
    }
}
