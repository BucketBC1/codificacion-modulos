package inventory;

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
@Table(name = "Categorias")
public class Categories {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idCategory")
	private int idCategory;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "material")
	private String material;
	
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	private List<Specifics> spec;
	
	@OneToMany(mappedBy = "catecorys", cascade = CascadeType.ALL)
	private List<SubCategories> sub;
	
	public Categories(int idCategory, String name, String material) {
		this.idCategory = idCategory;
		this.name = name;
		this.material = material;
		this.spec = new ArrayList<>();
		this.sub = new ArrayList<>();
	}
	
	
	
	public int getIdCategories() {
		return idCategory;
	}


	public void setIdCategories(int idCategories) {
		this.idCategory = idCategories;
	}


	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setMateorial(String material) {
		this.material = material;
	}
	
	public List<Specifics> getSpec(){
		return spec;
	}
	
	public void setSapec(List<Specifics> spec) {
		this.spec = spec;
	}
	
	public List<SubCategories> getSub(){
		return sub;
	}
	
	public void setSub(List<SubCategories> sub) {
		this.sub = sub; 
	}


	public Categories(int idCategory, String name, String material, List<Specifics> spec, List<SubCategories> sub) {
		super();
		this.idCategory = idCategory;
		this.name = name;
		this.material = material;
		this.spec = spec;
		this.sub = sub;
	}
	
	
}




