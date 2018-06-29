package me.baobo.cm;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class OperationPanel extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L; // 自动生成的序列化，为了保持版本的兼容性，可以不写，但会有警告

	JLabel addIt = new JLabel("<html><font color=red>添加人员</font></html>");
	JLabel managerName = new JLabel("经理姓名：");
	JTextField managerNameText = new JTextField(10);
	JButton addManager = new JButton("添加");

	JLabel salerName = new JLabel("销售姓名：");
	JTextField salerNameText = new JTextField(10);
	JLabel salerSales = new JLabel("销售额度：");
	JTextField salerSalesText = new JTextField(10);
	JButton addSaler = new JButton("添加");

	JLabel technicianName = new JLabel("技术姓名：");
	JTextField technicianNameText = new JTextField(10);
	JLabel technicianWork = new JLabel("技术时长：");
	JTextField technicianWorkText = new JTextField(10);
	JButton addTechnician = new JButton("添加");

	JLabel removeIt = new JLabel("<html><font color=red>删除人员</font></html>");
	JLabel removeID = new JLabel("人员编号（首选）：");
	JTextField removeIDText = new JTextField(10);
	JLabel removeName = new JLabel("人员姓名：");
	JTextField removeNameText = new JTextField(10);
	JButton removeHim = new JButton("删除");

	JLabel modifyIt = new JLabel("<html><font color=red>修改人员</font></html>");
	JLabel modifyID_Before = new JLabel("人员编号：");
	JTextField modifyIDText_Before = new JTextField(10);
	JLabel modifyID_After = new JLabel("修改编号为：");
	JTextField modifyIDText_After = new JTextField(10);
	JLabel modifyName = new JLabel("修改姓名为：");
	JTextField modifyNameText = new JTextField(10);
	JButton modifyHim = new JButton("修改");

	JLabel queryIt = new JLabel("<html><font color=red>查询人员</font></html>");
	JLabel queryID = new JLabel("人员编号（首选）：");
	JTextField queryIDText = new JTextField(10);
	JLabel queryName = new JLabel("人员姓名：");
	JTextField queryNameText = new JTextField(10);
	JButton queryHim = new JButton("查询");
	JButton queryThem = new JButton("查询所有");
	JButton queryAndSave = new JButton("查询并保存");

	JLabel showIt = new JLabel("<html><font color=blue>显示区域</font></html>");
	JEditorPane jep = new JEditorPane(); // 初始化“显示区域”

	CompanyList cl0 = new CompanyList(); // 初始化CompanyList类

	// 构造方法
	public OperationPanel() {
		// setTitle("CompanyManage");
		// setResizable(false);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel01 = new JPanel(); // panel01是一个父面板
		panel01.setLayout(new BoxLayout(panel01, BoxLayout.Y_AXIS)); // 定义panel01的布局为
																		// BoxLayout，BoxLayout为垂直排列
		panel01.add(Box.createVerticalStrut(10)); // 加入一个不可见的 Strut，从而对顶部留出一定的空间
		JPanel panel01_01 = new JPanel(); // panel01_01是一个子面板，用来放置功能模块的标题（比如此处addIt对应的“添加人员”标签）
		panel01_01.add(addIt);
		JPanel panel01_02 = new JPanel(); // panel01_02也是一个子面板，用来放置box1
		Box box1 = Box.createHorizontalBox(); // 创建一个从左到右显示其组件的box1，用来水平放置输入框和按钮
		panel01_02.setLayout(new BoxLayout(panel01_02, BoxLayout.X_AXIS)); //// 定义panel01_02的布局为
																			//// BoxLayout，BoxLayout为水平排列
		panel01_02.add(box1); // 把box1放入panel01_02中
		// panel01_02.add(managerName);
		// panel01_02.add(managerAddName);
		// panel01_02.add(addManager);
		// panel01_02.add(salerName);
		// panel01_02.add(salerAddName);
		// panel01_02.add(salerSales);
		// panel01_02.add(salerAddSales);
		// panel01_02.add(addSaler);
		// panel01_02.add(technicianName);
		// panel01_02.add(technicianAddName);
		// panel01_02.add(technicianWork);
		// panel01_02.add(technicianAddWork);
		// panel01_02.add(addTechnician);
		box1.add(managerName); // 把输入框和按钮等控件放入box1中
		box1.add(managerNameText);
		box1.add(addManager);
		box1.add(salerName);
		box1.add(salerNameText);
		box1.add(salerSales);
		box1.add(salerSalesText);
		box1.add(addSaler);
		box1.add(technicianName);
		box1.add(technicianNameText);
		box1.add(technicianWork);
		box1.add(technicianWorkText);
		box1.add(addTechnician);
		panel01.add(panel01_01); // 把panel01_01放入panel01中
		panel01.add(panel01_02); // 把panel01_02放入panel01中
		panel01.add(Box.createVerticalStrut(10)); // 加入一个不可见的 Strut，从而对底部留出一定的空间

		JPanel panel02 = new JPanel();
		panel02.setLayout(new BoxLayout(panel02, BoxLayout.Y_AXIS));
		panel02.add(Box.createVerticalStrut(10));
		JPanel panel02_01 = new JPanel();
		panel02_01.add(removeIt);
		JPanel panel02_02 = new JPanel();
		Box box2 = Box.createHorizontalBox();
		panel02_02.setLayout(new BoxLayout(panel02_02, BoxLayout.X_AXIS));
		panel02_02.add(box2);
		box2.add(removeID);
		box2.add(removeIDText);
		box2.add(removeName);
		box2.add(removeNameText);
		box2.add(removeHim);
		panel02.add(panel02_01);
		panel02.add(panel02_02);
		panel02.add(Box.createVerticalStrut(10));

		JPanel panel03 = new JPanel();
		panel03.setLayout(new BoxLayout(panel03, BoxLayout.Y_AXIS));
		panel03.add(Box.createVerticalStrut(10));
		JPanel panel03_01 = new JPanel();
		panel03_01.add(modifyIt);
		JPanel panel03_02 = new JPanel();
		Box box3 = Box.createHorizontalBox();
		panel03_02.setLayout(new BoxLayout(panel03_02, BoxLayout.X_AXIS));
		panel03_02.add(box3);
		box3.add(modifyID_Before);
		box3.add(modifyIDText_Before);
		box3.add(modifyID_After);
		box3.add(modifyIDText_After);
		box3.add(modifyName);
		box3.add(modifyNameText);
		box3.add(modifyHim);
		panel03.add(panel03_01);
		panel03.add(panel03_02);
		panel03.add(Box.createVerticalStrut(10));

		JPanel panel04 = new JPanel();
		panel04.setLayout(new BoxLayout(panel04, BoxLayout.Y_AXIS));
		panel04.add(Box.createVerticalStrut(10));
		JPanel panel04_01 = new JPanel();
		panel04_01.add(queryIt);
		JPanel panel04_02 = new JPanel();
		Box box4 = Box.createHorizontalBox();
		panel04_02.setLayout(new BoxLayout(panel04_02, BoxLayout.X_AXIS));
		panel04_02.add(box4);
		box4.add(queryID);
		box4.add(queryIDText);
		box4.add(queryName);
		box4.add(queryNameText);
		box4.add(queryHim);
		box4.add(queryThem);
		box4.add(queryAndSave);
		panel04.add(panel04_01);
		panel04.add(panel04_02);
		panel04.add(Box.createVerticalStrut(10));

		JPanel panel05 = new JPanel();
		panel05.setLayout(new BoxLayout(panel05, BoxLayout.Y_AXIS));
		panel05.add(Box.createVerticalStrut(10));
		JPanel panel05_01 = new JPanel();
		panel05_01.add(showIt);
		JPanel panel05_02 = new JPanel();
		Box box5 = Box.createVerticalBox();
		panel05_02.setLayout(new BoxLayout(panel05_02, BoxLayout.X_AXIS));
		// JTextArea jta = new JTextArea(100,100);
		// jta.setLineWrap(true);
		// jta.setWrapStyleWord(true);
		// jta.setPreferredSize(new Dimension(200, 200));
		// jta.setTabSize(10);
		// JEditorPane jep = new JEditorPane();
		jep.setPreferredSize(new Dimension(100, 100));
		JScrollPane jsp = new JScrollPane(jep); // 初始化一个JScrollPane，用来放置“显示区域”
		box5.add(jsp);
		panel05_02.add(box5);
		panel05.add(panel05_01);
		panel05.add(panel05_02);
		panel05.add(Box.createVerticalStrut(10));

		// 创建 panelContainer
		JPanel panelContainer = new JPanel();
		// panelContainer 的布局为 GridBagLayout
		panelContainer.setLayout(new GridBagLayout()); // panelContainer采用GridBagLayout进行布局

		GridBagConstraints c1 = new GridBagConstraints();
		c1.gridx = 0;
		c1.gridy = 0;
		c1.weightx = 1.0;
		c1.weighty = 0;
		c1.fill = GridBagConstraints.HORIZONTAL;
		panelContainer.add(panel01, c1);

		GridBagConstraints c2 = new GridBagConstraints();
		c2.gridx = 0;
		c2.gridy = 1;
		c2.weightx = 1.0;
		c2.weighty = 0;
		c2.fill = GridBagConstraints.HORIZONTAL;
		panelContainer.add(panel02, c2);

		GridBagConstraints c3 = new GridBagConstraints();
		c3.gridx = 0;
		c3.gridy = 2;
		c3.weightx = 1.0;
		c3.weighty = 0;
		c3.fill = GridBagConstraints.HORIZONTAL;
		panelContainer.add(panel03, c3);

		GridBagConstraints c4 = new GridBagConstraints();
		c4.gridx = 0;
		c4.gridy = 3;
		c4.weightx = 1.0;
		c4.weighty = 0;
		c4.fill = GridBagConstraints.HORIZONTAL;
		panelContainer.add(panel04, c4);

		GridBagConstraints c5 = new GridBagConstraints();
		c5.gridx = 0;
		c5.gridy = 4;
		c5.weightx = 1.0;
		c5.weighty = 0;
		c5.fill = GridBagConstraints.HORIZONTAL;
		panelContainer.add(panel05, c5);

		JFrame frame = new JFrame("企业人员信息管理系统");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 设置用户在此窗体上发起"close"
																// 时默认执行关闭操作
		panelContainer.setOpaque(true); // 设置控件是否透明的，true表示不透明
		frame.setSize(new Dimension(1000, 400)); // 设置窗体大小，宽1000，高400
		frame.setContentPane(panelContainer); // 设置panelContainer为内容面板
		frame.setVisible(true); // 设置窗体可见性，true为可见
		frame.setResizable(false); // 设置窗体拉伸，false为不允许

		// 对每个按钮添加监听器
		addManager.addActionListener(this);
		addSaler.addActionListener(this);
		addTechnician.addActionListener(this);
		removeHim.addActionListener(this);
		modifyHim.addActionListener(this);
		queryHim.addActionListener(this);
		queryThem.addActionListener(this);
		queryAndSave.addActionListener(this);

	}

	// main方法
	public static void main(String[] args) {

		new OperationPanel(); // 初始化界面
		// op.pack();
		// op.setVisible(true);

		// Employee m = new Manager("王经理");
		// System.out.println(m.toString());
		//
		// Employee s = new Saler("陈销售",5000);
		// System.out.println(s.toString());
		//
		// Employee t = new Technician("李技工",200);
		// System.out.println(t.toString());

		// CompanyList cl0 = new CompanyList();
		// cl0.add(m);
		// cl0.add(s);
		// cl0.add(t);
		// cl0.remove("陈销售");
		// cl0.remove(1003);
		// cl0.queryAll();
		// cl0.query("T");
		// cl0.query(1001);
		// cl0.modify(1002,"M",1002);
		// cl0.queryAll();
		// cl0.save();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// CompanyList cl0 = new CompanyList();
		// 添加经理
		if (e.getSource() == addManager) {
			String tmp = managerNameText.getText().toString(); // 获取输入框中的内容
			if (tmp.isEmpty()) {
				jep.setText("Warning! You must fill the blank!"); // 输入框为空则输出警告
			} else {
				Employee m = new Manager(tmp);
				cl0.add(m);
			}
		}
		// 添加销售
		if (e.getSource() == addSaler) {
			String tmp = salerNameText.getText().toString();
			String work_s = salerSalesText.getText().toString();
			if (tmp.isEmpty() || work_s.isEmpty()) { // 判断输入框是否空白
				jep.setText("Warning! You must fill the blank!"); // 输入框为空则输出警告
			} else {
				long work_l = Long.parseLong(work_s); // 将String类型的数字转化为long类型
				Employee s = new Saler(tmp, work_l);
				cl0.add(s);
			}
		}
		// 添加技工
		if (e.getSource() == addTechnician) {
			String tmp = technicianNameText.getText().toString();
			String work_s = technicianWorkText.getText().toString();
			if (tmp.isEmpty() || work_s.isEmpty()) { // 判断输入框是否空白
				jep.setText("Warning! You must fill the blank!"); // 输入框为空则输出警告
			} else {
				long work_l = Long.parseLong(work_s);
				Employee t = new Technician(tmp, work_l);
				cl0.add(t);
			}
		}
		// 删除人员
		if (e.getSource() == removeHim) {
			String tmpID_s = removeIDText.getText().toString();
			// long tmpID_l = Long.parseLong(tmpID_s);
			String tmpName = removeNameText.getText().toString();
			if (!tmpID_s.isEmpty()) { // 如果编号输入框有内容
				// System.out.println("Step 1");
				long tmpID_l = Long.parseLong(tmpID_s);
				// System.out.println("Step 2");
				cl0.remove(tmpID_l);
				// System.out.println("Step 3");
			} else if (!tmpName.isEmpty()) { // 如果编号输入框没有内容，姓名输入框有内容
				// System.out.println("Step 4");
				cl0.remove(tmpName);
				// System.out.println("Step 8");
			}
		}
		// 修改人员
		if (e.getSource() == modifyHim) {
			String tmpID01_s = modifyIDText_Before.getText().toString();
			long tmpID01_l = Long.parseLong(tmpID01_s);
			String tmpID02_s = modifyIDText_After.getText().toString();
			long tmpID02_l = Long.parseLong(tmpID02_s);
			String tmpName = modifyNameText.getText().toString();
			cl0.modify(tmpID01_l, tmpName, tmpID02_l);
		}
		// 查询单个人员
		if (e.getSource() == queryHim) {
			String tmpID_s = queryIDText.getText().toString();
			// long tmpID_l = Long.parseLong(tmpID_s);
			String tmpName = queryNameText.getText().toString();
			if (!tmpID_s.isEmpty()) { // 如果编号输入框有内容
				// cl0.query(tmp);
				long tmpID_l = Long.parseLong(tmpID_s);
				jep.setText(cl0.query(tmpID_l));
			} else if (!tmpName.isEmpty()) { // 如果编号输入框没有内容，姓名输入框有内容
				// cl0.query(tmpID_l);
				jep.setText(cl0.query(tmpName));
			}
		}
		// 查询所有人员
		if (e.getSource() == queryThem) {
			// String tmp = cl0.queryAll();
			jep.setText(cl0.queryAll());
		}
		// 查询并且保存
		if (e.getSource() == queryAndSave) {
			jep.setText(cl0.save());
		}
	}

}