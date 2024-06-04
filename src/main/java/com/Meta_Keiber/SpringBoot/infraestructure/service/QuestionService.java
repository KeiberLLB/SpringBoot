package com.Meta_Keiber.SpringBoot.infraestructure.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Meta_Keiber.SpringBoot.api.dto.request.QuestionRQ;
import com.Meta_Keiber.SpringBoot.api.dto.response.basic_response.QuestionBasicRS;
import com.Meta_Keiber.SpringBoot.domian.repository.QuestionRepository;
import com.Meta_Keiber.SpringBoot.infraestructure.abstract_services.IQuestionService;
import com.Meta_Keiber.SpringBoot.utils.enums.SortType;

import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class QuestionService implements IQuestionService {

  @Autowired
  private QuestionRepository questionRepository;

  @Override
  public QuestionBasicRS create(QuestionRQ request) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'create'");
  }

  @Override
  public QuestionBasicRS get(Integer id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'get'");
  }

  @Override
  public QuestionBasicRS update(QuestionRQ request, Integer id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'update'");
  }

  @Override
  public void delete(Integer id) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'delete'");
  }

  @Override
  public Page<QuestionBasicRS> getAll(int page, int size, SortType sortType) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getAll'");
  }

}
