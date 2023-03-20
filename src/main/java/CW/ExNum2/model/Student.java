package CW.ExNum2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Student {

    private String surname;
    private Integer numberOfGroup;
    private Double money;
    private List<Integer> evaluations;

}
