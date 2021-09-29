package b22_윈도우빌더;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import b22_윈도우빌더.service.LoginService;
import b22_윈도우빌더.service.LoginServiceImpl;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class User extends JFrame {
	private JTextField id_text;
	private JPasswordField pwd_text;
	private LoginService loginService;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try{
					
					User frame = new User();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public User() {
		loginService = new LoginServiceImpl();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		id_text = new JTextField();
		id_text.setBounds(66, 68, 224, 30);
		contentPane.add(id_text);
		id_text.setColumns(10);
		
		JButton btnNewButton = new JButton("로그인");
		btnNewButton.addMouseListener(new MouseAdapter() {
		@Override
			public void mouseClicked(MouseEvent e) {
				int flag = loginService.loginTextCheck(id_text.getText(), pwd_text.getText());
				if(flag == 0) {
					JOptionPane.showMessageDialog(null, "아이디가 존재하지 않습니다.", "아이디 확인", JOptionPane.ERROR_MESSAGE);
				}else if(flag == 1) {
					JOptionPane.showMessageDialog(null, "비밀번호가 틀렸습니다.", "비밀번호 확인", JOptionPane.ERROR_MESSAGE);
				}
				else if(flag == 2) {
					JOptionPane.showMessageDialog(null, "로그인 성공.", "성공", JOptionPane.INFORMATION_MESSAGE);
				}
				else if(flag == 3) {
					JOptionPane.showMessageDialog(null, "아이디를 입력해 주세요.", "경고", JOptionPane.WARNING_MESSAGE);
				}
				else if(flag == 4) {
					JOptionPane.showMessageDialog(null, "비밀번호를 입력해 주세요.", "경고", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btnNewButton.setBounds(299, 68, 109, 71);
		contentPane.add(btnNewButton);
		
		JLabel ldLabel = new JLabel("아이디");
		ldLabel.setBounds(12, 75, 424, 15);
		contentPane.add(ldLabel);
		
		JLabel pwdLabel_1 = new JLabel("비밀번호");
		pwdLabel_1.setBounds(12, 118, 57, 15);
		contentPane.add(pwdLabel_1);
		
		pwd_text = new JPasswordField();
		pwd_text.setBounds(66, 109, 224, 30);
		contentPane.add(pwd_text);
	}
}
