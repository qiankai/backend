package cn.xydata.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xydata.backend.dao.OrganizationDao;
import cn.xydata.backend.entity.Organization;

@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	private OrganizationDao organizationDao;
	
	public Integer createOrganization(Organization organization) {
		return organizationDao.createOrganization(organization);
		
	}

	public Integer updateOrganization(Organization organization) {
		return organizationDao.updateOrganization(organization);
	}

	public void deleteOrganization(Long organizationId) {
		organizationDao.deleteOrganizationSon(organizationId);
		organizationDao.deleteOrganizationParent(organizationId);
	}

	public Organization findOne(Long organizationId) {
		return organizationDao.findOne(organizationId);
	}

	public List<Organization> findAll() {
		return organizationDao.findAll();
	}

	public Object findAllWithExclude(Organization excludeOraganization) {
		return organizationDao.findAllWithExclude(excludeOraganization);
	}

	public void move(Organization source, Organization target) {
		Long s_id = source.getParentId();
		String s_ids = source.getParentIds();
		String tar_ids = target.getParentIds();
		source.setParentId(target.getId());
	    source.setParentIds(tar_ids +"/"+ target.getId());
	    organizationDao.updateOrganization(source);
	}

}
