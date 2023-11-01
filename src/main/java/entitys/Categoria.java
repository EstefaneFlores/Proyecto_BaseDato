package entitys;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "categoria")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria")
    private Long idCategoria;

    @Column(name = "categoria_alimento")
    private String categoriaAlimento;

    @Column(name = "categoria_Bebida")
    private String categoriaBebida;

     @Column(name = "categoria_cuidado_bebe")
    private String categoriaCuidadoBebe;
    
}
