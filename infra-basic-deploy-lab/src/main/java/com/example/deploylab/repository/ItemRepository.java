// src/main/java/com/example/deploylab/repository/ItemRepository.java

package com.example.deploylab.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.deploylab.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {}