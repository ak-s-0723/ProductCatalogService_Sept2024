package org.example.productcatalogservice_sept2024.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product extends BaseModel {
    private String title;

    private String description;

    private String imageUrl;

    private Double amount;

    @JsonManagedReference
    @ManyToOne(cascade = CascadeType.ALL)
    private Category category;

    private Boolean isPrimeSpecific;
}
