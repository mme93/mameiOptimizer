package de.mameie.backend.rest.model;

import de.mameie.backend.rest.model.dto.ComponentDto;
import de.mameie.backend.rest.model.dto.CustomerDto;
import de.mameie.backend.rest.model.dto.MemberDto;
import de.mameie.backend.rest.model.entity.ComponentEntity;
import de.mameie.backend.rest.model.entity.CustomerEntity;
import de.mameie.backend.rest.model.entity.MemberEntity;
import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.List;

public class ModelConverter {
    //Component//
    public static Converter<ComponentEntity, ComponentDto>componentEntityConvertToDto(){
        return componentEntity -> new ComponentDto(componentEntity.getName(),componentEntity.getDescription());
    }
    public static Converter<ComponentDto,ComponentEntity>componentDtoConvertToEntity(){
        return componentDto -> new ComponentEntity(componentDto.getName(),componentDto.getDescription());
    }
    //Customer//
    public static Converter<CustomerEntity, CustomerDto> customerEntityConvertToDto() {
        return customerEntity -> new CustomerDto(customerEntity.getFirstName(), customerEntity.getLastName(), customerEntity.getEmail(), customerEntity.getCompany(), customerEntity.getSign());
    }

    public static Converter<CustomerDto, CustomerEntity> customerDtoConvertToEntity() {
        return customerDto -> new CustomerEntity(customerDto.getFirstName(), customerDto.getLastName(), customerDto.getEmail(), customerDto.getCompany(), customerDto.getSign());
    }
    //Member//

    public static Converter<MemberDto, MemberEntity> memberDtoConvertToEntity() {
        return memberDto -> new MemberEntity(memberDto.getFirstName(), memberDto.getLastName(), memberDto.getEmail(), memberDto.getPassword(), memberDto.getUsername(), memberDto.getPermission());
    }

    public static Converter<MemberEntity, MemberDto> memberEntityConvertToDto() {
        return memberEntity1 -> new MemberDto(memberEntity1.getFirstName(), memberEntity1.getLastName(), memberEntity1.getEmail(), memberEntity1.getPassword(), memberEntity1.getUsername(), memberEntity1.getPermission());
    }

    public static Converter<List<MemberDto>, List<MemberEntity>> memberDtoListConertToEntityList() {
        return memberDtoList -> {
            List<MemberEntity> memberEntityList = new ArrayList<>();
            for (MemberDto memberDto : memberDtoList) {
                memberEntityList.add(new MemberEntity(memberDto.getFirstName(), memberDto.getLastName(), memberDto.getEmail(), memberDto.getPassword(), memberDto.getUsername(), memberDto.getPermission()));
            }
            return memberEntityList;
        };
    }

    public static Converter<List<MemberEntity>, List<MemberDto>> memberEntityListConvertToDtoList() {
        return memberEntityList -> {
            List<MemberDto> memberDtoList = new ArrayList<>();
            for (MemberEntity memberEntity : memberEntityList) {
                memberDtoList.add(new MemberDto(memberEntity.getFirstName(), memberEntity.getLastName(), memberEntity.getEmail(), memberEntity.getPassword(), memberEntity.getUsername(), memberEntity.getPermission()));
            }
            return memberDtoList;
        };
    }
}
