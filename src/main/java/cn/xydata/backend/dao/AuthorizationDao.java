package cn.xydata.backend.dao;

import java.util.List;

import cn.xydata.backend.entity.Authorization;


/**
 * @author qiankai
 * @date 2015-05-15
 * @version 1.0
 *
 */
public interface AuthorizationDao {
    public Authorization createAuthorization(Authorization authorization);
    public Authorization updateAuthorization(Authorization authorization);
    public void deleteAuthorization(Long authorizationId);

    public Authorization findOne(Long authorizationId);
    public List<Authorization> findAll();

    public Authorization findByAppUser(Long appId, Long userId);

}
