package Main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
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
		
		jb1 = new JButton("�鼮");
		jb2 = new JButton("��Ӱ");
		jb3 = new JButton("����");
		jb4 = new JButton("��½");
		jb5 = new JButton("ע��");
		
		
		jb1.setFont(new Font("����", Font.PLAIN, 24));
		jb2.setFont(new Font("����", Font.PLAIN, 24));
		jb3.setFont(new Font("����", Font.PLAIN, 24));
		jb4.setFont(new Font("����", Font.PLAIN, 24));
		jb5.setFont(new Font("����", Font.PLAIN, 24));
		
		
		Dimension preferredSize = new Dimension(350,350);//���óߴ�
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
		
		//�԰�ť�������¼�
		//�鼮
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		//��Ӱ
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				 new ShowTextFrame();
				}
			
		});
		
		//����
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		
		//��½
		jb4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFrame jf4 = new JFrame("��½");
				
				JPanel p1 = new JPanel();
				JPanel p2 = new JPanel();
				
				
				JButton b1 = new JButton("����");
				JButton b2 = new JButton("����");
				JButton b3 = new JButton("�ύ");
				
				JTextField tf1 = new JTextField(18);
				//JTextField tf2 = new JTextField(18);
				JPasswordField tf2 = new JPasswordField(18);
				
				p1.add(b1);
				p1.add(tf1);
				
				p2.add(b2);
				p2.add(tf2);
				p2.add(b3);
				
				jf4.add(p1, BorderLayout.NORTH);
				jf4.add(p2, BorderLayout.CENTER);
				
				
				
				b1.setFont(new Font("����", Font.PLAIN, 20));
				b2.setFont(new Font("����", Font.PLAIN, 20));
				b3.setFont(new Font("����", Font.PLAIN, 20));
				
				
				
				jf4.setSize(400, 300);			//���ڴ�С
				jf4.setLocationRelativeTo(null);	//���ھ���
				jf4.setDefaultCloseOperation(EXIT_ON_CLOSE);
				jf4.setVisible(true);
				
				
				
				
				
				
				
				
			}
		});
		

	
	//ע��
	jb5.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			JFrame jf4 = new JFrame("ע��");
			
			JPanel p1 = new JPanel();
			JPanel p2 = new JPanel();
			
			
			JButton b1 = new JButton("����");
			JButton b2 = new JButton("����");
			JButton b3 = new JButton("�ύ");
			
			JTextField tf1 = new JTextField(18);
			//JTextField tf2 = new JTextField(18);
			JPasswordField tf2 = new JPasswordField(18);
			
			p1.add(b1);
			p1.add(tf1);
			
			p2.add(b2);
			p2.add(tf2);
			p2.add(b3);
			
			jf4.add(p1, BorderLayout.NORTH);
			jf4.add(p2, BorderLayout.CENTER);
			
			
			
			b1.setFont(new Font("����", Font.PLAIN, 20));
			b2.setFont(new Font("����", Font.PLAIN, 20));
			b3.setFont(new Font("����", Font.PLAIN, 20));
			
			
			
			jf4.setSize(400, 300);			//���ڴ�С
			jf4.setLocationRelativeTo(null);	//���ھ���
			jf4.setDefaultCloseOperation(EXIT_ON_CLOSE);
			jf4.setVisible(true);
			
			
			
			
			
			
			
			
		}
	});
	

}
	
	
	
	
	
	public static void main(String[] args) {
		new MainFrame();
	}
}
