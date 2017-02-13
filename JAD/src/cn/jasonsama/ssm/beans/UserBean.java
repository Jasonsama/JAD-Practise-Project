package cn.jasonsama.ssm.beans;

import java.io.Serializable;

/**
 * @author jasonsama
 * @date 2017年2月13日
 * @project JAD
 * @fileName UserBean.java
 * @describe 
 */
public class UserBean implements Serializable{
	
	private static final long serialVersionUID = 2;
	
	
	private Integer id;
	private String username;
	private String password;
	
	public UserBean(){
		super();
	}
	public UserBean(int id,String username,String userpwd){
		super();
		this.id = id;
		this.username = username;
		this.password = userpwd;
	}
	public Integer getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserpwd() {
		return password;
	}
	public void setUserpwd(String userpwd) {
		this.password = userpwd;
	}
	
}
