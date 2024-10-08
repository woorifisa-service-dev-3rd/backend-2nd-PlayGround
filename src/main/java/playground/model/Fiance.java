package playground.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.*;
import playground.dto.UserInsertDTO;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Entity
@ToString
public class Fiance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private FianceType type;

	@Column(nullable = false)
	private String name;

	@Builder.Default
	@OneToMany(mappedBy = "fiance")
	private List<Account> accounts = new ArrayList<>();


}
