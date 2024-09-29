package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the factura_producto database table.
 * 
 */
@Entity
@Table(name="factura_producto")
@NamedQuery(name="FacturaProducto.findAll", query="SELECT f FROM FacturaProducto f")
public class FacturaProducto implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private FacturaProductoPK id;

	@Column(name="CANTIDAD_PRODUCTO")
	private int cantidadProducto;

	//bi-directional many-to-one association to Factura
	@ManyToOne
	@JoinColumn(name="ID_FACTURA")
	private Factura factura;

	public FacturaProducto() {
	}

	public FacturaProductoPK getId() {
		return this.id;
	}

	public void setId(FacturaProductoPK id) {
		this.id = id;
	}

	public int getCantidadProducto() {
		return this.cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public Factura getFactura() {
		return this.factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

}