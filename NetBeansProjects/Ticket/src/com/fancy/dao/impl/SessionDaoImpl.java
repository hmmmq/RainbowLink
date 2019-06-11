package com.fancy.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.fancy.dao.SessionDao;
import com.fancy.entity.Movie;
import com.fancy.service.SessionService;
import com.fancy.entity.Session;
//import com.zyp.entity.User;

public class SessionDaoImpl extends BaseDao implements SessionDao  {

	@Override
	public boolean addSession(Session session) {
		// TODO Auto-generated method stub
		if(session==null) {
			System.out.println("error");
		}
		String sql="insert into session(hId,cId,mId,beginTime,price,remain) values (?,?,?,?,?,?)";
		List<Object> params1 = new ArrayList<Object>();
		params1.add(session.gethId());
		params1.add(session.getcId());		
		params1.add(session.getmId());
		params1.add(session.getBeginTime());
		params1.add(session.getPrice());
		params1.add(session.getRemain());		
		return operUpdate(sql, params1);
	}

	@Override
	public boolean delSession(int sId) {
		// TODO Auto-generated method stub
		String sql="delete from session where sId="+sId;		
		return operUpdate(sql, null);
	}

	@Override
	public boolean updateSession(Session session) {
		// TODO Auto-generated method stub
		String sql="update session set hId=?,cId=?,mId=?,beginTime=?,price=?,remain=? where sId=?";
		List<Object> params1 = new ArrayList<Object>();
		params1.add(session.gethId());
		params1.add(session.getcId());
		params1.add(session.getmId());
		params1.add(session.getBeginTime());
		params1.add(session.getPrice());
		params1.add(session.getRemain());
		params1.add(session.getsId());
		return operUpdate(sql, params1);
		
	}

	@Override
	public List<Session> queryAllSession() {
		// TODO Auto-generated method stub
		String sql="select * from session";
		List<Session> list=null;
		try {
			list = operQuery(sql, null,Session.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Session querySessionById(int sId) {
		// TODO Auto-generated method stub
		String sql="select * from session where sId="+sId;
		List<Session> list=null;
		try {
			list = operQuery(sql,null,Session.class);			
			if(list.size() == 0){   System.out.println("error");
				return null;
			}else{
				return list.get(0);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Session> querySessionByMid(int mId) {
		// TODO Auto-generated method stub
		String sql="select * from session where mId="+mId;
		
		List<Session> list=null;
		try {
			list = operQuery(sql, null,Session.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Session> querySessionByHid(int hId) {
		// TODO Auto-generated method stub
     String sql="select * from session where hId="+hId;
		
		List<Session> list=null;
		try {
			list = operQuery(sql, null,Session.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Session querySession(Session session) {
		// TODO Auto-generated method stub
		 String sql="select * from session where hId=? and cId=? and mId=? and beginTime=? and price=? and remain=?";
			List<Object> params = new ArrayList<Object>();
			params.add(session.gethId());
			params.add(session.getcId());
			params.add(session.getmId());
			params.add(session.getBeginTime());
			params.add(session.getPrice());
			params.add(session.getRemain());
			List<Session> list=null;
			try {
				list = operQuery(sql,params,Session.class);			
				if(list.size() == 0){
					return null;
				}else{
					return list.get(0);
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		
	}

	@Override
	public List<Session> querySessionBycIdandmId(int cId, int mId) {
		// TODO Auto-generated method stub
		String sql="select * from session where cId ="+cId+" and mId="+mId;
	 
		List<Session> list=null;
		try {
			list = operQuery(sql, null,Session.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<Session> querySessionByCid(int cId) {
		// TODO Auto-generated method stub
		String sql="select * from session where cId ="+cId;

		List<Session> list=null;
		try {
			list = operQuery(sql, null,Session.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
                           System.out.println("error");
			e.printStackTrace();
		}
		return list;
	}
//
//            @Override
//            public List<Session> queryLowestpriceSessionByCid(int cId) {
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        int cid=cId;
//          String sql="select * from  session  where  pirece=(select  min(price) from session where cId ="+cid;//需要更改。
//              List<Session> list=null;
//		try {
//                    System.out.println("error");
//			list = operQuery(sql,null,Session.class);			
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//                     
//			e.printStackTrace();
//		}
//		return list;
//    }

         @Override
           public List<Session> queryLowestpriceSessionByCid(int cId) {
       
         String sql="select * from  session  where  price=(select  min(price) from session where cId ="+cId+")";//需要更改。
              List<Session> list=null;
		try {
                    
			list = operQuery(sql,null,Session.class);			
			
		} catch (Exception e) {
             // TODO Auto-generated catch block
                         System.out.println("errorq");
		}
		return list;
       
    }

}
