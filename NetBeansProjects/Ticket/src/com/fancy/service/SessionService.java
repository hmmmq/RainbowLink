package com.fancy.service;

import java.util.List;

import com.fancy.dao.SessionDao;
import com.fancy.dao.impl.SessionDaoImpl;
import com.fancy.entity.Movie;
import com.fancy.entity.Session;


public interface SessionService {
   public int addSession(Session session);
    public boolean delSession(int sId);
    public boolean updateSession(Session session);
    public Session querySessionById(int sId);
    public List<Session> queryAllSession();
    public List<Session> querySessionBymId(int mId);
    public List<Session> querySessionByHid(int hId);
    public List<Session> querySessionBycIdandmId(int cId,int mId);
    public List<Session> querySessionBycId(int cId);
    public List<Session> queryLowestpriceSessionByCid(int cId);
}
