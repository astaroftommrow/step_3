package kr.datasolution.msa.frontend.board.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 게시물 DTO CLASS
 */
@Getter
@Setter
public class BoardDto {
    /** 게시물 ID */
    @ApiModelProperty(notes = "게시판 ID번호", example = "1")
    private int ID;

    /** 제목 */
    @ApiModelProperty(notes = "게시판 제목", example = "datasolution")
    private String TITLE;

    /** 내용 */
    @ApiModelProperty(notes = "게시판 내용", example = "would you pick up to me?")
    private String CONTENTS;

    /** 등록일시 */
    @ApiModelProperty(notes = "등록일자")
    private LocalDateTime REG_DT;

    /** 수정일시 */
    @ApiModelProperty(notes = "수정일자")
    private LocalDateTime UPD_DT;
}
