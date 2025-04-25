package com.ishujaa.BiblioBack.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private int id;
    private String title;
    private String author;
    private String genre;
    private int year;
    @JsonProperty("is_available")
    private boolean isAvailable;

}