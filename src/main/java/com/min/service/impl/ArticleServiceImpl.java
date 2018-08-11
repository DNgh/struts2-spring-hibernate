package com.min.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.min.dao.ArticleDao;
import com.min.model.BizArticle;
import com.min.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Autowired
	private ArticleDao articleDao;
	
	@Override
	public List<BizArticle> list() {
		return articleDao.list();
	}

	@Override
	public List<BizArticle> loadSQL() {
		return articleDao.loadSQL();
	}

	@Override
	public List<BizArticle> loadHQL() {
		return articleDao.loadHQL();
	}

	@Override
	public void updateSession(Long id) {//已配置声明式事务，不需要手动提交事务
		BizArticle article = articleDao.loadSession(id);
		article.setUpdateTime(new Date());
		articleDao.updateSession(article);
		
		BizArticle newArticle = new BizArticle();
		newArticle.setTitle("紫罗兰");
		newArticle.setDescription("紫罗兰（学名：Matthiola incana (L.) R. Br.）是十字花科、紫罗兰属二年生或多年生草本。");
		newArticle.setCreateTime(new Date());
		articleDao.saveSession(newArticle);
	}

	@Override
	public void updateTemplate(Long id) {//已配置声明式事务，不需要手动提交事务
		BizArticle article = articleDao.loadTemplate(id);
		article.setUpdateTime(new Date());
		articleDao.updateTemplate(article);
		
		BizArticle newArticle = new BizArticle();
		newArticle.setTitle("绿萝");
		newArticle.setDescription("绿萝（学名：Epipremnum aureum），属于麒麟叶属植物，大型常绿藤本，生长于热带地区，常攀援生长在雨林的岩石和树干上，其缠绕性强，气根发达，可以水培种植。");
		newArticle.setCreateTime(new Date());
		articleDao.saveTemplate(newArticle);
	}

}
