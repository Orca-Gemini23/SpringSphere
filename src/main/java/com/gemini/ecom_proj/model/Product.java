package com.gemini.ecom_proj.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String description;

    private String brand;
    private BigDecimal price;
    private String category;

    // using jackson library from json to obj
    // using it here for date thing

    private Date releaseDate;

    private boolean productAvailable;
    private int stockQuantity;

    // For the image
    private String imageName;
    private String imageType;

    @Lob // large object jakarta
    private byte[] imageData;

}
