package com.example.blog.repository;

import com.example.blog.domain.ImageDomain;
import com.example.blog.domain.PostDomain;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ImageRepository extends JpaRepository<ImageDomain, Long> {


    @Transactional
    ImageDomain save(ImageDomain imageDomain);

    @Transactional
    Optional<List<ImageDomain>> findByPostDomain(PostDomain postDomain);

    @Transactional
    Optional<ImageDomain> findByPostDomainAndNewName(PostDomain postDomain,String imageName);

    @Transactional
    void deleteAllByPostDomain(PostDomain postDomain);
}
