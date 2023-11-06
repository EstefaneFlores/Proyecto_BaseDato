package entitys;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "producto")
public class Producto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long idProducto;

    @Column(name = "nombre_producto")
    private String nombreProducto;

    @Column(name = "precio_Producto")
    private Float precioProducto;

    @Column(name = "estado_Producto")
    private String estadoProducto;

    @Column(name = "fecha_Creacion")
    private String fechaCreacion;

    @Column(name = "lote")
    private String lote;

    @Column(name = "descripcion")
    private String descripcion;

      @Column(name = "registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registro;
    
    @Column(name = "modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modificacion;

//--------------------------RELACION--------------------------------------

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "categoria", fetch = FetchType.LAZY) //Un producto va pertenecer solo a una categoria 
		@JoinColumn(name = "idCategoria")
    private Categoria categoria;

}
