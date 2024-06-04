package com.Meta_Keiber.SpringBoot.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Meta_Keiber.SpringBoot.api.dto.request.QuestionRQ;
import com.Meta_Keiber.SpringBoot.api.dto.response.basic_response.QuestionBasicRS;
import com.Meta_Keiber.SpringBoot.infraestructure.abstract_services.IQuestionService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/question")
@AllArgsConstructor
public class QuestionController {
  @Autowired
  private IQuestionService questionService;

  @Operation(summary = "Create Question", description = "TEST")
  @ApiResponse(responseCode = "400", description = "When the request is not valid", content = {
      @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class)) })
  @PostMapping
  public ResponseEntity<QuestionBasicRS> create(@Validated @RequestBody QuestionRQ request) {
    return ResponseEntity.ok(this.questionService.create(request));
  }

}
