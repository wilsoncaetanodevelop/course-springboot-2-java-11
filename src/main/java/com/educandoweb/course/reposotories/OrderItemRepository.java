package com.educandoweb.course.reposotories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.orderItem;

public interface OrderItemRepository extends JpaRepository<orderItem, Long> {

}
