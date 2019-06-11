package com.fancy.dao;

import java.util.List;

import com.fancy.entity.Hall;

public interface HallDao {
	public boolean addHall(Hall hall);//增加影厅接口
	public boolean delHall(int hId);//删除影厅接口
	public boolean updateHall(Hall hall);//更新影厅接口
	public List<Hall> queryAllHall();//显示所有影厅的接口
	public Hall queryHallById(int hId);//显示搜索影厅id的影厅接口
	public List<Hall> queryAllHallcId(int cId);//显示搜索影厅cid的接口？？
	public Hall queryHall(Hall hall);//查询影厅，参数为影厅
}
