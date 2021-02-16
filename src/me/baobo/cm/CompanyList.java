package me.baobo.cm;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CompanyList {

	List<Employee> cl = new ArrayList<>(); // 初始化一个ArrayList集合，用来存放人员信息

	// 添加人员
	public void add(Employee e) {
		cl.add(e);
	}

	// 删除人员
	public void remove(String name) { // 通过姓名删除人员
		// System.out.println("Step 5");
		for (int i = 0; i < cl.size(); i++) {
			if (cl.get(i).name.matches(name)) { // 这里不能写成cl.get(i).name==name，否则无法匹配成功
				// System.out.println("Step 6");
				cl.remove(cl.get(i));
				// System.out.println("Step 7");
				break;
			}
		}
	}

	public void remove(long id) { // 通过编号删除人员
		for (int i = 0; i < cl.size(); i++) {
			if (cl.get(i).id == id) {
				cl.remove(cl.get(i));
				break;
			}
		}
	}

	// 修改员工的姓名和编号
	public void modify(long id1, String name, long id2) {
		boolean okToMod = true; // 判断标识，用来确定是否能够修改员工信息
		for (int j = 0; j < cl.size(); j++) {
			if (id1 == id2 || cl.get(j).name.matches(name) || cl.get(j).id == id2) { // 修改后的员工姓名name或者编号id如果与其他人相同，则不修改
				okToMod = false; // false表示不修改
				break;
			}
		}
		if (okToMod) {
			for (int i = 0; i < cl.size(); i++) {
				if (cl.get(i).id == id1) { // 查找编号为id1的员工
					if (name != null) { // 修改后name不为空值则修改，为空值则不变化
						cl.get(i).name = name;
					}
					// for(int j=0;j<cl.size();j++){ //遍历集合
					// if(cl.get(j).id==id2){ //修改后的id不能与其他人相同
					// break;
					// }else{
					cl.get(i).id = id2;
					// }
					// }
				}
				// if(cl.get(i).id==id2){
				// break;
				// }else{
				// cl.get(i).id=id2;
				// }
			}
		}
	}

	// 查询所有人员
	public String queryAll() {
		String tmp = "";
		for (Employee e : cl) {
			// System.out.println(e.toString());
			tmp += " { " + e.toString() + " } ";
		}
		return tmp;
	}

	// 查询员工个人信息，可以通过姓名、编号查询
	public String query(String name) { // 通过姓名查询
		String tmp = "";
		for (int i = 0; i < cl.size(); i++) {
			if (cl.get(i).name.matches(name)) { // 这里不能写成cl.get(i).name==name，否则无法匹配成功
				// System.out.println(cl.get(i));
				tmp = cl.get(i).toString();
			}
		}
		return tmp;
	}

	public String query(long id) { // 通过编号查询
		String tmp = "";
		for (int i = 0; i < cl.size(); i++) {
			if (cl.get(i).id == id) {
				// System.out.println(cl.get(i));
				tmp = cl.get(i).toString();
			}
		}
		return tmp;
	}

	// 查询所有员工信息，并存储到EmployeeData.txt文件
	public String save() {
		String tmp = "Failed to save!"; // 默认返回失败语句
		try {
			FileWriter fw = new FileWriter("EmployeeData.txt"); // 文件输出字符流
			BufferedWriter bw = new BufferedWriter(fw); // 缓冲输出处理流
			for (Employee e : cl) {
				bw.write(e.toString()); // 向文件中写入数据
				bw.newLine(); // 换行
			}
			bw.flush(); // 强制将缓冲区中的数据发送出去,不必等到缓冲区满
			bw.close();
			fw.close();
			// System.out.println("Saved Successfully!");
			tmp = "Saved Successfully!"; // 执行成功返回成功语句
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return tmp;
	}
}
