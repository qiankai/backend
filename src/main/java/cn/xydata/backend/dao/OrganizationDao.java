package cn.xydata.backend.dao;

import java.util.List;

import org.springframework.dao.IncorrectUpdateSemanticsDataAccessException;

import cn.xydata.backend.entity.Organization;

/**
 * @author qiankai
 * @date 2015-05-15
 * @version 1.0
 *
 */
public interface OrganizationDao {
	
    public Integer createOrganization(Organization organization);
    public Integer updateOrganization(Organization organization) throws IncorrectUpdateSemanticsDataAccessException;
    
    public Integer deleteOrganizationSon(Long organizationId);
    public Integer deleteOrganizationParent(Long organizationId);

    Organization findOne(Long organizationId);
    List<Organization> findAll();

    List<Organization> findAllWithExclude(Organization excludeOraganization);

}
