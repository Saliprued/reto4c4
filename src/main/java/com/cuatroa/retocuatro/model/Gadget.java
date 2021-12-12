package com.cuatroa.retocuatro.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author sprue
 */
@Document(collection = "gadgets")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gadget {
    @Id
    private Integer id;
    private String brand;
    private String category;
    private String name;
    private String description;
    private boolean availability = true;
    private double price;
    private int quantity;
    private String photography;
}
