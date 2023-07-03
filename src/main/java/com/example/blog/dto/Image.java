package com.example.blog.dto;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Image {

    private String originName;

    private String newName;


}
