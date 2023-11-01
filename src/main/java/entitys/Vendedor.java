package entitys;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "vendedor")
public class Vendedor implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vendedor")
    private Long  idVendedor;

    @Column(name = "telefono_vendedor")
    private Long telefonoVendedor;

    @Column(name = "stock_asignado")
    private Long stockAsignado;

    @Column(name = "ruta_vendedor")
    private Long rutaVendedor;

    //--------------------------RELACION--------------------------------------

}
