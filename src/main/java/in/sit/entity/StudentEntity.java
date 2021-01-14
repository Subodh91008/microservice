package in.sit.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentEntity {
private int id;
private Integer rollnumber;
private String name;
private String book;
private Double fees;

}
