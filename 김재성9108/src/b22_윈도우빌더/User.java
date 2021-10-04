package b22_윈도우빌더;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import b22_윈도우빌더.service.LoginService;
import b22_윈도우빌더.service.LoginServiceImpl;
import b22_윈도우빌더.service.SignUpService;
import b22_윈도우빌더.service.SignUpServiceImpl;

public class User extends JFrame {
	
	private LoginService loginService;
	private CardLayout mainCard;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField id_tf;
	private JPasswordField pwd_tf;
	private JPasswordField repwd_tf;
	private JTextField name_tf;
	private JTextField phone_tf;
	private JTextField email_tf;
	private String[] gender_list = {"선택", "남성", "여성", "선택하지 않음"};
	
	private LoginService loginSerivce;
	private SignUpService signupService;


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
	 * @param mainCard 
	 */
	public User() {
		loginService = new LoginServiceImpl();
		signupService = new SignUpServiceImpl();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 852, 542);
		JPanel mainCardPan = new JPanel();
		mainCardPan.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainCardPan);
		mainCard = new CardLayout();
		mainCardPan.setLayout(mainCard);
		
		JPanel login_pan = new JPanel();
		mainCardPan.add(login_pan, "login_pan");
		login_pan.setLayout(null);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(316, 179, 166, 30);
		login_pan.add(textField);
		
		JButton btnNewButton = new JButton("\uB85C\uADF8\uC778");
		btnNewButton.setBounds(507, 179, 69, 71);
		login_pan.add(btnNewButton);
		
		JLabel ldLabel = new JLabel("\uC544\uC774\uB514");
		ldLabel.setBounds(213, 176, 56, 34);
		login_pan.add(ldLabel);
		
		JLabel pwdLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		pwdLabel.setBounds(213, 215, 68, 35);
		login_pan.add(pwdLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(316, 218, 165, 29);
		login_pan.add(passwordField);
		
		JButton sign_up = new JButton("\uD68C\uC6D0\uAC00\uC785");
		sign_up.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainCardPan, "sign_up_pan");
			}
		});
		sign_up.setBounds(350, 280, 93, 23);
		login_pan.add(sign_up);
		
		JPanel sign_up_pan = new JPanel();
		mainCardPan.add(sign_up_pan, "sign_up_pan");
		sign_up_pan.setLayout(null);
		
		JLabel IbNewLabel = new JLabel("\uC544\uC774\uB514");
		IbNewLabel.setBounds(206, 67, 36, 15);
		IbNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		sign_up_pan.add(IbNewLabel);
		
		id_tf = new JTextField();
		id_tf.setBounds(270, 64, 109, 21);
		sign_up_pan.add(id_tf);
		id_tf.setColumns(10);
		
		JLabel lblNewLabel1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel1.setBounds(194, 111, 48, 15);
		sign_up_pan.add(lblNewLabel1);
		
		pwd_tf = new JPasswordField();
		pwd_tf.setBounds(270, 108, 204, 21);
		sign_up_pan.add(pwd_tf);
		
		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638 \uD655\uC778");
		lblNewLabel_1.setBounds(166, 157, 76, 15);
		sign_up_pan.add(lblNewLabel_1);
		
		repwd_tf = new JPasswordField();
		repwd_tf.setBounds(270, 154, 204, 21);
		sign_up_pan.add(repwd_tf);
		
		JLabel lblNewLabel_2 = new JLabel("\uC774\uB984");
		lblNewLabel_2.setBounds(218, 200, 24, 15);
		sign_up_pan.add(lblNewLabel_2);
		
		name_tf = new JTextField();
		name_tf.setBounds(270, 197, 204, 21);
		sign_up_pan.add(name_tf);
		name_tf.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("\uC5F0\uB77D\uCC98");
		lblNewLabel_3.setBounds(206, 250, 36, 15);
		sign_up_pan.add(lblNewLabel_3);
		
		phone_tf = new JTextField();
		phone_tf.setBounds(270, 247, 204, 21);
		sign_up_pan.add(phone_tf);
		phone_tf.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("\uC774\uBA54\uC77C");
		lblNewLabel_4.setBounds(206, 291, 36, 15);
		sign_up_pan.add(lblNewLabel_4);
		
		email_tf = new JTextField();
		email_tf.setBounds(270, 288, 204, 21);
		sign_up_pan.add(email_tf);
		email_tf.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("\uC131\uBCC4");
		lblNewLabel_5.setBounds(218, 334, 24, 15);
		sign_up_pan.add(lblNewLabel_5);
		
		JComboBox gender_cb = new JComboBox(gender_list);
		gender_cb.setBounds(270, 330, 204, 23);
		sign_up_pan.add(gender_cb);
		
		JButton sign_up_btn = new JButton("\uAC00\uC785\uD558\uAE30");
		sign_up_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] values = {
						id_tf.getText(),
						pwd_tf.getText(),
						repwd_tf.getText(),
						name_tf.getText(),
						phone_tf.getText(),
						email_tf.getText(),
						gender_cb.getSelectedItem().toString()
				};
				
				String erroMsg = signupService.isEmptyValue(values);
				
				if(!erroMsg.equals("values is not null")) {
					JOptionPane.showMessageDialog(null, erroMsg, "공백 오류", JOptionPane.ERROR_MESSAGE);
				}else {
					erroMsg = signupService.equalsPassword(pwd_tf.getText(), repwd_tf.getText());
					if(!erroMsg.equals("password equals")) {
						JOptionPane.showMessageDialog(null, erroMsg, "비밀번호 오류", JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		});
		sign_up_btn.setBounds(270, 371, 96, 23);
		sign_up_pan.add(sign_up_btn);
		
		JButton id_chk_btn = new JButton("\uC911\uBCF5\uD655\uC778");
		id_chk_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = signupService.idCheck(id_tf.getText());
				if(flag == 2) {
					JOptionPane.showMessageDialog(null, "아이디를 입력하세요.", "경고", JOptionPane.ERROR_MESSAGE);
				}else if(flag == 1){
					JOptionPane.showMessageDialog(null, "존재하는 아이디입니다.", "아이디 중복", JOptionPane.WARNING_MESSAGE);
				}else if(flag == 0){
					int select = JOptionPane.showConfirmDialog(null, "사용가능한 아이디입니다.\n사용하시겠습니까?", "아이디 확인", JOptionPane.YES_NO_OPTION);
					if(select == 0) {
						id_tf.setEditable(false);
					}
				}
			}
		});
		id_chk_btn.setBounds(378, 63, 97, 23);
		sign_up_pan.add(id_chk_btn);
		
		JButton page_back_btn = new JButton("\uB4A4\uB85C\uAC00\uAE30");
		page_back_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainCardPan, "login_pan");
			}
		});
		page_back_btn.setBounds(378, 371, 97, 23);
		sign_up_pan.add(page_back_btn);
	}
}
