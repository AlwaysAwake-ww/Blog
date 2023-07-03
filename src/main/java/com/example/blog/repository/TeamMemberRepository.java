package com.example.blog.repository;

import com.example.blog.domain.MemberDomain;
import com.example.blog.domain.PostDomain;
import com.example.blog.domain.TeamDomain;
import com.example.blog.domain.TeamMemberDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface TeamMemberRepository extends JpaRepository<TeamMemberDomain, Long> {


    Optional<List<TeamMemberDomain>> findByMemberDomain(MemberDomain memberDomain);

    Optional<TeamMemberDomain> findByMemberDomainAndTeamDomain(MemberDomain memberDomain, TeamDomain teamDomain);

    Optional<List<TeamMemberDomain>> findByMemberDomain_MemberIndexAndTeamDomain_TeamNameContaining(Long memberIndex, String teamName);

    Optional<List<TeamMemberDomain>> findByTeamDomain_TeamIndex(Long teamIndex);


    void deleteAllByTeamDomain_TeamIndex(Long teamIndex);



}
