## 码农社区

## 资料
[Spring 文档](https://spring.io/guides)
[Spring Web](https://spring.io/guides/gs/serving-web-content/)
[es 社区](https://elasticsearch.cn/explore)
[Github deploy key](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)
[Bootstrap 文档](https://v3.bootcss.com/getting-started/)
[Github OAuth](https://developer.github.com/apps/building-github-apps/creating-a-github-app/)

## 工具
[Git](https://git-scm.com/download)
[Visual Paradigm](https://www.visual-paradigm.com) 
[flyway](https://flywaydb.org/getstarted/firststeps/maven)
## 脚本
```sql
create table USER
(
    ID           INT auto_increment,
    ACCOUNT_ID   VARCHAR(100),
    NAME         VARCHAR(50),
    TOKEN        CHAR(36),
    GMT_CREATE   BIGINT,
    GMT_MODIFIED BIGINT,
    constraint USER_PK
        primary key (ID)
);
```
```bash
mvn flyway:migrate
```