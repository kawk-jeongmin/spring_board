package com.study.board.service;

import com.study.board.entity.Member;
import com.study.board.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public void join(Member member){

        memberRepository.save(member);
    }

    public void login(Member member){


    }
}
