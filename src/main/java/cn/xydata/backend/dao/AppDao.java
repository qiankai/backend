package cn.xydata.backend.dao;

import java.util.List;

import cn.xydata.backend.entity.App;

/**
 * @author qiankai
 * @date 2015-05-15
 * @version 1.0
 *
 */
public interface AppDao {
	
	public Integer createApp(App app);
	public Integer updateApp(App app);
	public Integer deleteApp(Long appId);
	public App findOne(Long appId);
	public List<App> findAll();
	Long findAppIdByAppKey(String appKey);

}
