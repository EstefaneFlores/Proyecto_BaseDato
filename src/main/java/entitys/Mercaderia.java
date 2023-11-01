package entitys;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "mercaderia")
public class Mercaderia implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mercaderia")
    private Long idMercaderia;

    @Column(name = "descripcion_mercaderia")
    private Long descripcionMercaderia;

    @Column(name = "fecha_ingreso")
    private Long fechaIngreso;

    @Column(name = "fecha_salida")
    private Long fechaSalida;

    @Column(name = "cantidad_mercaderia")
    private Long cantidadMercaderia;

    @Column(name = "estado_mercaderia")
    private Long estadoMercaderia;

    @Column(name = "registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registro;

    @Column(name = "modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modificacion;

    // --------------------------RELACION--------------------------------------

}
