package tigerteam.seminaire.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Size;

@Entity
public class Adresse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAdresse;
	
	@Size(min= 1, max=4)
	@Column(length = 4, nullable = false)
	private String numero;
	
	@Size(min= 3, max=45)
	@Column(length = 45, nullable = false)
	private String rue;
	
	@Size(min= 3 , max = 15)
	@Column(unique = true, length = 15, nullable = false)
	private String ville;
	
	@Size(max=5)
	@Column(unique = true, length = 5, nullable = false)
	private String codePostal;
	
	@OneToOne
	@JoinColumn(name = "idUser", referencedColumnName = "idUser")
	private User user;
	
	@OneToOne
	@JoinColumn(name = "idSeminaire", referencedColumnName = "idSeminaire")
	private Seminaire seminaire;
	
	
	
}
