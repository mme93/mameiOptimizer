package de.mameie.backend.rest.model;

import de.mameie.backend.rest.model.dto.*;
import de.mameie.backend.rest.model.entity.*;
import org.springframework.core.convert.converter.Converter;

import java.util.ArrayList;
import java.util.List;

public class ModelConverter {
    //Task
    public static Converter<List<MainTaskDto>, List<MainTaskEntity>> mainTaskDtoListToEntityList() {
        return mainTaskDtoList -> {
            List<MainTaskEntity> mainTaskEntityList = new ArrayList<>();
            for (MainTaskDto mainTaskDto : mainTaskDtoList) {
                mainTaskEntityList.add(mainTaskDtoConvertToEntity().convert(mainTaskDto));
            }
            return mainTaskEntityList;
        };
    }

    public static Converter<List<MainTaskEntity>, List<MainTaskDto>> mainTaskEntityListToDtoList() {
        return taskEntityList -> {
            List<MainTaskDto> mainTaskDtoList = new ArrayList<>();
            for (MainTaskEntity mainTaskEntity : taskEntityList) {
                mainTaskDtoList.add(mainTaskEntityConvertToDto().convert(mainTaskEntity));
            }
            return mainTaskDtoList;
        };
    }

    public static Converter<MainTaskEntity, MainTaskDto> mainTaskEntityConvertToDto() {
        return mainTaskEntity -> {
            List<TaskDto> taskDtoList = new ArrayList<>();
            for (TaskEntity taskEntity : mainTaskEntity.getTaskEntityList()) {
                taskDtoList.add(new TaskDto(taskEntity.getTask()));
            }
            return new MainTaskDto(mainTaskEntity.getTitle(), mainTaskEntity.getUsername(), taskDtoList);
        };
    }

    public static Converter<MainTaskDto, MainTaskEntity> mainTaskDtoConvertToEntity() {
        return mainTaskDto -> {
            List<TaskEntity> taskEntityList = new ArrayList<>();
            for (TaskDto taskDto : mainTaskDto.getTaskDtoList()) {
                taskEntityList.add(new TaskEntity(taskDto.getTask()));
            }
            return new MainTaskEntity(mainTaskDto.getTitle(), mainTaskDto.getUsername(), taskEntityList);
        };
    }

    //Component//
    public static Converter<ComponentEntity, ComponentDto> componentEntityConvertToDto() {
        return componentEntity -> new ComponentDto(componentEntity.getName(), componentEntity.getDescription(), componentEntity.getHref(), componentEntity.getIconName(), componentEntity.isPermission());
    }

    public static Converter<ComponentDto, ComponentEntity> componentDtoConvertToEntity() {
        return componentDto -> new ComponentEntity(componentDto.getName(), componentDto.getDescription(), componentDto.getHref(), componentDto.getIconName(), componentDto.isPermission());
    }

    //Customer//
    public static Converter<CustomerEntity, CustomerDto> customerEntityConvertToDto() {
        return customerEntity -> new CustomerDto(customerEntity.isPrivate(), customerEntity.getFirstName(), customerEntity.getLastName(), customerEntity.getAddress(), customerEntity.getCompany(), customerEntity.getSign(), customerEntity.getEmail(), customerEntity.getCallNumber(), customerEntity.getInfo());
    }

    public static Converter<CustomerDto, CustomerEntity> customerDtoConvertToEntity() {
        return customerDto -> new CustomerEntity(customerDto.isPrivate(), customerDto.getFirstName(), customerDto.getLastName(), customerDto.getEmail(), customerDto.getCompany(), customerDto.getSign(), customerDto.getCallNumber(), customerDto.getInfo(), customerDto.getAddress());
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
