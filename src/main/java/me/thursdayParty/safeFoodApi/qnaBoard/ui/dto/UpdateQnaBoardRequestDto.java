package me.thursdayParty.safeFoodApi.qnaBoard.ui.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateQnaBoardRequestDto {
	private String title;
	private String content;
}
