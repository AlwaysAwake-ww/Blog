package com.example.blog.domain;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Service;

@Entity
@Table(name="TEAM_MEMBER")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class TeamMemberDomain {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="team_member_index")
    private Long teamMemberIndex;


    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="team_index")
    private TeamDomain teamDomain;

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="member_index")
    private MemberDomain memberDomain;



}
