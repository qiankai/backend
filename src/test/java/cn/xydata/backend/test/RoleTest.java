package cn.xydata.backend.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.xydata.backend.entity.Role;
import cn.xydata.backend.service.RoleService;

public class RoleTest {

	private RoleService roleService;
    
    @Before
    public void before(){                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        roleService = (RoleService) context.getBean("roleServiceImpl");
    }
    
//  @Test
//  public void addRole(){
//	  
//	  List<Long> resourceIds = new ArrayList<Long>();
//	  resourceIds.add((long)10);
//	  resourceIds.add((long)20);
//	  resourceIds.add((long)30);
//	  
//	  Role role = new Role();
//	  role.setRole("helobbc");
//	  role.setDescription("bbsdfsdfs");
//	  role.setResource_ids(resourceIds);
//	  role.setAvailable(true);
//	  System.out.println(role);
//	  roleService.createRole(role);
//  }
  
    @Test
    public void findAll(){
    	List<Role> roles;
	    roles = roleService.findAll();
	    System.out.println(roles);
	    
	    System.out.println(roleService.findRoles(new Long[]{(long)1,(long)2,(long)3}));
	    
	    
	}


}
