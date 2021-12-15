package de.mameie.backend.rest.controller;

import de.mameie.backend.rest.exception.MemberException;
import de.mameie.backend.rest.model.ModelConverter;
import de.mameie.backend.rest.model.dto.MemberDto;
import de.mameie.backend.rest.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {


    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("")
    public List<MemberDto>getAll(){
        return ModelConverter.memberEntityListConvertToDtoList().convert(memberService.getEntities());
    }

    @GetMapping("/{username}")
    public MemberDto getById(@PathVariable("username") String username){
        return ModelConverter.memberEntityConvertToDto().convert(memberService.getEntityByUsername(username));
    }

    @PostMapping("/save")
    public void post(@RequestBody MemberDto memberDto){
        if(!memberService.memberEntityExist(ModelConverter.memberDtoConvertToEntity().convert(memberDto))){
            memberService.save(ModelConverter.memberDtoConvertToEntity().convert(memberDto));
        }else{
            throw new MemberException("Member allready exist!");
        }
    }
    @PostMapping("/update")
    public void update(@RequestBody MemberDto memberDto){
        memberService.save(ModelConverter.memberDtoConvertToEntity().convert(memberDto));
    }

}
