package com.apap.tutorial4.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * Dealer Model
 * @author amira.taliya
 *
 */
@Entity
@Table(name="dealer")
public class DealerModel implements Serializable{
	@Id
	@GeneratedValue(strategy=GeneralizationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(max=50)
	@Column(name="alamat", nullable=false)
	private String alamat;
	
	@NotNull
	@Size(max=13)
	@Column(name="no_telp", nullable=false)
	private String noTelp;

	@OneToMany(mappedBy="dealer", fetch=FetchType.LAZY, cascade=CascadeType.PERSIST)
	private List<CarModel> listCar;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getNoTelp() {
		return noTelp;
	}

	public void setNoTelp(String noTelp) {
		this.noTelp = noTelp;
	}

	public List<CarModel> getListCar() {
		return listCar;
	}

	public void setListCar(List<CarModel> listCar) {
		this.listCar = listCar;
	}
	
	
}
