package tigerteam.seminaire.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinColumns;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tigerteam.seminaire.enums.Role;
import tigerteam.seminaire.enums.Sexe;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUser;

	@Size(min = 2, max = 20)
	private String nom;

	@Size(min = 2, max = 20)
	private String prenom;

	@Size(min = 2, max = 20)
	@Column(unique = true, length = 20, nullable = false)
	private String login;

	@Size(min = 8, max = 15)
	@Column(length = 15, nullable = false)
	private String mdp;

	@Size(min = 8, max = 10)
	@Enumerated(EnumType.STRING)
	private Sexe sexe;

	@Enumerated(EnumType.STRING)
	@Size(min = 8, max = 15)
	private Role role;

	@OneToOne
	@JoinColumn(name = "idAdresse")
	private Adresse adresse;

	@OneToMany(mappedBy = "user")
	private List<Calendrier> calendriers;

	@ManyToMany
	@JoinTable(name = "Recevoir", joinColumns = @JoinColumn(name = "idUser"), 
	inverseJoinColumns = @JoinColumn(name = "idNotification"))
	private List<Notification> notifications = new ArrayList<>();
	
	
	@OneToMany(mappedBy = "user")
	private List<Commentaire> commentaires;
	
	@ManyToMany
	@JoinTable(name = "Participer", joinColumns = @JoinColumn(name = "idUser"), 
	inverseJoinColumns = @JoinColumn(name = "idSeminaire"))
	private List<Seminaire> seminaires = new ArrayList<>();
	
	@OneToMany(mappedBy = "user")
	private List<Seminaire> seminairesIntervenant;

}
