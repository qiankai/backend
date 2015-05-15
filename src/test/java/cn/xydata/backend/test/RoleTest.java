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
        roleService = (RoleService) context.getBean("RoleServiceImpl");
    }
    
  @Test
  public void addUser(){
	  
	  List<Long> resourceIds = new ArrayList<Long>();
	  resourceIds.add((long)10);
	  resourceIds.add((long)20);
	  resourceIds.add((long)30);
	  
	  Role role = new Role();
	  role.setRole("helo");
	  role.setDescription("bbs");
	  role.setResourceIds(resourceIds);
	  role.setAvailable(true);
	  System.out.println(role);
	  //roleService.createRole(role);
  }

}
