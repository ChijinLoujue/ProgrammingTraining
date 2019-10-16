package jdbctomysql;

import java.sql.*;

public class MySQLDemo {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "";

    static final String USER = "";
    static final String PASS = "";

    public static void main(String []args){
        Connection conn =null;
        Statement stmt = null;

        try {
            //注册JDBC驱动
            Class.forName(JDBC_DRIVER);

            //打开链接
            System.out.println("Connecting to SQL...");
            conn = DriverManager.getConnection(DB_URL,USER,PASS);

            //执行查询
            System.out.println("Instantiate a statement object...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT id,name,url FROM websites";
            ResultSet rs = stmt.executeQuery(sql);

            //展开结果集数据库
            while (rs.next()){
                //通过字段检索
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");

                //输出数据
                System.out.print("ID:"+id+" ");
                System.out.print("NAME:"+name+" ");
                System.out.print("URL:"+url);
                System.out.println();
            }
            rs.close();
            stmt.close();
            conn.close();
        }catch (SQLException se){
            se.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }finally {
            try {
                if(stmt!=null) stmt.close();
            }catch (SQLException se2){

            }
            try {
                if(conn!=null) conn.close();
            }catch (SQLException se){
                se.printStackTrace();
            }
        }
        System.out.println("All Finish!!!");
    }
}
