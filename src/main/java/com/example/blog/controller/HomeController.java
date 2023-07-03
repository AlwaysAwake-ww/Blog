package com.example.blog.controller;


import com.example.blog.dto.MemberDetail;
import com.example.blog.repository.MemberRepository;
import com.example.blog.service.MemberDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.text.html.Option;
import java.util.Optional;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final MemberRepository memberRepository;
    private final MemberDetailService memberDetailService;

    @GetMapping("/")
    public ModelAndView goHome(){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("redirect:login");
        return modelAndView;
    }

    @GetMapping("/user/home")
    public ModelAndView main(Authentication authentication, @AuthenticationPrincipal MemberDetail memberDetail, ModelAndView model){

        model.addObject("member",memberDetailService.getMember(memberDetail.getUsername()));
        model.setViewName("home");
        return model;
    }
}
