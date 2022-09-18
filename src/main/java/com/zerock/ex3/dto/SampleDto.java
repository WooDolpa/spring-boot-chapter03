package com.zerock.ex3.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * packageName : com.zerock.ex3.dto
 * className : SampleDto
 * user : jwlee
 * date : 2022/09/17
 */
@Data
@Builder(toBuilder = true)
public class SampleDto {

    private Long sno;
    private String first;
    private String last;
    private LocalDateTime regTime;
}
