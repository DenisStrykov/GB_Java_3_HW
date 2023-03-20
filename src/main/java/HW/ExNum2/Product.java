package HW.ExNum2;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Product {

    private String name;
    private String madeIn;
    private Double weight;
    private Double price;
    private Integer sort;

}
