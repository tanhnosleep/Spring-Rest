package tacos;

import java.sql.Date;
import java.util.List;
import lombok.Data;

@Data
public class Taco {
	private String name;
	private List<String> ingredients;
	private Long id;
	private Date createdAt;
}