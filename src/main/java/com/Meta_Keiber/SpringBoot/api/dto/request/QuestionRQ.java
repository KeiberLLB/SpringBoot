package com.Meta_Keiber.SpringBoot.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class QuestionRQ {
  @NotBlank(message = "Text question is required")
  private String text;
  @NotBlank(message = "Type question is required")
  private String type;
  private boolean active;
  @NotBlank(message = "Survey id is required")
  private int survey_id;
  
}
