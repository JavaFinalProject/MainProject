package Main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import MovieGUI.ShowTextFrame;




public class MainFrame extends JFrame{

	JFrame jf; 
	
	JPanel jp1; 
	JPanel jp2;
	
	JButton jb1; 
	JButton jb2; 
	JButton jb3; 
	JButton jb4; 
	JButton jb5;
	
	public MainFrame() {
		jf = new JFrame();
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		
		jb1 = new JButton("书籍");
		jb2 = new JButton("电影");
		jb3 = new JButton("音乐");
		jb4 = new JButton("登陆");
		jb5 = new JButton("注册");
		
		
		jb1.setFont(new Font("宋体", Font.PLAIN, 24));
		jb2.setFont(new Font("宋体", Font.PLAIN, 24));
		jb3.setFont(new Font("宋体", Font.PLAIN, 24));
		jb4.setFont(new Font("宋体", Font.PLAIN, 24));
		jb5.setFont(new Font("宋体", Font.PLAIN, 24));
		
		
		Dimension preferredSize = new Dimension(350,350);//设置尺寸
		jb1.setPreferredSize(preferredSize );
		jb2.setPreferredSize(preferredSize );
		jb3.setPreferredSize(preferredSize );
		jb4.setPreferredSize(preferredSize );
		jb5.setPreferredSize(preferredSize );
		
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		jp2.add(jb4);
		jp2.add(jb5);
		
		jf.add(jp1,BorderLayout.NORTH);
		jf.add(jp2,BorderLayout.CENTER);	
		
		
		jf.setSize(1000, 1000);
		jf.setLocationRelativeTo(null);
		jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		jf.setVisible(true);
		
		//对按钮添加鼠标事件
		//书籍
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		//电影
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 new ShowTextFrame();
				}
			
		});
		
		//音乐
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		//登陆
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame jf4 = new JFrame("登陆");
				
				JPanel p1 = new JPanel();
				JPanel p2 = new JPanel();
				
				
				JButton b1 = new JButton("姓名");
				JButton b2 = new JButton("密码");
				JButton b3 = new JButton("提交");
				
				JTextField tf1 = new JTextField(18);
				JTextField tf2 = new JTextField(18);
				
				p1.add(b1);
				p1.add(tf1);
				
				p2.add(b2);
				p2.add(tf2);
				p2.add(b3);
				
				jf4.add(p1, BorderLayout.NORTH);
				jf4.add(p2, BorderLayout.CENTER);
				
				
				
				b1.setFont(new Font("宋体", Font.PLAIN, 20));
				b2.setFont(new Font("宋体", Font.PLAIN, 20));
				b3.setFont(new Font("宋体", Font.PLAIN, 20));
				
				
				
				jf4.setSize(400, 300);			//窗口大小
				jf4.setLocationRelativeTo(null);	//窗口居中
				jf4.setDefaultCloseOperation(EXIT_ON_CLOSE);
				jf4.setVisible(true);
				
				
				
				
				
				
				
				
			}
		});
		

	
	//注册
	jb5.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame jf4 = new JFrame("注册");
			
			JPanel p1 = new JPanel();
			JPanel p2 = new JPanel();
			
			
			JButton b1 = new JButton("姓名");
			JButton b2 = new JButton("密码");
			JButton b3 = new JButton("提交");
			
			JTextField tf1 = new JTextField(18);
			JTextField tf2 = new JTextField(18);
			
			p1.add(b1);
			p1.add(tf1);
			
			p2.add(b2);
			p2.add(tf2);
			p2.add(b3);
			
			jf4.add(p1, BorderLayout.NORTH);
			jf4.add(p2, BorderLayout.CENTER);
			
			
			
			b1.setFont(new Font("宋体", Font.PLAIN, 20));
			b2.setFont(new Font("宋体", Font.PLAIN, 20));
			b3.setFont(new Font("宋体", Font.PLAIN, 20));
			
			
			
			jf4.setSize(400, 300);			//窗口大小
			jf4.setLocationRelativeTo(null);	//窗口居中
			jf4.setDefaultCloseOperation(EXIT_ON_CLOSE);
			jf4.setVisible(true);
			
			
			
			
			
			
			
			
		}
	});
	

}
	
	
	
	
	
	public static void main(String[] args) {
		new MainFrame();
	}
}
