package com.example.blog.service;


import com.example.blog.domain.MemberDomain;
import com.example.blog.dto.Member;
import com.example.blog.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterService {

    private final MemberRepository memberRepository;
    public void save(MemberDomain memberDomain){
        memberRepository.save(memberDomain);
    }
}