package com.onlinebank.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.onlinebank.domain.PrimaryTransaction;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
