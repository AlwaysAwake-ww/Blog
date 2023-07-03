package com.example.blog.service;


import com.example.blog.domain.ImageDomain;
import com.example.blog.domain.PostDomain;
import com.example.blog.repository.ImageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ImageService {

    private final ImageRepository imageRepository;


    public void save(List<ImageDomain> imageDomainList){

        for(ImageDomain imageDomain : imageDomainList){
            imageRepository.save(imageDomain);
        }
    }

    public void deleteByPostDomain(PostDomain postDomain){
        System.out.println("## delete by postDomain called ");

        imageRepository.deleteAllByPostDomain(postDomain);
    }

    public List<ImageDomain> findByPostDomain(PostDomain postDomain){


        List<ImageDomain> imageDomainList = imageRepository.findByPostDomain(postDomain).get();

        return imageDomainList;
    }

    public ImageDomain findByPostDomainAndNewName(PostDomain postDomain, String imageName){

        return imageRepository.findByPostDomainAndNewName(postDomain,imageName).get();
    }

}
