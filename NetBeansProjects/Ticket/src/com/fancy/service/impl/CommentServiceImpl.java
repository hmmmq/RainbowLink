package com.fancy.service.impl;

import java.util.List;

import com.fancy.dao.CommentDao;
import com.fancy.dao.impl.CommentDaoImpl;
import com.fancy.entity.Comment;
import com.fancy.service.CommentService;

public class CommentServiceImpl implements CommentService{
	private CommentDao commentDao;
    public CommentServiceImpl() {
    	commentDao=new CommentDaoImpl();
    }
	@Override
	public boolean addComment(Comment comment) {
		// TODO Auto-generated method stub
		return commentDao.addComment(comment);
	}

	@Override
	public boolean delComment(int conId) {
		// TODO Auto-generated method stub
		return commentDao.delComment(conId);
	}

	@Override
	public boolean updateComment(Comment comment) {
		// TODO Auto-generated method stub
		return commentDao.updateComment(comment);
	}

	@Override
	public List<Comment> queryAllCommentByuId(int uId) {
		// TODO Auto-generated method stub
		return commentDao.queryAllCommentByuId(uId);
	}

	@Override
	public List<Comment> queryAllCommentBymId(int mId) {
		// TODO Auto-generated method stub
		return commentDao.queryAllCommentBymId(mId);
	}
	@Override
	public Comment queryComment(Comment comment) {
		// TODO Auto-generated method stub
		return commentDao.queryComment(comment);
	}

}
