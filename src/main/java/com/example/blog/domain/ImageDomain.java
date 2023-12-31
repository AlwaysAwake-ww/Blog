package com.example.blog.domain;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="IMAGE")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ImageDomain {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="image_index")
    private Long imageIndex;


    @Column(name="origin_name")
    private String originName;

    @Column(name="new_name")
    private String newName;

    @Column(name="image_path")
    private String imagePath;

    @Column(name="image_ext")
    private String imageExt;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="post_index",updatable = false)
    private PostDomain postDomain;



}
