# 我从零开始学习Java的全过程
## 1.前言 
这些代码是最近才开始上传的，不是最近才开始写的，要换电脑了所以把以前的一些练习上传到GitHub里保存，也供其他初学者进行学习。

这些练习基本上都出自于力扣题和一些网上比较常见的编程题，很少会涉及到算法，都是为了让初学者巩固知识点加强记忆的，所以不必担心难度过大而无从下手。这里面也包含了我在学习过程中遇到的一些困难和小技巧，我会在readme中详细说明。

代码会按照天分类，每天需要学习的知识点不多，需要重点记忆的我会在代码的注释里标明，同时也会在readme里写出。此项目主要基于bilibili黑马程序员的视频编写，链接如下：

>https://www.bilibili.com/video/BV17F411T7Ao?spm_id_from=333.788.videopod.episodes&vd_source=1876bc277fced39bb1ed9a4fa40961f6

代码理论为辅，实操为主，**想要学好必须要动手敲一遍代码**，哪怕是看视频看会了也不一定可以自己写出来，希望这个项目对于你的学习会有所帮助。

## 2.Day1--Java的基础语法

### 2.1 编写代码之前的准备工作

我编写Java使用的是Idea，关于Idea的安装和配置，黑马程序员的视频里有明确教程，以下为安装链接：

>https://www.bilibili.com/video/BV17F411T7Ao?spm_id_from=333.788.videopod.episodes&vd_source=1876bc277fced39bb1ed9a4fa40961f6&p=27

正式敲代码之前你需要了解的知识：

- Jdk：包含了JVM（Java运行的虚拟环境），核心类库和开发工具。所以想要写Java并且成功运行需要安装Jdk，你可以把Jdk简单理解为**开发Java程序所要用到的工具包**，这个工具包分很多个版本，不过成功安装Idea后大多数会自动给你安装相应的Jdk，如果你对这个版本的Jdk不满意，去官网搜索下载其他版本的Jdk就好了。

  **建议把下载的Jdk放到一个你能找到的文件夹里**，因为你今后用到的一些插件可能只兼容某个版本的Jdk，所以你编写代码之前需要选择不同的Jdk，放到一个文件夹里方便你选择。

### 2.2 认识Java注解

这一部分需要掌握的知识不多，注解的使用方法在Day1源代码里有示例。写注解是编写代码的良好习惯，它可以让你在写完以后很长一段时间也能知道你写的代码是什么意思。

### 2.3 基础的字符类型

- 整数型（能表示的数字大小，从小到大）：byte，short，**int（常用）**，long（数字后面加个L，大小写都可以不然报错）
- 小数型（从小到大）：float（数字后面加个F，大小写都可以不然报错），double
- 字符：char（使用**英文单引号**，例如'中'，只能表示一个字或一个字母）
- 布尔：boolean（取值为true或者false）
- 补充一个字符串：String（使用**英文双引号**，例如"我表示一串字符"，可以表示一段话或者一行英文）

  使用方法例如，我想输入一个叫做a的整数6，写为`int a =6`,其他的字符类型也像这样去编写。

### 2.4 键盘录入

使用键盘录入功能需要导入一个叫Scanner的库，有个小技巧，打开Idea的设置，勾选**动态添加明确的import**和**动态优化import**就可以自动导入相应的库了，如图：
![屏幕截图 2024-11-20 121803](https://github.com/user-attachments/assets/42cfcfd5-a472-4214-af0e-845c0ed13cde)




    
