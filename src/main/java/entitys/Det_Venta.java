package entitys;


import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Table(name = "det_venta")
public class Det_Venta {
    
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_det_venta")
    private Long idPersona;

    @Column(name = "fecha_venta")
    private String fechaVenta;

     @Column(name = "descripcion_venta")
    private String descripcionVenta;

    @Column(name = "registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registro;

    @Column(name = "modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modificacion;

}
