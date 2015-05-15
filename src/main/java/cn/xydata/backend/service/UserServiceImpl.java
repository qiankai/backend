package cn.xydata.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xydata.backend.dao.UserDao;
import cn.xydata.backend.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Autowired
	private PasswordHelper passwordHelper;

	public Integer createUser(User user) {
		passwordHelper.encryptPassword(user);
		return userDao.createUser(user);
	}

	public Integer updateUser(User user) {
		passwordHelper.encryptPassword(user);
		return userDao.updateUser(user);
	}

	public Integer deleteUser(Long userId) {
		return userDao.deleteUser(userId);

	}

	public Integer changePassword(Long userId, String newPassword) {
		User user = new User();
		user = this.findOne(userId);
		user.setPassword(newPassword);
		passwordHelper.encryptPassword(user);
		return userDao.updateUser(user);

	}

	public User findOne(Long userId) {
		return userDao.findOne(userId);
	}

	public List<User> findAll() {
		return userDao.findAll();
	}

	public User findByUsername(String username) {
		return userDao.findByUsername(username);
	}

}
