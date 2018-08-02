
**企业人员信息管理系统设计**

**一、需求分析：**

  某小型公司，主要有三类人员：经理、兼职技术人员和兼职推销员。这三类人员共同拥有的相关属性：姓名、编号；相关方法：获取当月薪水的getPay()方法、显示个人信息的toString()方法。

人员编号基数为1000，每创建一个人员实例对象，其编号属性的值顺序加1。月薪计算方法：经理拿固定月薪8000元；兼职技术人员按每小时100元领取月薪；兼职推销人员的月薪按当月的销售额的4%提成。

要求：采用面向对象的编程思想，结合题意自己确定需要定义的类及各类的属性、构造方法和其他方法，并编写程序实现功能：

1. 查询职工个人信息，可通过姓名、编号查询；

2. 查询部门所有职工的详细信息；

3. 修改职工信息；

4. 删除职工信息；

5. 添加职工信息；

6. 查询所有职工信息，并将其存储到外设职工信息文件EmployeeData.txt中或者SQLServer数据库中，数据库中的表根据系统需求自己定义。

**二、概要设计：**

实现整个系统需要五个类文件。Employee类是所有人员的父类，Manager类、Saler类和Technician类继承于这个父类，并有自己的构造方法和其他方法，如图1所示。CompanyList类实现一个ArrayList集合，用来存放公司人员信息。其有增删改查等相关的方法，如图2所示。OperationPanel类是继承于JFrame类、实现ActionListener类的界面类，包含actionPerformed方法和main方法。

![Employee类及其子类](https://upload-images.jianshu.io/upload_images/2348575-fc39ddc2c1608894.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![系统功能模块图](https://upload-images.jianshu.io/upload_images/2348575-f30fc630f9e95abb.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


**三、详细设计：**

1. Employee类：

String类型的变量name存放员工姓名，long类型的变量id存放员工编号，int类型的静态变量ID具有1000的初值，表示员工的编号基数。构造方法中将

形参name放入域变量name，并让ID自增一次。

2. Manager类：

经理的工资因为是个常量，所以用double类型的变量salary来赋初值。构造方法调用父类的构造方法，并将自增后的ID放入id中。方法getPay()返回经理的工资数目，方法toString()返回其个人姓名、编号和工资。

3. Saler类：

销售人员类和经理类相似，只是重新定义一个double类型的salesNum变量，用来表示销售人员的销售额。在方法getPay()中，计算出工资并返回。

4. Technician类：

技术人员类和销售人员类相似，重新定义一个double类型的workHours变量，表示技术人员的工作小时数。在方法getPay()中，计算出工资并返回。

5. CompanyList类：

该类初始化一个ArrayList集合，用来存放公司所有人员信息。有以下几种方法：方法add()添加人员信息，方法remove()删除人员信息，方法modify()修改员工的姓名和编号，方法queryAll()用来查询所有人员的信息，方法query()查询单个员工的个人信息，方法save()可以将公司员工所有人员信息存放之外部EmployeeData.txt文件中。

6. OperationPanel类：

该类继承JFrame类，实现ActionListener接口。其中包含JLabel、JtextField、JButton、JeditorPane等Swing控件。在其构造方法中，使用采用了GridBagLayout布局的主面板，采用BoxLayout布局的子面板来放置各个功能模块的控件，并对每个按钮控件添加监听器。重写方法actionPerformed()，使其响应各个按钮对应的方法。在方法main()中初始化界面。

![布局原型图](https://upload-images.jianshu.io/upload_images/2348575-04556b5a93131c3c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


**四、主要源程序代码：**

1. Employee类：
![](https://upload-images.jianshu.io/upload_images/2348575-b1cbd3e8a759bb0d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

2.Manager类：
![](https://upload-images.jianshu.io/upload_images/2348575-d2e34c86798ed7d9.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

3.Saler类：
![](https://upload-images.jianshu.io/upload_images/2348575-42bf9ec621062e7d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

4.Technician类：
![](https://upload-images.jianshu.io/upload_images/2348575-3fde57d885b056e3.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

5. CompanyList类：（部分程序）
![](https://upload-images.jianshu.io/upload_images/2348575-ed4cbc2d42a17ad0.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

6. OperationPanel类：（部分程序）
![](https://upload-images.jianshu.io/upload_images/2348575-fe2b6c8de5ade197.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


**五、程序运行结果**

![](https://upload-images.jianshu.io/upload_images/2348575-e419e1a4a1596375.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

