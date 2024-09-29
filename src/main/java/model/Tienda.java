package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tienda database table.
 * 
 */
@Entity
@NamedQuery(name="Tienda.findAll", query="SELECT t FROM Tienda t")
public class Tienda implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_TIENDA")
	private int idTienda;

	@Column(name="DIRECCION_TIENDA")
	private String direccionTienda;

	private String nombre;

	public Tienda() {
	}

	public int getIdTienda() {
		return this.idTienda;
	}

	public void setIdTienda(int idTienda) {
		this.idTienda = idTienda;
	}

	public String getDireccionTienda() {
		return this.direccionTienda;
	}

	public void setDireccionTienda(String direccionTienda) {
		this.direccionTienda = direccionTienda;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}