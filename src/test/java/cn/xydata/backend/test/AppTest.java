package cn.xydata.backend.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataIntegrityViolationException;

import cn.xydata.backend.entity.App;
import cn.xydata.backend.service.AppService;



public class AppTest {
	
	private AppService appService;
    
    @Before
    public void before(){                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        appService = (AppService) context.getBean("appServiceImpl");
    }
    
  @Test
  public void addApp(){
	  App app = new App();
	  app.setAppkey("hhhhjjjjlls");
	  app.setAppsecret("jklsdf");
	  app.setAvailable(true);
	  app.setName("je");
	  App app_1 = new App();
      try{
    	  app_1=appService.createApp(app); 
      }catch(DataIntegrityViolationException e){
    	  System.out.println("Username duplicated!");
      }
	  System.out.println(app_1);
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
//  
//  @Test
//  public void findAll(){
//	  List<User> users;
//	  users = userService.findAll();
//	  System.out.println(users);
//  }
//  
//  @Test
//  public void findOne(){
//	  User user_1 = new User();
//	  User user_2 = new User();
//	  user_1 = userService.findByUsername("helloa");
//	  if(user_1 == null ){
//		  System.out.println("none!");
//	  }
//	  else{
//		  user_2 = userService.findOne(user_1.getId());
//		  System.out.println(user_2);
//	  }
//  }
//  
//  @Test
//  public void deleteUser(){
//	  User user_1 = new User();
//	  user_1 = userService.findByUsername("helloa");
//	  if(user_1 == null){
//		  System.out.println("none!");
//	  }
//	  else{
//		  System.out.println(userService.deleteUser(user_1.getId()));
//	  }
//  }
//  
//  @Test
//  public void changePassword(){
//	  User user_1 = new User();
//	  user_1 = userService.findByUsername("hello");
//	  userService.changePassword(user_1.getId(), "helloworld");
//  }
//  
  
  

}
