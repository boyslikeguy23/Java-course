package org.example.lesson07_part02.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;
    String imgUrl;
    double price;
    int qty;
    Date publishDate;
    String author;
    Boolean status;

    @ManyToOne
    @JoinColumn(name="category_id", nullable=false)
    Category category;
}
