package model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Orden {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String numero;
	private Date fecha_creacion;
	private Date fecha_recibido;
	private Double total;
	private Usuario usuario;
	@OneToOne(mappedBy = "DetalleOrden")
	private DetalleOrden detalle;
}
