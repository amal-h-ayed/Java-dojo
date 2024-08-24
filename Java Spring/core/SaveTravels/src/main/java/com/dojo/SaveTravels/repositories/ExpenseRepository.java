package com.dojo.SaveTravels.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.dojo.SaveTravels.models.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

