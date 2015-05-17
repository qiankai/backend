package cn.xydata.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xydata.backend.dao.AppDao;
import cn.xydata.backend.entity.App;

@Service
public class AppServiceImpl implements AppService {

	@Autowired
	private AppDao appDao;
	
	public App createApp(App app) {
		// TODO Auto-generated method stub
		appDao.createApp(app); 
		return findOne(findAppIdByAppKey(app.getAppkey()));
	}

	public App updateApp(App app) {
		appDao.updateApp(app);
		return findOne(findAppIdByAppKey(app.getAppkey()));
	}

	public Integer deleteApp(Long appId) {
		return appDao.deleteApp(appId);
	}

	public App findOne(Long appId) {
		return appDao.findOne(appId);
	}

	public List<App> findAll() {
		return appDao.findAll();
	}

	public Long findAppIdByAppKey(String appKey) {
		return appDao.findAppIdByAppKey(appKey);
	}

}
