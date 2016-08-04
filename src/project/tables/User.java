package project.tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "MM_USERS") 
@NamedQuery(name="User.byUserNameAndPassword", query="FROM User WHERE userName = ? and password = ? ")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="USER_ID_SEQ")
	@SequenceGenerator(name="USER_ID_SEQ",sequenceName="USER_SEQ",allocationSize=1)
	private int ID;
	@Column(name = "NAME")
	private String name;
	@Column(name = "PASSWORD")
	private String password;
	@Column(name = "USER_NAME")
	private String userName;
	@Column(name = "PHONE_NUM")
	private String PhoneNum;

	
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
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
		return PhoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		PhoneNum = phoneNum;
	}

}
