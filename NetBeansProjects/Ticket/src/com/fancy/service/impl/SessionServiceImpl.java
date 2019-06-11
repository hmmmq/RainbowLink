package com.fancy.service.impl;

import java.util.List;

import com.fancy.dao.SessionDao;
import com.fancy.dao.impl.SessionDaoImpl;
import com.fancy.entity.Session;
import com.fancy.service.SessionService;

/**
 *
 * @author hmqhmq
 */
public class SessionServiceImpl implements SessionService {
 
	private final  SessionDao sessionDao;
	public SessionServiceImpl() {
		sessionDao=new SessionDaoImpl() ;
	}
	@Override
	public int addSession(Session session) {
		// TODO Auto-generated method stub
		Session s=sessionDao.querySession(session);
		if(s==null) {
			boolean res_add=sessionDao.addSession(session);
			if(res_add) {
				return 1;//添加成功
			}else {
				return 2;//添加失败
			}
		}
		return 3;//添加失败
	}

	@Override
	public boolean delSession(int sId) {
		// TODO Auto-generated method stub
		return sessionDao.delSession(sId);
	}

	@Override
	public boolean updateSession(Session session) {
		// TODO Auto-generated method stub
		return sessionDao.updateSession(session);
	}

	@Override
	public List<Session> queryAllSession() {
		// TODO Auto-generated method stub
		return sessionDao.queryAllSession();
	}
	@Override
	public List<Session> querySessionBymId(int mId) {
		// TODO Auto-generated method stub
		return sessionDao.querySessionByMid(mId);
	}
	@Override
	public Session querySessionById(int sId) {
		// TODO Auto-generated method stub
		return sessionDao.querySessionById(sId);
	}
	@Override
	public List<Session> querySessionByHid(int hId) {
		// TODO Auto-generated method stub
		return sessionDao.querySessionByHid(hId);
	}
	@Override
	public List<Session> querySessionBycIdandmId(int cId, int mId) {
		// TODO Auto-generated method stub
		return sessionDao.querySessionBycIdandmId(cId, mId);
	}
	@Override
	public List<Session> querySessionBycId(int cId) {
		// TODO Auto-generated method stub
		return sessionDao.querySessionByCid(cId);
	}

      @Override
    public List<Session> queryLowestpriceSessionByCid(int cId) {
         return sessionDao.queryLowestpriceSessionByCid(cId);
    }}
  