package com.neuedu.test;

import com.neuedu.pojo.student;
import com.neuedu.pojo.teacher;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManger {
    public void login() {
        System.out.println("欢迎使用学生管理系统");
        System.out.println("请输入用户名");
        String name = input.next();
        System.out.println("请输入密码");
        String psw = input.next();
        student student1 = Queryone("select * from student where sname=? and spsw=?", new RowMap<student>() {
            @Override
            public student rowMaping(ResultSet resultSet) {
                student students = new student();
                try {
                    students.setSflag(resultSet.getInt("sflag"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return students;
            }
        }, name, psw);
        teacher teacher1 = Queryone("select * from teacher where tname=? and tpsw=?", new RowMap<teacher>() {
            @Override
            public teacher rowMaping(ResultSet resultSet) {
                teacher teachers = new teacher();
                try {
                    teachers.setTflag(resultSet.getInt("tflag"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return teachers;
            }
        }, name, psw);

        if (student1==null){
            System.out.println("用户名或密码错误");
        }else {
            if (student1.getSflag() == 1) {
            System.out.println("欢迎***同学");
            show2();
        }
        }
        if (teacher1==null){
            System.out.println("用户名或密码错误");
        }else {
            if (teacher1.getTflag() == 2){
                System.out.println("欢迎***老师");
                show1();
            }
        }



    }

    private Scanner input = new Scanner(System.in);

    public void show2() {
        while (true) {
            System.out.println("欢迎使用学生管理系统");
            System.out.println("1  修改");
            System.out.println("2  查讯");
            System.out.println("3  返回上一级");
            System.out.println("4  退出系统");
            System.out.println("输入编号选择功能");
            int key = input.nextInt();
            switch (key) {
                case 1:
                    System.out.println("输入要修改的姓名");
                    String sname2 = input.next();
                    System.out.println("输入要修改的年龄");
                    int sage2 = input.nextInt();
                    System.out.println("输入要修改的性别");
                    String ssex2 = input.next();
                    System.out.println("输入要修改的身高");
                    int sheight2 = input.nextInt();
                    System.out.println("输入要修改的体重");
                    int sweidht2 = input.nextInt();
                    System.out.println("输入要修改的生日");
                    String sbirthday2 = input.next();
                    System.out.println("输入要修改的密码");
                    String spsw2 = input.next();
                    excuteUpdate("update student set sname=?,sage=?,ssex=?,sheight=?,sweidht=?,sbirthday=?,spsw=?", sname2, sage2, ssex2, sheight2, sweidht2, sbirthday2, spsw2);
                    break;
                case 2:
                    System.out.println("输入学号");
                    int sno = input.nextInt();
                    student student1 = Queryone("select * from student where sno=?", new RowMap<student>() {
                        @Override
                        public student rowMaping(ResultSet resultSet) {
                            student students = new student();
                            try {
                                students.setId(resultSet.getInt("id"));
                                students.setSno(resultSet.getInt("sno"));
                                students.setSname(resultSet.getString("sname"));
                                students.setSage(resultSet.getInt("sage"));
                                students.setSsex(resultSet.getString("ssex"));
                                students.setSheight(resultSet.getInt("sheight"));
                                students.setSweidht(resultSet.getInt("sweidht"));
                                students.setSbirthday(resultSet.getString("sbirthday"));
                                students.setSpsw(resultSet.getString("spsw"));
                                students.setSflag(resultSet.getInt("sflag"));
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                            return students;
                        }
                    }, sno);
                    System.out.println(student1);
                    break;
                case 3:
                    login();
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入正确的选项");
                    break;
            }
        }
    }

    public void show1() {
        while (true) {
            System.out.println("欢迎使用学生管理系统");
            System.out.println("1  增加学生");
            System.out.println("2  删除学生");
            System.out.println("3  修改学生");
            System.out.println("4  查找学生");
            System.out.println("5  退出系统");
            System.out.println("根据学号查某个学生");
            System.out.println("输入编号选择功能");
            int key = input.nextInt();
            switch (key) {
                case 1:
                    System.out.println("输入学号");
                    int sno = input.nextInt();
                    System.out.println("输入姓名");
                    String sname = input.next();
                    System.out.println("输入年龄");
                    int sage = input.nextInt();
                    System.out.println("输入性别");
                    String ssex = input.next();
                    System.out.println("输入身高");
                    int sheight = input.nextInt();
                    System.out.println("输入体重");
                    int sweidht = input.nextInt();
                    System.out.println("输入生日");
                    String sbirthday = input.next();
                    System.out.println("输入密码");
                    String spsw = input.next();
                    excuteUpdate("insert into student(sno,sname,sage,ssex,sheight,sweidht,sbirthday,spsw) values(?,?,?,?,?,?,?,?)", sno, sname, sage, ssex, sheight, sweidht, sbirthday, spsw);
                    System.out.println("添加成功");
                    break;
                case 2:
                    System.out.println("输入要删除的学生的编号");
                    int id = input.nextInt();
                    excuteUpdate("delete from student where id=?", id);
                    System.out.println("删除成功");
                    break;
                case 3:
                    System.out.println("输入要修改的学生的编号");
                    int id1 = input.nextInt();
                    System.out.println("输入要修改的学号");
                    int sno1 = input.nextInt();
                    System.out.println("输入要修改的姓名");
                    String sname1 = input.next();
                    System.out.println("输入要修改的年龄");
                    int sage1 = input.nextInt();
                    System.out.println("输入要修改的性别");
                    String ssex1 = input.next();
                    System.out.println("输入要修改的身高");
                    int sheight1 = input.nextInt();
                    System.out.println("输入要修改的体重");
                    int sweidht1 = input.nextInt();
                    System.out.println("输入要修改的生日");
                    String sbirthday1 = input.next();
                    System.out.println("输入要修改的密码");
                    String spsw1 = input.next();
                    excuteUpdate("update  student set sno=" + sno1 + ",sname='" + sname1 + "',sage=" + sage1 + ",ssex='" + ssex1 + "',sheight=" + sheight1 + ",sweidht=" + sweidht1 + ",sbirthday='" + sbirthday1 + "',spsw='" + spsw1 + "' where id=?", id1);
                    System.out.println("修改成功");
                    break;
                case 4:
                    List<student> list = StudentManger.excuteQuery("select * from student", new RowMap<student>() {
                        @Override
                        public student rowMaping(ResultSet resultSet) {
                            student students = new student();
                            try {
                                int id = resultSet.getInt("id");
                                int sno = resultSet.getInt("sno");
                                String sname = resultSet.getString("sname");
                                int sage = resultSet.getInt("sage");
                                String ssex = resultSet.getString("ssex");
                                int sheight = resultSet.getInt("sheight");
                                int sweidht = resultSet.getInt("sweidht");
                                String sbirthday = resultSet.getString("sbirthday");
                                String spsw = resultSet.getString("spsw");
                                int sflag = resultSet.getInt("sflag");
                                students.setId(id);
                                students.setSno(sno);
                                students.setSname(sname);
                                students.setSage(sage);
                                students.setSsex(ssex);
                                students.setSheight(sheight);
                                students.setSweidht(sweidht);
                                students.setSbirthday(sbirthday);
                                students.setSpsw(spsw);
                                students.setSflag(sflag);
                            } catch (SQLException e) {
                                e.printStackTrace();
                            }
                            return students;
                        }
                    });
                    for (student s : list
                    ) {
                        System.out.println(s);
                    }
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入正确的选项");
                    break;
            }
        }
    }

    //加载驱动
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static final String URL = "jdbc:mysql://localhost:3306/sakura?useUnicode=true&characterEncoding=utf8";
    private static final String ROOT = "root";
    private static final String PASSWOED = "beauty577";

    private static Connection conn() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, ROOT, PASSWOED);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    private static void close(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (preparedStatement != null) {
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //增删改
    public static int excuteUpdate(String sql, Object... objects) {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        int result = 0;
        try {
            connection = conn();
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < objects.length; i++) {
                preparedStatement.setObject(i + 1, objects[i]);
            }
            result = preparedStatement.executeUpdate();
            if (result > 0) {
                System.out.println("成功");
            } else {
                System.out.println("失败");
            }
            System.out.println(result);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(connection, preparedStatement, null);
        }
        return result;
    }

    //查
    public static <T> List<T> excuteQuery(String sql, RowMap<T> rowMap, Object... objects) {
        List<T> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        connection = conn();
        try {
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < objects.length; i++) {
                preparedStatement.setObject(i + 1, objects[i]);
            }
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                //拿到resultSet  返回出当前类型的对象  T
//                list.add();
                T t = rowMap.rowMaping(resultSet);
                list.add(t);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }


    public static <T> T Queryone(String sql, RowMap<T> rowMap, Object... objects) {
        T t = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        connection = conn();
        try {
            preparedStatement = connection.prepareStatement(sql);
            for (int i = 0; i < objects.length; i++) {
                preparedStatement.setObject(i + 1, objects[i]);
            }
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                //拿到resultSet  返回出当前类型的对象  T
//                list.add();
                t = rowMap.rowMaping(resultSet);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return t;
    }
}
