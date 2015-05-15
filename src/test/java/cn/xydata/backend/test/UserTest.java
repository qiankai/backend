package cn.xydata.backend.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataIntegrityViolationException;

import com.fr.form.ui.Password;

import cn.xydata.backend.entity.User;
import cn.xydata.backend.service.UserService;

public class UserTest {
	
	private UserService userService;
    
    @Before
    public void before(){                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        userService = (UserService) context.getBean("userServiceImpl");
    }
    
  @Test
  public void addUser(){
      User user = new User();
      user.setUsername("hello");
      user.setPassword("pp");
      user.setOrganizationId((long) 123);
      user.setSalt("hellosale");
      user.setLocked(false);
      try{
    	  userService.createUser(user); 
      }catch(DataIntegrityViolationException e){
    	  System.out.println("Username duplicated!");
      }
      
  }
  
//  @Test
//  public void addUser(){
//      User user = new User();
//      user.setId((long) 6);
//      user.setUsername("helloa");
//      user.setPassword("ppasdfs");
//      user.setOrganizationId((long) 123);
//      user.setSalt("hellosale");
//      user.setLocked(false);
//      System.out.println(userService.updateUser(user));
//  }
//  
//  @Test
//  public void findByUsername(){
//	  User user = new User();
//	  user = userService.findByUsername("helloa");
//	  System.out.println(user);
//  }
  
  @Test
  public void findAll(){
	  List<User> users;
	  users = userService.findAll();
	  System.out.println(users);
  }
  
  @Test
  public void findOne(){
	  User user_1 = new User();
	  User user_2 = new User();
	  user_1 = userService.findByUsername("helloa");
	  if(user_1 == null ){
		  System.out.println("none!");
	  }
	  else{
		  user_2 = userService.findOne(user_1.getId());
		  System.out.println(user_2);
	  }
  }
  
  @Test
  public void deleteUser(){
	  User user_1 = new User();
	  user_1 = userService.findByUsername("helloa");
	  if(user_1 == null){
		  System.out.println("none!");
	  }
	  else{
		  System.out.println(userService.deleteUser(user_1.getId()));
	  }
  }
  
  @Test
  public void changePassword(){
	  User user_1 = new User();
	  user_1 = userService.findByUsername("hello");
	  userService.changePassword(user_1.getId(), "helloworld");
  }
  
  
  

}
