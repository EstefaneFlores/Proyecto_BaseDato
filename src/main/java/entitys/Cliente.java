package entitys;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "cliente")
public class Cliente {

        @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Long idPersona;

    @Column(name = "nro_nit")
    private Long nroNIT;

       @Column(name = "n_nota")
    private String numeroNota;

        @Column(name = "tipo_de_ruta")
    private String tipoRuta;
    
}
