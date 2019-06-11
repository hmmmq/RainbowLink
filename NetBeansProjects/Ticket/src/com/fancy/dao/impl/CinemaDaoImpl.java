package com.fancy.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.fancy.dao.CinemaDao;
import com.fancy.entity.Cinema;
import com.fancy.entity.Movie;
import com.fancy.entity.User;

public class CinemaDaoImpl extends BaseDao implements CinemaDao {

	@Override
	public boolean addCinema(Cinema cinema) {
		if (cinema == null) {
			System.out.println("are you kiding me?");
			return false;
		}
		String sql="insert into cinema (cname,caddress) values(?,?)";
		List<Object> params1 = new ArrayList<Object>();/*装了对象的list表，表里面装的是是该对象的全部信息*/
		params1.add(cinema.getCname()); /*  增加电影名       */
		params1.add(cinema.getCaddress());//增加电影地址
		return operUpdate(sql, params1);//执行sql语句，将值传到数据库里。
	}

	@Override
	public boolean delCinema(int cId) {//没有要插入的值，所以表单为null值
		// TODO Auto-generated method stub
		String sql = "delete from cinema where cId=" + cId;
		return operUpdate(sql, null);//执行sql语句，将数据库里指定的数据删掉。
	}
   //根据id更新
	@Override
	public boolean updateCinema(Cinema cinema) {
		// TODO Auto-generated method stub
		String sql = "update cinema set cname=?,caddress=? where cId=?";
		List<Object> params1 = new ArrayList<Object>();/*装了对象的list表，表里面装的是是该对象的全部信息*/
		params1.add(cinema.getCname());
		params1.add(cinema.getCaddress());
		params1.add(cinema.getCid());
		return operUpdate(sql,params1);
	}

	@Override
	public List<Cinema> queryAllCinema() {
		// TODO Auto-generated method stub
		String sql = "select * from cinema";
		List<Cinema> list=null;
		try {
			list = operQuery(sql, null, Cinema.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

        @Override
	public Cinema queryCinemaById(int cId) {
		// TODO Auto-generated method stub
		String sql ="select * from cinema where cId="+cId;
		
		List<Cinema> list=null;
		
		try {
			list = operQuery(sql, null,Cinema.class);
			if (list.size() == 0) {
                            System.out.println("com.zyp.dao.impl.CinemaDaoImpl.queryCinemaById()");
				return null;
			} else {
				return list.get(0);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

        
        
        
        
	

	@Override
	public List<Cinema> queryCinemaByCinemaName(String cName) {
		// TODO Auto-generated method stub
		String name="'%";
		for(int i = 0; i < cName.length(); i++) {
			name += cName.charAt(i)+"%";
		}
		name+="'";
		String sql="select * from cinema where cName like"+name;
		List<Cinema> list=null;
		try {
			list = operQuery(sql,null,Cinema.class);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public List<Cinema> queryCinemaByCinemaAddress(String cAddress) {
		// TODO Auto-generated method stub
		String address="'%";
		for(int i = 0; i < cAddress.length(); i++) {
			address += cAddress.charAt(i)+"%";
		}
		address+="'";
		String sql="select * from cinema where cAddress like"+address;
		List<Cinema> list=null;
		try {
			list = operQuery(sql,null,Cinema.class);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public List<Cinema> queryCinemaByCinemaNameAndCinemaAddress(String cName, String cAddress) {
		// TODO Auto-generated method stub
		String address="'%";
		for(int i = 0; i < cAddress.length(); i++) {
			address += cAddress.charAt(i)+"%";
		}
		address+="'";
		String name="'%";
		for(int i = 0; i < cName.length(); i++) {
			name += cName.charAt(i)+"%";
		}
		name+="'";
		String sql="select * from cinema where cName like"+name+"and cAddress like"+address;
		List<Cinema> list=null;
		try {
			list = operQuery(sql,null,Cinema.class);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	@Override
	public Cinema queryCinema(Cinema cinema) {
		// TODO Auto-generated method stub
		String sql = "select * from cinema where cName=? and cAddress=? ";
		List<Object> params = new ArrayList<Object>();
		params.add(cinema.getCname());
		params.add(cinema.getCaddress());
		List<Cinema> list=null;
		try {
			list = operQuery(sql,params,Cinema.class);			
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
   
}
