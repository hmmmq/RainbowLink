package com.fancy.dao;

import java.util.List;

import com.fancy.entity.Comment;

public interface CommentDao {
   public boolean addComment(Comment comment);//增加评价，参数为评价实体，返回布尔变量
   public boolean delComment(int conId);//删除评价，参数为评价id，返回布尔变量
   public boolean updateComment(Comment comment);////更新评价，参数为评价实体，返回布尔变量
   public List<Comment> queryAllCommentByuId(int uId);//显示一个用户id的评论，参数为id
   public List<Comment> queryAllCommentBymId(int mId);//显示一个管理员的评论，参数为mid
   public Comment queryComment(Comment comment);//显示评论，参数为评论实体
}
