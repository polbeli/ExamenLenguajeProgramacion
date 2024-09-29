package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the factura_producto database table.
 * 
 */
@Embeddable
public class FacturaProductoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="ID_PRODUCTO")
	private int idProducto;

	@Column(name="ID_FACTURA", insertable=false, updatable=false)
	private int idFactura;

	public FacturaProductoPK() {
	}
	public int getIdProducto() {
		return this.idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public int getIdFactura() {
		return this.idFactura;
	}
	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof FacturaProductoPK)) {
			return false;
		}
		FacturaProductoPK castOther = (FacturaProductoPK)other;
		return 
			(this.idProducto == castOther.idProducto)
			&& (this.idFactura == castOther.idFactura);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idProducto;
		hash = hash * prime + this.idFactura;
		
		return hash;
	}
}