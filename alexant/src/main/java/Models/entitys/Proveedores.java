package entitys;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Table(name = "proveedor")
public class Proveedores {

     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id_proveedor")
     private Long idProveedor;

     @Column(name = "nombre_provedor")
     private String nombreProvedor;

     @Column(name = "telefono_proveedor")
     private String telefonoProveedor;

     @Column(name = "descripción_provedor")
     private String descripciónProvedor;

     @Column(name = "registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registro;

    @Column(name = "modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modificacion;

}
