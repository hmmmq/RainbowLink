package com.fancy.service;


import java.util.List;

import com.fancy.entity.Ticket;

public interface TicketService {
		 
	public boolean addTicket(Ticket ticket) ;
	public boolean delTicket(int tId) ;
	public List<Ticket> queryAllTicket();
	public List<Ticket> queryAllTicketsId(int sId);	//表单
	public List<Ticket> queryAllTicketuId(int uId);
}
