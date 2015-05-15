package cn.xydata.backend.dao;

import java.util.List;

import org.springframework.dao.DataIntegrityViolationException;

import cn.xydata.backend.entity.User;

/**
 * @author qiankai
 * @date 2015-05-15
 * @version 1.0
 */
public interface UserDao {
	
    public Integer createUser(User user) throws DataIntegrityViolationException;
    public Integer updateUser(User user);
    public Integer deleteUser(Long userId);

    User findOne(Long userId);

    List<User> findAll();

    User findByUsername(String username);

}
