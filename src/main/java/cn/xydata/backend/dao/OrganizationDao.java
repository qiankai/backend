package cn.xydata.backend.dao;

import java.util.List;

import cn.xydata.backend.entity.Organization;

/**
 * @author qiankai
 * @date 2015-05-15
 * @version 1.0
 *
 */
public interface OrganizationDao {
	
    public Organization createOrganization(Organization organization);
    public Organization updateOrganization(Organization organization);
    public void deleteOrganization(Long organizationId);

    Organization findOne(Long organizationId);
    List<Organization> findAll();

    List<Organization> findAllWithExclude(Organization excludeOraganization);

    void move(Organization source, Organization target);

}
