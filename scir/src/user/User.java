package user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idUser")
	private int idUser;
	
	@Column(name = "names")
	private String names;
	
	@Column(name = "lastNames")
	private String lastNames;
	
	@Column(name = "identification")
	private String identification;
	
	@Column(name = "phoneNumber")
	private String phoneNumber;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "passWord")
	private String password;
	
	@ManyToOne 
	@JoinColumn(name = "idDepartment")
	private Department department;
	
	public User(int idUser, String names, String lastNames, String identification, String phoneNumber, String email, String password, Department department){
		this.idUser = idUser;
		this.names = names;
		this.lastNames = lastNames;
		this.identification = identification;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.department = department;
	
	}
	
	public User() {

	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getNames() {
		return names;
	}
	
	public void setNames(String names){
		this.names = names;
	}
	
	public String getLastNames() {
		return lastNames;
	}
	
	public void setLastNames(String lastNames){
		this.lastNames = lastNames;
	}
	
	public String getIdentification() {
		return identification;
	}
	
	public void setIdentification(String identification){
		this.identification = identification;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword(){
		return password;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public Department getDepartment() {
		return department;
	}
	
	public void setDepartment(Department department) {
		this.department = department;
	}
	
}
