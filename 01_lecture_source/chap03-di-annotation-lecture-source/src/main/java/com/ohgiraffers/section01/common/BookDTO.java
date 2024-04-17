package com.ohgiraffers.section01.common;

import lombok.*;

import java.util.Date;

// 권장 x, 라이브러리를 사용할 수 있다.
// 관리가 편리함
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class BookDTO {

    private int sequence;
    private int isbn;
    private String title;
    private String author;
    private String publisher;
    private Date createdDate;
}
