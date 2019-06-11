package com.fancy.dao;

import java.util.List;

import com.fancy.entity.Movie;

public interface MovieDao {
	public boolean addMovie(Movie movie);//增加电影的接口
	public boolean delMovie(int mid);//删除电影的接口
	public boolean updateMovie(Movie movie);//更新电影的接口
	public List<Movie> queryAllMovie();//显示所有电影的接口
	public Movie queryMovieById(int mId);//查询Id的电影的接口
	public List<Movie> OrderMovieTen();//显示评分最高的十部电影的接口
	public List<Movie> queryMovieByType(String mType);//显示查询电影类型的电影的接口
	public List<Movie> queryMovieBymovieName(String mName);//显示查询电影名的电影的接口
	public Movie queryMovie(Movie movie);//查询电影，返回电影实体
	public List<Movie> queryMovieByTypeandName(String mType,String mName);//显示查询电影类型和电影名的电影的接口
	public Movie queryMovieByName(String mName);//查询电影名，返回电影实体
}
