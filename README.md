# JPA NOTE

+ [Spring Boot](http://projects.spring.io/spring-boot/)
+ [Spring Data JPA](http://projects.spring.io/spring-data-jpa/)
+ [Lombok](https://projectlombok.org/)
+ [OneToMany](https://en.wikibooks.org/wiki/Java_Persistence/OneToMany)
+ [ManyToOne](https://en.wikibooks.org/wiki/Java_Persistence/ManyToOne)
+ [OneToOne](https://en.wikibooks.org/wiki/Java_Persistence/OneToOne)

*JPA* 常用映射方法整理，持续补充中...

**运行测试** ```mvn clean test```

[Git提交到多个远程仓库](http://blog.csdn.net/isea533/article/details/41382699)
+ 编辑 ```vim .git/config``` 文件，添加```[remote "all"]```
+ 内容如下：
  ```
  [core]
  	repositoryformatversion = 0
  	filemode = true
  	bare = false
  	logallrefupdates = true
  	ignorecase = true
  	precomposeunicode = true
  --- 添加如下内容 起----	
  [remote "all"]
      url = git@git.oschina.net:eastseven/demo-jpa.git
      url = git@github.com:eastseven/demo-jpa.git
      url = git@git.coding.net:eastseven/demo-jpa.git
      url = ssh://git@gitlab.eastseven.cn:10022/eastseven/demo-jpa.git
  --- 添加如下内容 止----
  ```
+ 执行 ```git push all --all``` 即可一次同时*push*到多个*git*仓库