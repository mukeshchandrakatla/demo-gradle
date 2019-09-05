package com.mukesh.practise.dao;

import com.mukesh.practise.model.UsersModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersDaoInterface extends JpaRepository<UsersModel,Integer>{
}
