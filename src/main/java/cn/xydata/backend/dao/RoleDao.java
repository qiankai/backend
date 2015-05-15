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
	
    public Role createRole(Role role);
    public Role updateRole(Role role);
    public void deleteRole(Long roleId);

    public Role findOne(Long roleId);
    public List<Role> findAll();

}
