package tigerteam.seminaire.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
public class Appartenir {

	@Column (name= "idCommentaire")
	private Integer commentaireId;
	
	@Column(name= "idSeminaire")
	private Integer seminaireId;
}
