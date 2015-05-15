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
     * �����û�
     * @param user
     */
    public Integer createUser(User user);

    public Integer updateUser(User user);

    public Integer deleteUser(Long userId);

    /**
     * �޸�����
     * @param userId
     * @param newPassword
     */
    public Integer changePassword(Long userId, String newPassword);


    User findOne(Long userId);

    List<User> findAll();

    /**
     * �����û��������û�
     * @param username
     * @return
     */
    public User findByUsername(String username);
}
