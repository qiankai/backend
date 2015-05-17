package cn.xydata.backend.service;

import java.util.List;

import cn.xydata.backend.entity.Organization;

public interface OrganizationService {
    
	public Integer createOrganization(Organization organization);
    public Integer updateOrganization(Organization organization);
    public void deleteOrganization(Long organizationId);

    Organization findOne(Long organizationId);
    List<Organization> findAll();

    Object findAllWithExclude(Organization excludeOraganization);

    void move(Organization source, Organization target);

}
