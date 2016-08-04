package project.beans;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import project.services.UserDao;
import project.tables.User;

@SuppressWarnings("serial")
@ManagedBean(name = "user")
@ViewScoped
public class UserBean implements Serializable {
	private int id;
	private String name;
	private String password;
	private String userName;
	private String phoneNum;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String signUp() {
		User user = new User();
		user.setName(this.getName());
		user.setPassword(this.getPassword());
		user.setPhoneNum(this.getPhoneNum());
		user.setUserName(this.getUserName());
		UserDao.addStudent(user);
		return"index";
	}
	public String logIn()
	{
		if(UserDao.getByUserNameAndPassword(this.getUserName(), this.getPassword()))
		{
			return"Signup";

		}
    		
	    return null;	
	}
}
