package user;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Departamento")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idDepartment")
	private int idDepartment;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(mappedBy = "department", cascade = CascadeType.ALL)
	private List<User> user;
	
	public Department(int idDepartment, String name) {
		this.idDepartment = idDepartment;
		this.name = name;
		this.user = new ArrayList<>();
	}
	
	public int getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(int idDepartment) {
		this.idDepartment = idDepartment;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public List<User> getUser(){
		return user;
	}
	
	public void setUser(List<User> user) {
		this.user = user;
	}

	public Department(int idDepartment, String name, List<User> user) {
		super();
		this.idDepartment = idDepartment;
		this.name = name;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Department [idDepartment=" + idDepartment + ", name=" + name + ", user=" + user + "]";
	}
}
