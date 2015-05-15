package cn.xydata.backend.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xydata.backend.dao.RoleDao;
import cn.xydata.backend.entity.Role;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;
	
	public Integer createRole(Role role) {
		return roleDao.createRole(role);	
	}

	public Integer updateRole(Role role) {
		return roleDao.updateRole(role);
	}

	public Integer deleteRole(Long roleId) {
		return roleDao.deleteRole(roleId);
	}

	public Role findOne(Long roleId) {
		return roleDao.findOne(roleId);
	}

	public List<Role> findAll() {
		return roleDao.findAll();
	}

	public Set<String> findRoles(Long... roleIds) {
	     Set<String> roles = new HashSet<String>();
	        for(Long roleId : roleIds) {
	            Role role = findOne(roleId);
	            if(role != null) {
	                roles.add(role.getRole());
	            }
	        }
	        return roles;
	}

	public Set<String> findPermissions(Long[] roleIds) {
		// TODO Auto-generated method stub
		return null;
	}

}
