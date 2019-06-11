package com.fancy.dao;

import java.util.List;
import com.fancy.service.SessionService;
import com.fancy.entity.Session;
import com.fancy.dao.impl.SessionDaoImpl;

public interface SessionDao {
	public boolean addSession(Session session );//增加场次
	public boolean delSession(int sId);//删除场次
	public boolean updateSession(Session session);//更新场次
	public List<Session> queryAllSession();//显示所有场次
	public Session querySessionById(int sId);//搜索场次id,返回场次实体
        public List<Session> querySessionByMid(int mId);//显示所有电影的场次
	public List<Session> querySessionByHid(int hId);//显示所有放映厅的场次
	public List<Session> querySessionByCid(int cId);//
	public Session querySession(Session session);   //查询场次，返回场次
	public List<Session> querySessionBycIdandmId(int cId,int mId);//显示一个影院的一个电影的场次
        public List<Session> queryLowestpriceSessionByCid(int cId);
}
