package com.fancy.dao;

import java.util.List;

import com.fancy.entity.Ticket;

public interface TicketDao {
    public boolean addTicket(Ticket ticket);//增加电影票，参数为电影票主体
    public boolean delTicket(int tId);//删除电影票，参数为电影票主体
    public List<Ticket> queryAllTicket();//显示所有影票
    public List<Ticket> queryAllTicketsId(int sId);//显示所有该场次的影票信息
    public List<Ticket> queryAllTicketuId(int uId);//显示所有已售的影票
}
