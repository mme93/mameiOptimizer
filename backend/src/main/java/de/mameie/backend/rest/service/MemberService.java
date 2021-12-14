package de.mameie.backend.rest.service;

import de.mameie.backend.rest.model.entity.MemberEntity;
import de.mameie.backend.rest.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    public void save(MemberEntity memberEntity){
        this.memberRepository.save(memberEntity);
    }
}
