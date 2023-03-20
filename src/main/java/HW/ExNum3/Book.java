package HW.ExNum3;


import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Book {

    private String nameOfBook;
    private String autorSurname;
    private Double price;
    private Integer editionYear;
    private Integer amountOfPages;

}
