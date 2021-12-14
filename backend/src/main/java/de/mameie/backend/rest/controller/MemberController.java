package de.mameie.backend.rest.controller;

import de.mameie.backend.rest.model.dto.MemberDto;
import de.mameie.backend.rest.model.entity.MemberEntity;
import de.mameie.backend.rest.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/member")
public class MemberController {


    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


    @PostMapping("/save")
    public void post(@RequestBody MemberDto memberDto){
        MemberEntity memberEntity= new MemberEntity("Markus","Meier","markus@test.de","123","mamei",1);
        memberService.save(memberEntity);
    }

}
