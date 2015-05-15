package cn.xydata.backend.service;

import java.util.List;

import cn.xydata.backend.entity.User;

/**
 * @author qiankai
 * @date 2015-05-15
 * @version 1.0
 */
public interface UserService {
    /**
     * 创建用户
     * @param user
     */
    public Integer createUser(User user);

    public Integer updateUser(User user);

    public Integer deleteUser(Long userId);

    /**
     * 修改密码
     * @param userId
     * @param newPassword
     */
    public Integer changePassword(Long userId, String newPassword);


    User findOne(Long userId);

    List<User> findAll();

    /**
     * 根据用户名查找用户
     * @param username
     * @return
     */
    public User findByUsername(String username);
}
