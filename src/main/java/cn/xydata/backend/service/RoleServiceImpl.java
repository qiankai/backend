package cn.xydata.backend.service;

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
		// TODO Auto-generated method stub
		return null;
	}

	public Integer deleteRole(Long roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Role findOne(Long roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> findRoles(Long... roleIds) {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<String> findPermissions(Long[] roleIds) {
		// TODO Auto-generated method stub
		return null;
	}

}
