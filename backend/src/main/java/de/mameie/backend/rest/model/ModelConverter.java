package de.mameie.backend.rest.model;

import de.mameie.backend.rest.model.dto.CustomerDto;
import de.mameie.backend.rest.model.dto.MemberDto;
import de.mameie.backend.rest.model.entity.CustomerEntity;
import de.mameie.backend.rest.model.entity.MemberEntity;
import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.List;

public class ModelConverter {

    //Customer//
    public static Converter<CustomerEntity, CustomerDto> customerEntityToCustomerDto() {
        return customerEntity -> new CustomerDto(customerEntity.getFirstName(), customerEntity.getLastName(), customerEntity.getEmail(), customerEntity.getCompany(), customerEntity.getSign());
    }

    public static Converter<CustomerDto, CustomerEntity> customerDtoToCustomerEntity() {
        return customerDto -> new CustomerEntity(customerDto.getFirstName(), customerDto.getLastName(), customerDto.getEmail(), customerDto.getCompany(), customerDto.getSign());
    }
    //Member//

    public static Converter<MemberDto, MemberEntity> memberDtoToMemberEntity() {
        return memberDto -> new MemberEntity(memberDto.getFirstName(), memberDto.getLastName(), memberDto.getEmail(), memberDto.getPassword(), memberDto.getUsername(), memberDto.getPermission());
    }

    public static Converter<MemberEntity, MemberDto> memberEntityToMemberDto() {
        return memberEntity1 -> new MemberDto(memberEntity1.getFirstName(), memberEntity1.getLastName(), memberEntity1.getEmail(), memberEntity1.getPassword(), memberEntity1.getUsername(), memberEntity1.getPermission());
    }

    public static Converter<List<MemberDto>, List<MemberEntity>> memberDtoToMemberEntityList() {
        return memberDtoList -> {
            List<MemberEntity> memberEntityList = new ArrayList<>();
            for (MemberDto memberDto : memberDtoList) {
                memberEntityList.add(new MemberEntity(memberDto.getFirstName(), memberDto.getLastName(), memberDto.getEmail(), memberDto.getPassword(), memberDto.getUsername(), memberDto.getPermission()));
            }
            return memberEntityList;
        };
    }

    public static Converter<List<MemberEntity>, List<MemberDto>> memberEntityToMemberDtoList() {
        return memberEntityList -> {
            List<MemberDto> memberDtoList = new ArrayList<>();
            for (MemberEntity memberEntity : memberEntityList) {
                memberDtoList.add(new MemberDto(memberEntity.getFirstName(), memberEntity.getLastName(), memberEntity.getEmail(), memberEntity.getPassword(), memberEntity.getUsername(), memberEntity.getPermission()));
            }
            return memberDtoList;
        };
    }
}
