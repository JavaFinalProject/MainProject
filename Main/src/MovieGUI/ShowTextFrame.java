package MovieGUI;


import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;



import java.util.*;
import java.util.List;
import java.util.logging.Logger;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.URL;

public class ShowTextFrame extends JFrame {

	

	//public static void main(String[] args) throws IOException{
		
		public ShowTextFrame() {
		JTextField tf = new JTextField(18); ;//�����ı���
	
		JButton bt = new JButton("����");	//����������ť
		
		JTextArea ta  = new JTextArea(50,60);	//�����ı�����ʾ�ı���Ϣ
		
		JButton bt2 = new JButton("�鿴����");
		
		JButton bt3 = new JButton("�������");
		
		JTextField tf2 = new JTextField(10);
		
		JTextArea ta2  = new JTextArea(10,40);
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JLabel jl = new JLabel();
		JPanel jp3 = new JPanel();
		
		JScrollPane sp2 = new JScrollPane(ta2);	//�ı�����ӵ��������
		sp2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 	//��ֱ������������ʾ
		sp2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); //ˮƽ������������ʾ
		
		
		JFrame f = new JFrame();
		
		jp1.add(tf);
		jp1.add(bt);
		f.add(jp1, BorderLayout.NORTH);
		
		
		jp2.add(ta);
		f.add(jp2, BorderLayout.CENTER);
		
		
		jp3.add(bt2);
		jp3.add(bt3);
		jp3.add(tf2);
		
		jp3.add(sp2);
		jp3.add(ta2);
		f.add(jp3, BorderLayout.SOUTH);
		
		
		

		
		
		JScrollPane sp = new JScrollPane(ta);	//�ı�����ӵ��������
		sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 	//��ֱ������������ʾ
		sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); //ˮƽ������������ʾ
		jp2.add(sp);
		
		
		f.setTitle("�����ӰTOP250");	//���ڱ���
		f.setSize(1000, 1000);			//���ڴ�С
		//f.pack();
		f.setLocationRelativeTo(null);	//���ھ���
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader("D:\\douban\\doubanmovie.txt"));
			String line;
			
		while ((line = reader.readLine()) != null)
			//���ж�ȡ�ı�����ʾ��TEXTAREA��
			
			ta.append(line + "\r\n");
			reader.close();
	
	} catch (IOException e) {
		System.out.println(e);
	}


		bt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				//��ȡ�ı����ֵ
				String tf_str = tf.getText().trim();
				
				
				JFrame f1 = new JFrame("�����������");
				
				f1.setSize(700, 800);
				f1.setLocationRelativeTo(null);	//���ھ���
				f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
				
				JTextArea ta1  = new JTextArea(50,60);
				
				JPanel jp1 = new JPanel();
				
				
				JScrollPane sp1 = new JScrollPane(ta1);	//�ı�����ӵ��������
				sp1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); 	//��ֱ������������ʾ
				sp1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS); //ˮƽ������������ʾ
				f1.add(sp1);
				
				
				Scanner scan1;
				try {
					scan1 = new Scanner(new File("D:\\douban\\doubanmovie.txt"));
					int k1=0;
					while(true) {
						if(scan1.hasNext()==false) 
							break;
						String s1 = scan1.nextLine();
						k1=k1+1;
						if(s1.contains(tf_str)) {
							ta1.append(s1+"\r\n");
						}
					}
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}catch(IOException e) {
					e.printStackTrace();
				}
				
				//��ȡ���
				tf.requestFocus();
				
				//���ô���ɼ�
				
				
			}
					});
		

		
		
		
		
		
			
			bt3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String filename = "D:\\douban\\pinglun.txt";
			
					try {
					File file = new File(filename);
					FileOutputStream fos = null;
					if(!file.exists()) {
						file.createNewFile();//����ļ������ڣ��ʹ������ļ�
						fos = new FileOutputStream(file);//�״�д���ȡ
					}else {
						//����ļ��Ѵ��ڣ������ļ�ĩβ׷��д��
						fos = new FileOutputStream(file,true);
						OutputStreamWriter os = new OutputStreamWriter(fos);
						//��ȡ�ı����ֵ
						String tf2_str = tf2.getText().trim();				
						//�������
						tf2.setText("");
						//�ı�������׷��
						ta2.append(tf2_str+"\r\n");
						
						os.write(tf2_str+"\r\n");		
						os.close();
						
						
					}
					}catch(IOException e1) {
						e1.printStackTrace();
					}
					
								

					
				}		
			});
			
				
				
			bt2.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String filename = "D:\\douban\\pinglun.txt";
					//��ȡ�ļ�
					try {
						InputStream is = new FileInputStream(filename);
						BufferedReader br = new BufferedReader(new InputStreamReader(is));
						String line = null;
						StringBuffer buffer = new StringBuffer();
						while((line = br.readLine())!=null) {
							buffer.append(line+"\r\n");	
						}
						ta2.setText(buffer.toString());
						br.close();
						is.close();
						
				
				} catch (IOException e1) {
					e1.printStackTrace();
				}
					}	
					
				
			});
				
			
			
			ta.addMouseListener(new MouseListener() {
				
				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void mouseClicked(MouseEvent e) {
					
					try {
						//��ȡ������Ϣ
						URL url = new URL(ta.getText().split("\n").toString());
						//��ϵͳĬ��������д�����
						Desktop.getDesktop().browse(url.toURI());
					}catch(Exception ex) {
						ex.printStackTrace();
					}
					
					
				}
			});
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
				f.setVisible(true);
	}
	
//		public static void main(String[] args) {
//			new ShowTextFrame();
//		}
}
		

	