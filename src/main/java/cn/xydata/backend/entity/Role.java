package cn.xydata.backend.entity;

import java.io.Serializable;
import java.util.List;


/**
 * @author qiankai
 * @date 2015-05-15
 * @version 1.0
 *
 */
public class Role implements Serializable{
    private Long id; //���
    private String role; //��ɫ��ʶ �������ж�ʹ��,��"admin"
    private String description; //��ɫ����,UI������ʾʹ��
    private List<Long> resource_ids; //ӵ�е���Դ
    private Boolean available = Boolean.FALSE; //�Ƿ����,��������ý�������Ӹ��û�
    
    public Role() {
    }

    public Role(String role, String description, Boolean available) {
        this.role = role;
        this.description = description;
        this.available = available;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

    

	public List<Long> getResource_ids() {
		return resource_ids;
	}

	public void setResource_ids(List<Long> resource_ids) {
		this.resource_ids = resource_ids;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Role role = (Role) o;

        if (id != null ? !id.equals(role.id) : role.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id=" + id +
                ", role='" + role + '\'' +
                ", description='" + description + '\'' +
                ", resourceIds=" + resource_ids +
                ", available=" + available +
                '}';
    }

}
