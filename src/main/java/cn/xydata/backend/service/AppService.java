package cn.xydata.backend.service;

import java.util.List;

import cn.xydata.backend.entity.App;


/**
 * @author qiankai
 * @date 2015-05-17
 * @version 1.0
 */
public interface AppService {
    
	public App createApp(App app);
    public App updateApp(App app);
    public Integer deleteApp(Long appId);

    public App findOne(Long appId);
    public List<App> findAll();

    /**
     * ¸ù¾ÝappKey²éÕÒAppId
     * @param appKey
     * @return
     */
    public Long findAppIdByAppKey(String appKey);

}
