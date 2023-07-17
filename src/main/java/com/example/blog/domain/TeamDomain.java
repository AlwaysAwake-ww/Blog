package com.example.blog.domain;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name="TEAM")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class TeamDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="team_index")
    private Long teamIndex;

    @Column(name="team_name")
    private String teamName;


}
