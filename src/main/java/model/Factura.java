package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the factura database table.
 * 
 */
@Entity
@NamedQuery(name="Factura.findAll", query="SELECT f FROM Factura f")
public class Factura implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_FACTURA")
	private int idFactura;

	@Column(name="CANTIDAD_FACTURA")
	private BigDecimal cantidadFactura;

	@Column(name="DESCRIPCION_FACTURA")
	private String descripcionFactura;

	@Temporal(TemporalType.DATE)
	@Column(name="FECHA_FACTURA")
	private Date fechaFactura;

	@Column(name="ID_CLIENTE")
	private int idCliente;

	@Column(name="ID_TIENDA")
	private int idTienda;

	//bi-directional many-to-one association to FacturaProducto
	@OneToMany(mappedBy="factura")
	private List<FacturaProducto> facturaProductos;

	public Factura() {
	}

	public int getIdFactura() {
		return this.idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public BigDecimal getCantidadFactura() {
		return this.cantidadFactura;
	}

	public void setCantidadFactura(BigDecimal cantidadFactura) {
		this.cantidadFactura = cantidadFactura;
	}

	public String getDescripcionFactura() {
		return this.descripcionFactura;
	}

	public void setDescripcionFactura(String descripcionFactura) {
		this.descripcionFactura = descripcionFactura;
	}

	public Date getFechaFactura() {
		return this.fechaFactura;
	}

	public void setFechaFactura(Date fechaFactura) {
		this.fechaFactura = fechaFactura;
	}

	public int getIdCliente() {
		return this.idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdTienda() {
		return this.idTienda;
	}

	public void setIdTienda(int idTienda) {
		this.idTienda = idTienda;
	}

	public List<FacturaProducto> getFacturaProductos() {
		return this.facturaProductos;
	}

	public void setFacturaProductos(List<FacturaProducto> facturaProductos) {
		this.facturaProductos = facturaProductos;
	}

	public FacturaProducto addFacturaProducto(FacturaProducto facturaProducto) {
		getFacturaProductos().add(facturaProducto);
		facturaProducto.setFactura(this);

		return facturaProducto;
	}

	public FacturaProducto removeFacturaProducto(FacturaProducto facturaProducto) {
		getFacturaProductos().remove(facturaProducto);
		facturaProducto.setFactura(null);

		return facturaProducto;
	}

}