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

import b22_윈도우빌더.dao.DeleteUserDao;
import b22_윈도우빌더.dto.UserDto;
import b22_윈도우빌더.service.LoginService;
import b22_윈도우빌더.service.LoginServiceImpl;
import b22_윈도우빌더.service.SignUpService;
import b22_윈도우빌더.service.SignUpServiceImpl;

public class User extends JFrame {
	
	private UserDto loginSession;
	
	private LoginService loginService;
	private CardLayout mainCard;
	private JTextField login_id_tf;
	private JPasswordField login_pwd_tf;
	private JTextField id_tf;
	private JPasswordField pwd_tf;
	private JPasswordField repwd_tf;
	private JTextField name_tf;
	private JTextField phone_tf;
	private JTextField email_tf;
	private JComboBox gender_cb;
	private JLabel welcomMsg;
	private String[] gender_list = {"선택", "남성", "여성", "선택하지 않음"};
	
	private LoginService loginSerivce;
	private SignUpService signupService;
	private DeleteUserDao deleteUserDao;

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
		
		login_id_tf = new JTextField();
		login_id_tf.setColumns(10);
		login_id_tf.setBounds(316, 179, 166, 30);
		login_pan.add(login_id_tf);
		
		JButton login_btn = new JButton("\uB85C\uADF8\uC778");
		login_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(login_id_tf.getText());
				System.out.println(login_pwd_tf.getText());
				int flag = loginSerivce.loginTextCheck(login_id_tf.getText(), login_pwd_tf.getText());
				System.out.println(flag);
				if(flag != 2) {
					String msg = null;
					if(flag == 0) {
						msg = "존재하지 않는 아이디입니다.";
					}else if(flag == 1) {
						msg = "비밀번호를 다시 확인해 주세요.";
					}else if(flag == 3) {
						msg = "아이디를 입력해 주세요.";
					}else if(flag == 4) {
						msg = "비밀번호를 입력해 주세요.";
					}
					JOptionPane.showMessageDialog(null, msg, "경고", JOptionPane.WARNING_MESSAGE);
				}else {
					mainCard.show(mainCardPan, "index_pan");
					loginSession = loginSerivce.getUserDto(login_id_tf.getText());
					welcomMsg.setText(loginSession.getUser_name() + "님 환영합니다.");
				}
			}
		});
		login_btn.setBounds(507, 179, 69, 71);
		login_pan.add(login_btn);
		
		JLabel ldLabel = new JLabel("\uC544\uC774\uB514");
		ldLabel.setBounds(213, 176, 56, 34);
		login_pan.add(ldLabel);
		
		JLabel pwdLabel = new JLabel("\uBE44\uBC00\uBC88\uD638");
		pwdLabel.setBounds(213, 215, 68, 35);
		login_pan.add(pwdLabel);
		
		login_pwd_tf = new JPasswordField();
		login_pwd_tf.setBounds(316, 218, 165, 29);
		login_pan.add(login_pwd_tf);
		
		JButton sign_up = new JButton("\uD68C\uC6D0\uAC00\uC785");
		sign_up.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainCardPan, "sign_up_pan");
				id_tf.setText("");
				id_tf.setEditable(true);
				pwd_tf.setText("");
				repwd_tf.setText("");
				name_tf.setText("");
				phone_tf.setText("");
				email_tf.setText("");
				gender_cb.setSelectedIndex(0);
				
				login_id_tf.setText("");
				login_pwd_tf.setText("");
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
		
	    gender_cb = new JComboBox(gender_list);
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
						gender_cb.getSelectedItem().toString(),
						Integer.toString(gender_cb.getSelectedIndex())
				};
				
				String erroMsg = signupService.isEmptyValue(values);
				
				if(!erroMsg.equals("values is not null")) {
					JOptionPane.showMessageDialog(null, erroMsg, "공백 오류", JOptionPane.ERROR_MESSAGE);
				}else {
					erroMsg = signupService.equalsPassword(pwd_tf.getText(), repwd_tf.getText());
					if(!erroMsg.equals("password equals")) {
						JOptionPane.showMessageDialog(null, erroMsg, "비밀번호 오류", JOptionPane.ERROR_MESSAGE);
					}else {
						boolean flag = signupService.signUp(values);
						JOptionPane.showMessageDialog(null, "회원가입에 성공하였습니다.", "회원가입 성공", JOptionPane.INFORMATION_MESSAGE);
						mainCard.show(mainCardPan, "login_pan");
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
		
		JPanel index_pan = new JPanel();
		mainCardPan.add(index_pan, "index_pan");
		index_pan.setLayout(null);
		
		welcomMsg = new JLabel("New label");
		welcomMsg.setBounds(12, 10, 350, 25);
		index_pan.add(welcomMsg);
		
		JButton logout_btn = new JButton("\uB85C\uADF8\uC544\uC6C3");
		logout_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag = JOptionPane.showConfirmDialog(null,"정말 로그아웃 하시겠습니까?", "로그아웃", JOptionPane.YES_NO_OPTION);
				if(flag == 0) {
					mainCard.show(mainCardPan, "login_pan");
					loginSession = null;
					login_id_tf.setText("");
					login_pwd_tf.setText("");
				}
			}
		});
		logout_btn.setBounds(717, 11, 97, 23);
		index_pan.add(logout_btn);
		
		JButton mypage_btn = new JButton("\uB9C8\uC774\uD398\uC774\uC9C0");
		mypage_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCard.show(mainCardPan, "mypage_pan");
			}
		});
		mypage_btn.setBounds(608, 11, 97, 23);
		index_pan.add(mypage_btn);
		
		JPanel mypage_pan = new JPanel();
		mainCardPan.add(mypage_pan, "name_9175080567000");
		mypage_pan.setLayout(null);
		
		JButton user_drop_btn = new JButton("\uD68C\uC6D0\uD0C8\uD1F4");
		user_drop_btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int flag =JOptionPane.showConfirmDialog(null, "정말로 계정을 삭제하시겠습니까?", "회원탈퇴", JOptionPane.YES_NO_OPTION);
				if(flag == 0) {
					boolean dropFlag = deleteUserDao.deleteUser(loginSession.getUser_id());
					mainCard.show(mainCardPan, "login_pan");
					login_id_tf.setText("");
					login_pwd_tf.setText("");
				}
			}
		});
		user_drop_btn.setBounds(717, 460, 97, 23);
		mypage_pan.add(user_drop_btn);
	}
}
