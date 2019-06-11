package com.fancy.dao;

import java.util.List;

import com.fancy.entity.Cinema;


public interface CinemaDao {
	public boolean addCinema(Cinema cinema);//增加影院，参数为影院实体，返回布尔变量
	public boolean delCinema(int cId);//删除影院，参数为影院id，返回布尔变量
	public boolean updateCinema(Cinema cinema);//更新影院，参数为影院实体，返回布尔变量
	public List<Cinema> queryAllCinema();//显示所有影院
	public Cinema queryCinemaById(int cId);//查询影院，参数为影院id，返回影院实体
       
	public List<Cinema> queryCinemaByCinemaName(String cName);//显示一个影院名的所有影院
	public List<Cinema> queryCinemaByCinemaAddress(String cAddress);////显示一个影院地址的所有影院
	public List<Cinema> queryCinemaByCinemaNameAndCinemaAddress(String cName,String cAddress);//显示一个影院地址和影院名的所有影院
	public Cinema queryCinema(Cinema cinema);//查询影院，参数为影院实体，返回电影实体
}
