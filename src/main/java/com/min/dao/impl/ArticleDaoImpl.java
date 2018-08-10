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
	public List<BizArticle> list() {//criteria��ѯ
		@SuppressWarnings("unchecked")
		List<BizArticle> listProduct = (List<BizArticle>) sessionFactory
				.getCurrentSession().createCriteria(BizArticle.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listProduct;
	}
	
	@Override
	public List<BizArticle> loadSQL() {//ԭ��sql��ѯ
		String sql = "select * from biz_article";
		@SuppressWarnings("unchecked")
		List<BizArticle> list = sessionFactory.getCurrentSession()
			.createSQLQuery(sql).addEntity(BizArticle.class).list();
		return list;
	}
	
	@Override
	public List<BizArticle> loadHQL() {//HQL��ѯ
		String sql = "select * from biz_article";
		@SuppressWarnings("unchecked")
		List<BizArticle> list = sessionFactory.getCurrentSession()
			.createQuery(sql).list();
		return list;	
	}

	@Override
	public BizArticle loadSession(Long id) {//session��ʽ��������
		return (BizArticle)sessionFactory.getCurrentSession().load(BizArticle.class, id);
	}

	@Override
	public void saveSession(BizArticle object) {//session��ʽ��������
		sessionFactory.getCurrentSession().save(object);
	}

	@Override
	public void updateSession(BizArticle object) {//session��ʽ��������
		sessionFactory.getCurrentSession().update(object);
	}

	@Override
	public void deleteSession(BizArticle object) {//session��ʽɾ������
		sessionFactory.getCurrentSession().delete(object);
	}

	@Override
	public BizArticle loadTemplate(Long id) {//HibernateTemplate��ʽ��ȡ����
		return template.load(BizArticle.class, id);
	}

	@Override
	public void saveTemplate(BizArticle object) {//HibernateTemplate��ʽ��������
		template.save(object);
	}

	@Override
	public void updateTemplate(BizArticle object) {//HibernateTemplate��ʽ��������
		template.update(object);
	}

	@Override
	public void deleteTemplate(BizArticle object) {//HibernateTemplate��ʽɾ������
		template.delete(object);
	}
}
