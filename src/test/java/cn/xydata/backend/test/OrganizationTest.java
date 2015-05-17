package cn.xydata.backend.test;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.IncorrectUpdateSemanticsDataAccessException;

import cn.xydata.backend.entity.Organization;
import cn.xydata.backend.service.OrganizationService;




public class OrganizationTest {
	
	private OrganizationService organizationService;
    
    @Before
    public void before(){                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        organizationService = (OrganizationService) context.getBean("organizationServiceImpl");
    }
    
//  @Test
//  public void addOrganization(){
//	  Organization organization = new Organization();
//	  organization.setName("how old");
//	  organization.setAvailable(true);
//	  organization.setParentId((long)123);
//	  organization.makeSelfAsParentIds();
//	  organization.
//	  organizationService.createOrganization(organization);
//	  
//  }
    
    
    @Test
    public void addOrganization(){
//    	List<Organization> organizations;
//    	Organization organization = new Organization();
//    	Organization neworganization = new Organization();
//    	organizations = organizationService.findAll();
//    	System.out.println(organizations);
//    	organization = organizationService.findOne(organizations.get(4).getId());
//    	//organization.makeSelfAsParentIds();
//    	//System.out.println(organization);
//    	//organizationService.updateOrganization(organization);
//    	neworganization.setName("bbqs");
//    	neworganization.setAvailable(true);
//    	neworganization.setParentId(organization.getId());
//    	String a = organization.getParentIds()+"/"+ organization.getId().toString();
//    	neworganization.setParentIds(a);
//    	organizationService.createOrganization(neworganization);
//    	
//    	Organization source = new Organization();
//    	Organization target = new Organization();
//    	
//    	source = organizationService.findOne((long)14);
//    	target = organizationService.findOne((long)6);
//    	try{
//    		organizationService.move(source, target);
//    	}	
//    	catch(IncorrectUpdateSemanticsDataAccessException e)
//    	{
//    		System.out.println(e);
//    	}
    	
    	Organization organization = new Organization();
    	
    	organization = organizationService.findOne((long)14);
    	
    	System.out.println(organizationService.findAllWithExclude(organization));
    }
    
//    @Test
//    public void delOrganization(){ 
//    	organizationService.deleteOrganization((long)7);
//    }
//    
  
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
