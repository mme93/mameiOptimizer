package de.mameie.backend.rest.service;

import de.mameie.backend.rest.model.entity.MemberEntity;
import de.mameie.backend.rest.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void save(MemberEntity memberEntity){
        memberRepository.save(memberEntity);
    }
    public List<MemberEntity> getEntities(){
        return memberRepository.findAll();
    }
    public MemberEntity getEntityByUsername(String username){
        Optional<MemberEntity>memberEntity=memberRepository.findByUsername(username);
        if(memberEntity.isPresent()){
            return memberEntity.get();
        }
        throw new RuntimeException("Not found");
    }
}
