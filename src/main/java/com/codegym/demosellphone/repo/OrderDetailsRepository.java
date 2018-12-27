package com.codegym.demosellphone.repo;

import com.codegym.demosellphone.model.OrderDetails;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OrderDetailsRepository extends PagingAndSortingRepository<OrderDetails, Integer> {
}
