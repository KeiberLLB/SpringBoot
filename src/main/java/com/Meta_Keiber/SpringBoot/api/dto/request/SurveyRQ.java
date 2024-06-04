package com.Meta_Keiber.SpringBoot.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SurveyRQ {
  @NotBlank(message = "Survey title is required")
  private String title;
  @NotBlank(message = "Survey description is required")
  private String description;
  private boolean active;
  @NotNull(message = "Creator id is required")
  private int creator_id;
}
