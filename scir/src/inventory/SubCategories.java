package inventory;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "SubCategorias")
public class SubCategories {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSubCategory")
	private int idSubcategory;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "idCategory")
	private Categories categorys;
	
	@OneToMany(mappedBy = "sub", cascade = CascadeType.ALL) 
	private List<Specifics> spec;
	
	public SubCategories(int idSubcategory, String name, Categories categorys) {
		this.idSubcategory = idSubcategory;
		this.name = name;
		this.spec = new ArrayList<>();
		
	}
	
	public int getIdSubcategory() {
		return idSubcategory;
	}

	public void setIdSubcategory(int idSubcategory) {
		this.idSubcategory = idSubcategory;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Categories getCategorys() {
		return categorys;
	}
	
	public void setCategory(Categories categorys) {
		this.categorys = categorys;
	}
	
	public List<Specifics> getSpec(){
		return spec;
	}
	
	public void serSpec(List<Specifics> spec) {
		this.spec = spec;
	}

}





	
