package com.Meta_Keiber.SpringBoot.domian.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionQuestion extends JpaRepository<OptionQuestion, Integer> {

}
