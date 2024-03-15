package inventory;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Especificaciones")
public class Specifics {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idSpecific")
	private int idSpecific;
	
	@Column(name = "diameter")
	private String diameter;
	
	@Column(name = "quantity")
	private int quantity;
	
	@Column(name = "length")
	private float length;
	
	@Column(name = "code")
	private String code;
	
	@ManyToOne
	@JoinColumn(name = "idCategory")
	private Categories category;
	
	@ManyToOne
	@JoinColumn(name = "idSubCategory")
	private SubCategories sub;
	
	
	public Specifics(int idSpecific, String diameter, int quantity, float length, String code, Categories category, SubCategories sub) {
		this.idSpecific = idSpecific;
		this.diameter = diameter;
		this.quantity = quantity;
		this.length = length;
		this.code = code;
		

	}
	

	public int getIdSpecific() {
		return idSpecific;
	}



	public void setIdSpecific(int idSpecific) {
		this.idSpecific = idSpecific;
	}



	public String getDiameter() {
		return diameter;
	}

	public void setDiameter(String diameter) {
		this.diameter = diameter;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
	public Categories getCategory() {
		return category;
	}
	
	public void setCategory(Categories category) {
		this.category = category; 
	}
	
	public SubCategories getSub() {
		return sub;
	}
	
	public void setSub(SubCategories sub) {
		this.sub = sub; 
	}
	


}
