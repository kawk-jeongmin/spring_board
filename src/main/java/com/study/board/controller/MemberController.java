package com.study.board.controller;

import com.study.board.entity.Member;
import com.study.board.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/member/join")
    public String memberJoinForm(){

        return "member/memberJoin";
    }

    @PostMapping("/member/joinPro")
    public String memberJoinPro(Member member){

        memberService.join(member);

        return "member/memberLogin";
    }

    @PostMapping("/member/login")
    public String memberLogin(Member member){

        memberService.login(member);

        return "/board/boardMain";
    }
}
