package com.supportticket.repository;

import com.supportticket.model.TicketDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketDetailsRepository extends JpaRepository<TicketDetails, Integer> {


}
