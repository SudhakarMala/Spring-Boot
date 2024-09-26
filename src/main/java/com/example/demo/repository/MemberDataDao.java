package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.MemberData;

@Repository
public interface MemberDataDao extends JpaRepository<MemberData, Integer> {

}
