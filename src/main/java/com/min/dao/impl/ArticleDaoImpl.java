package com.min.dao.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.min.dao.ArticleDao;
import com.min.model.BizArticle;

@Repository
public class ArticleDaoImpl implements ArticleDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<BizArticle> list() {
		@SuppressWarnings("unchecked")
		List<BizArticle> listProduct = (List<BizArticle>) sessionFactory
				.getCurrentSession().createCriteria(BizArticle.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listProduct;
	}
	
	@Transactional
	public List<BizArticle> loadSQL() {
		String sql = "select * from BizArticle";
		List<BizArticle> list = sessionFactory.getCurrentSession().createSQLQuery(sql).addEntity(BizArticle.class).list();
		return list;
	}
	
	@Transactional
	public List<BizArticle> loadHQL() {
		return null;	
	}
}
