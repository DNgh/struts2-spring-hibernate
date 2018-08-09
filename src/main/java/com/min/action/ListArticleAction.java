package com.min.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.springframework.beans.factory.annotation.Autowired;

import com.min.model.BizArticle;
import com.min.service.ArticleService;
import com.opensymphony.xwork2.ActionSupport;


public class ListArticleAction extends ActionSupport {
	private static final long serialVersionUID = 7939126579870842596L;
	@Autowired
	private ArticleService articleService;
    private List<BizArticle> listArticle;
 
    public void setProductDAO(ArticleService articleService) {
        this.articleService = articleService;
    }
 
    public String execute() {
    	listArticle = articleService.list();
        return SUCCESS;
    }
 
    public List<BizArticle> getListArticle() {
        return listArticle;
    }
}
