package cn.xydata.backend.service;

import java.util.List;
import java.util.Set;

import cn.xydata.backend.entity.Role;

/**
 * @author qiankai
 * @date 2015-05-15
 * @version 1.0
 */

public interface RoleService {
	
	 public Integer createRole(Role role);
	 public Integer updateRole(Role role);
	 public Integer deleteRole(Long roleId);

	 public Role findOne(Long roleId);
	 public List<Role> findAll();

	    /**
	     * 根据角色编号得到角色标识符列表
	     * @param roleIds
	     * @return
	     */
	 Set<String> findRoles(Long... roleIds);

	    /**
	     * 根据角色编号得到权限字符串列表
	     * @param roleIds
	     * @return
	     */
	 Set<String> findPermissions(Long[] roleIds);

}
