package com.min.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.min.dao.ArticleDao;
import com.min.model.BizArticle;

@Repository
public class ArticleDaoImpl implements ArticleDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private HibernateTemplate template;
	
	@Override
	public List<BizArticle> list() {//criteria查询
		@SuppressWarnings("unchecked")
		List<BizArticle> listProduct = (List<BizArticle>) sessionFactory
				.getCurrentSession().createCriteria(BizArticle.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listProduct;
	}
	
	@Override
	public List<BizArticle> loadSQL() {//原生sql查询
		String sql = "select * from biz_article";
		@SuppressWarnings("unchecked")
		List<BizArticle> list = sessionFactory.getCurrentSession()
			.createSQLQuery(sql).addEntity(BizArticle.class).list();
		return list;
	}
	
	@Override
	public List<BizArticle> loadHQL() {//HQL查询
		String sql = "select * from biz_article";
		@SuppressWarnings("unchecked")
		List<BizArticle> list = sessionFactory.getCurrentSession()
			.createQuery(sql).list();
		return list;	
	}

	@Override
	public BizArticle loadSession(Long id) {//session方式加载数据
		return (BizArticle)sessionFactory.getCurrentSession().load(BizArticle.class, id);
	}

	@Override
	public void saveSession(BizArticle object) {//session方式保存数据
		sessionFactory.getCurrentSession().save(object);
	}

	@Override
	public void updateSession(BizArticle object) {//session方式更新数据
		sessionFactory.getCurrentSession().update(object);
	}

	@Override
	public void deleteSession(BizArticle object) {//session方式删除数据
		sessionFactory.getCurrentSession().delete(object);
	}

	@Override
	public BizArticle loadTemplate(Long id) {//HibernateTemplate方式读取数据
		return template.load(BizArticle.class, id);
	}

	@Override
	public void saveTemplate(BizArticle object) {//HibernateTemplate方式保存数据
		template.save(object);
	}

	@Override
	public void updateTemplate(BizArticle object) {//HibernateTemplate方式更新数据
		template.update(object);
	}

	@Override
	public void deleteTemplate(BizArticle object) {//HibernateTemplate方式删除数据
		template.delete(object);
	}
}
