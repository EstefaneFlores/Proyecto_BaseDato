package entitys;

import java.io.Serializable;
import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Table(name = "persona")
public class Persona implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_persona")
    private Long idPersona;

    @Column(name = "nombres")
    private Long nombres;

    @Column(name = "ap_paterno")
    private Long apPaterno;

    @Column(name = "ap_materno")
    private Long apMaterno;

    @Column(name = "ci")
    private Long ci;

    @Column(name = "direccion")
    private Long direccion;

    @Column(name = "celular")
    private Long celular;

    @Column(name = "estado")
    private Long estado;

    @Column(name = "registro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date registro;

    @Column(name = "modificacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date modificacion;

    //--------------------------RELACION--------------------------------------

    // 	@OneToMany(cascade = CascadeType.ALL, mappedBy = "persona", fetch = FetchType.LAZY)
	// private List<Usuario> usuarios;

    // @ManyToOne(fetch = FetchType.LAZY)
	// @JoinColumn(name = "idGradoAcademico")
    // private GradoAcademico grado_academico;

    // @ManyToOne(fetch = FetchType.LAZY)
	// @JoinColumn(name = "idTipoEstadoCivil")
    // private TiposEstadoCivil tipos_estado_civil;

    // @ManyToOne(fetch = FetchType.LAZY)
	// @JoinColumn(name = "idDip")
    // private Dip dip;
}