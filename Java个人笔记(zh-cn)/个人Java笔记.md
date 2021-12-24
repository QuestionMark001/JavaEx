##  个人Java笔记(zh-cn)  
###  一、类（class）  
1."java 类名"命令（运行阶段），java命令后不能跟路径及.class整个文件的文件名，一定是程序里的类名。  
##### (注："java .java文件"命令为JDK13新特性，可直接编译加运行，但不生成.class文件，相当于在内存中运行生成的类)  
  
![不生成.class文件](JDK13新特性.png "不生成.class文件")  
  
2.一个Java文件中可以包含多个类，但最多有一个公共类（除内部类外，不能包含多个公共类），公共类应与Java源文件名一致。  
  
![多个类](多个类.png "多个类")  
  
###  二、注释（Code Annotation）  
####  1.单行注释  
```java
// 你可以写一行注释
```  
####  1.多行注释  
```java
/*
   你可以写多行注释
   第一行
   第二行
*/
```  
####  3.Javadoc注释  
```java
/**
 * javadoc注释
 * 类的注释信息
 * @version 1.0
 * @author QuestionMark001
 * ...
 */
```  
##### (注："javadoc .java文件"命令可根据javadoc注释为Java源文件生成帮助文档)  
  
![javadoc](javadoc默认生成的帮助文档(html+css).png "用javadoc生成的html+css类型的帮助文档")  
  

  
![Circulate.html](Circulate.html.png "Circulate.html")  
  
