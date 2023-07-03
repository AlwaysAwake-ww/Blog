package com.example.blog.repository;

import com.example.blog.domain.MemberDomain;
import com.example.blog.domain.PostDomain;
import com.example.blog.domain.TeamDomain;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<PostDomain, Long> {


    PostDomain save(PostDomain postDomain);

    Optional<PostDomain> findByPostIndex(Long id);

    Optional<PostDomain> findByMemberDomain(MemberDomain memberDomain);

    Optional<List<PostDomain>> findByTeamDomain(TeamDomain teamDomain);

}
