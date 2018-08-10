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
	public void updateSession(Long id) {//����������ʽ���񣬲���Ҫ�ֶ��ύ����
		BizArticle article = articleDao.loadSession(id);
		article.setUpdateTime(new Date());
		articleDao.updateSession(article);
		
		BizArticle newArticle = new BizArticle();
		newArticle.setTitle("������");
		newArticle.setDescription("��������ѧ����Matthiola incana (L.) R. Br.����ʮ�ֻ��ơ�����������������������ݱ���");
		newArticle.setCreateTime(new Date());
		articleDao.saveSession(newArticle);
	}

	@Override
	public void updateTemplate(Long id) {//����������ʽ���񣬲���Ҫ�ֶ��ύ����
		BizArticle article = articleDao.loadTemplate(id);
		article.setUpdateTime(new Date());
		articleDao.updateTemplate(article);
		
		BizArticle newArticle = new BizArticle();
		newArticle.setTitle("����");
		newArticle.setDescription("���ܣ�ѧ����Epipremnum aureum������������Ҷ��ֲ����ͳ����ٱ����������ȴ�����������Ԯ���������ֵ���ʯ�������ϣ��������ǿ�������������ˮ����ֲ��");
		newArticle.setCreateTime(new Date());
		articleDao.saveTemplate(newArticle);
	}

}
