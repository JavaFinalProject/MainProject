package teamWork;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LandingMyActionListener implements ActionListener{
	public static String userName;
	public static boolean land;
		private JTextField usertxt;
		private JPasswordField pwdtxt;
		MainFrame mf=new MainFrame();
		
		public LandingMyActionListener(JTextField usertxt,JPasswordField pwdtxt) {
			this.usertxt=usertxt;
			this.pwdtxt=pwdtxt;
			
		}
		public void actionPerformed(ActionEvent e)
	    {
			
	        if(!CheckIsNull())
	        {
	        	userName=usertxt.getText().trim();
	            //��ȡ�û���������û���
	            String user = usertxt.getText().trim();
	        	
	            //��ȡ�û������������
	            String pwd = pwdtxt.getText().trim();
	        	
	            if(checkUserAndPwd(user,pwd)=="true")
	            {

	                //���ص�ǰ��¼����
	              
	            	JOptionPane.showMessageDialog(mf,"��¼�ɹ�������");
	            	//mf.setVisible(false);
	            	land=true;
	            }
	            else
	            {   land=false;
	            	if(checkUserAndPwd(user,pwd)=="stay")
	                //��������򵯳�һ����ʾ��
	                //JOptionPane pane = new JOptionPane("�û����������");
	                //JDialog dialog  = pane.createDialog(GUIt.myFrame,"����");
	                //dialog.show();
	               {JOptionPane.showMessageDialog(mf,"�����������������");}
	            if(checkUserAndPwd(user,pwd)=="false") {
	            	JOptionPane.showMessageDialog(mf,"����δע���������ע��");
	            }
	            	

	            }
	        }
	    }
	    

		public String result;
		

	private String checkUserAndPwd(String user,String pwd)
	{
	    result = "false";
	    try
	    {
	       
	    	File ctoFile = new File("D:\\usersInfo.txt");
			  if (!ctoFile.exists()) {
	    	    ctoFile.createNewFile();
	    	   }
			InputStreamReader rdCto = new InputStreamReader(new FileInputStream(ctoFile));
			BufferedReader bfReader = new BufferedReader(rdCto);
		
	      	String txtline = null;
			
			
				while ((txtline = bfReader.readLine()) != null) 
	    	
	       {
	            String[] strs = txtline.split("��");
	            if(strs[0].equals(user)&&strs[1].equals(pwd))
	            {
	                //if(strs[1].equals(pwd))
	               result ="true"; 
	            }
	            else { if(strs[0].equals(user)&&!strs[1].equals(pwd))
	            	{result="stay";}
	            
	            }}
	           
	       
	       bfReader.close();
	    }catch(Exception ex)
	    {
	        System.out.print("");
	    }
	    return result;
	}
	private boolean CheckIsNull()
	{
	    boolean flag = false;
	    if(usertxt.getText().trim().equals(""))
	    {
	        flag = true;
	    }
	    else
	    {
	        if(pwdtxt.getText().trim().equals(""))
	        {
	            flag = true;
	        }
	    }
	    return flag;
	}
	 
	}




