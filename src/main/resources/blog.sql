DROP DATABASE IF EXISTS blog;
CREATE DATABASE blog;

DROP TABLE IF EXISTS biz_article;
CREATE TABLE `biz_article` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) unsigned NOT NULL,
  `cover_image` varchar(255) DEFAULT NULL,
  `qrcode_path` varchar(255) DEFAULT NULL,
  `is_markdown` tinyint(1) unsigned DEFAULT '1',
  `content` longtext,
  `content_md` longtext,
  `top` tinyint(1) DEFAULT '0',
  `type_id` bigint(20) unsigned NOT NULL,
  `status` tinyint(1) unsigned DEFAULT NULL,
  `recommended` tinyint(1) unsigned DEFAULT '0',
  `original` tinyint(1) unsigned DEFAULT '1',
  `description` varchar(300) DEFAULT NULL,
  `keywords` varchar(200) DEFAULT NULL,
  `comment` tinyint(1) unsigned DEFAULT '1',
  `create_time` datetime DEFAULT CURRENT_TIMESTAMP,
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT

INSERT INTO biz_article (title, user_id, cover_image, qrcode_path, is_markdown, content, content_md, top, type_id, status, recommended, original, description, keywords, comment, create_time, update_time) VALUES ('ZBlog简介', 1, '', null, true, '<h1 id="dblog-">ZBlog简介</h1>
<p>ZBlog是一款简洁美观、自适应的Java博客系统。系统使用SSH框架实现，前端使用Bootstrap。支持移动端自适应，配有完备的前台和后台管理功能。</p>
<h3 id="-">开发环境</h3>
<table>
<thead>
<tr>
<th>工具</th>
<th>版本或描述</th>
</tr>
</thead>
<tbody>
<tr>
<td>OS</td>
<td>Windows 7</td>
</tr>
<tr>
<td>JDK</td>
<td>1.7+</td>
</tr>
<tr>
<td>IDE</td>
<td>STS 3.6.3</td>
</tr>
<tr>
<td>Maven</td>
<td>3.0.4</td>
</tr>
<tr>
<td>MySQL</td>
<td>5.7</td>
</tr>
</tbody>
</table>
', '', false, 3, true, false, true, 'ZBlog是一款简洁美观、自适应的Java博客系统。系统使用SSH框架实现，前端使用Bootstrap。', 'ZBlog,开源博客', true, '2018-06-13 09:20:19', '2018-06-13 09:20:19');
INSERT INTO biz_article (title, user_id, cover_image, qrcode_path, is_markdown, content, content_md, top, type_id, status, recommended, original, description, keywords, comment, create_time, update_time) VALUES ('ZBlog简介', 1, '', null, true, '<h1 id="dblog-">ZBlog简介</h1>
<p>ZBlog是一款简洁美观、自适应的Java博客系统。系统使用SSH框架实现，前端使用Bootstrap。支持移动端自适应，配有完备的前台和后台管理功能。</p>
<h3 id="-">开发环境</h3>
<table>
<thead>
<tr>
<th>工具</th>
<th>版本或描述</th>
</tr>
</thead>
<tbody>
<tr>
<td>OS</td>
<td>Windows 7</td>
</tr>
<tr>
<td>JDK</td>
<td>1.7+</td>
</tr>
<tr>
<td>IDE</td>
<td>STS 3.6.3</td>
</tr>
<tr>
<td>Maven</td>
<td>3.0.4</td>
</tr>
<tr>
<td>MySQL</td>
<td>5.7</td>
</tr>
</tbody>
</table>
', '', false, 3, true, false, true, 'ZBlog是一款简洁美观、自适应的Java博客系统。系统使用SSH框架实现，前端使用Bootstrap。', 'ZBlog,开源博客', false, '2018-06-13 09:21:28', '2018-06-13 09:21:28');
