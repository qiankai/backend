package cn.xydata.backend.dao;

import java.util.List;

import cn.xydata.backend.entity.Role;

/**
 * @author qiankai
 * @date 2015-05-15
 * @version 1.0
 *
 */
public interface RoleDao {
	
    public Integer createRole(Role role);
    public Integer updateRole(Role role);
    public Integer deleteRole(Long roleId);

    public Role findOne(Long roleId);
    public List<Role> findAll();

}
