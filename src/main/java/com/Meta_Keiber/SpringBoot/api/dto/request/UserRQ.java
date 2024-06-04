package com.Meta_Keiber.SpringBoot.api.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRQ {
  @NotBlank(message = "The name is required.")
  private String name;
  @NotBlank(message = "Email is required")
  @Email
  private String email;
  @NotBlank(message = "Password is required")
  private String password;
  private boolean active;
}
