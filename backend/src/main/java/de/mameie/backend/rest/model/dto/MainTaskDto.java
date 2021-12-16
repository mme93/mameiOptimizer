package de.mameie.backend.rest.model.dto;

import de.mameie.backend.rest.model.entity.MemberEntity;
import de.mameie.backend.rest.model.entity.TaskEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class MainTaskDto {
    private String title;
    private String username;
    private List<TaskDto> taskDtoList = new ArrayList<>();
}
