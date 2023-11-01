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
@Getter
@Setter
@Table(name = "venta")
public class Venta implements Serializable {
    public static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venta")
    private Long idRegistroVenta;

    @Column(name = "productos_vendidos")
    private Long productosVendidos;

    @Column(name = "cantidad_itens")
    private Long cantidadItens;

    @Column(name = "total_ventas")
    private Long totalVentas;

    // --------------------------RELACION--------------------------------------

}
