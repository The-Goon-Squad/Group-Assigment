import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JEditorPane;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;

public class UI extends JFrame {

	private JPanel mainPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField txtImportData;
	private JTextField txtPleaseHookYour;
	private JTextField txtEditData;
	private JTextField importConfirmation;
	private JTextField txtFriendsList;
	private JTextField txtUsername;
	private JPasswordField pwdPasswoed;
	private JTextField txtPassword;
	private JTextField textField_1;
	private JTextField txtUsername_1;
	private JTextField txtActivityTracker;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI frame = new UI();
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
	public UI() {
		setResizable(false);
		setTitle("Activity Tracker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnProfile = new JMenu("Log out");
		menuBar.add(mnProfile);
		
		JMenuItem mntmEditProfile = new JMenuItem("Log out");
		mnProfile.add(mntmEditProfile);
		
		JMenu mnExit = new JMenu("Exit");
		menuBar.add(mnExit);
		
		JMenuItem mntmEit = new JMenuItem("Exit");
		mnExit.add(mntmEit);
		mainPane = new JPanel();
		mainPane.setBackground(Color.LIGHT_GRAY);
		mainPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPane);
	    mainPane.setLayout(new CardLayout(0, 0));
	    
	    JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	    mainPane.add(tabbedPane, "name_63785020111509");
	    /**
	    * Create the log in screen.
	    */
	    JPanel panel_2 = new JPanel();
	    panel_2.setBackground(new Color(176, 196, 222));
	    tabbedPane.addTab("Log in", null, panel_2, null);
	    panel_2.setLayout(null);
	    
	    pwdPasswoed = new JPasswordField();
	    pwdPasswoed.setBounds(226, 263, 157, 20);
	    panel_2.add(pwdPasswoed);
	    
	    txtPassword = new JTextField();
	    txtPassword.setEditable(false);
	    txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
	    txtPassword.setBackground(new Color(176, 196, 222));
	    txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    txtPassword.setText("Password");
	    txtPassword.setBounds(255, 221, 106, 31);
	    panel_2.add(txtPassword);
	    txtPassword.setColumns(10);
	    
	    textField_1 = new JTextField();
	    textField_1.setBounds(226, 168, 157, 20);
	    panel_2.add(textField_1);
	    textField_1.setColumns(10);
	    
	    txtUsername_1 = new JTextField();
	    txtUsername_1.setEditable(false);
	    txtUsername_1.setHorizontalAlignment(SwingConstants.CENTER);
	    txtUsername_1.setText("Username");
	    txtUsername_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    txtUsername_1.setColumns(10);
	    txtUsername_1.setBackground(new Color(176, 196, 222));
	    txtUsername_1.setBounds(255, 126, 106, 31);
	    panel_2.add(txtUsername_1);
	    
	    txtActivityTracker = new JTextField();
	    txtActivityTracker.setEditable(false);
	    txtActivityTracker.setBackground(new Color(176, 196, 222));
	    txtActivityTracker.setForeground(new Color(255, 69, 0));
	    txtActivityTracker.setHorizontalAlignment(SwingConstants.CENTER);
	    txtActivityTracker.setText("Activity Tracker");
	    txtActivityTracker.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 30));
	    txtActivityTracker.setBounds(173, 11, 259, 42);
	    panel_2.add(txtActivityTracker);
	    txtActivityTracker.setColumns(10);
	    
	    JButton btnNewButton_1 = new JButton("Sign in");
	    btnNewButton_1.setBounds(255, 350, 106, 23);
	    panel_2.add(btnNewButton_1);
	    /**
	    * Create the data screen.
	    */
	    JPanel Data = new JPanel();
	    Data.setBackground(new Color(176, 196, 222));
	    tabbedPane.addTab("Data", null, Data, null);
	    
	    textField = new JTextField();
	    textField.setBackground(new Color(176, 196, 222));
	    Data.add(textField);
	    textField.setColumns(10);
	    
	    /**
	    * Display the data graph.
	    */
	    JTextArea textArea = new JTextArea();
	    textArea.setEditable(false);
	    Data.add(textArea);
	    textArea.setBackground(new Color(176, 196, 222));
	    textArea.setText("\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|______________________________________________________\r\n\r\n\t\t\t\tDate ");
	    
	    JRadioButton rdbtnNewRadioButton = new JRadioButton("Fat Burned");
	    Data.add(rdbtnNewRadioButton);
	    rdbtnNewRadioButton.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    			textField.setText("Fat Burned");
	    	}
	    });
	    buttonGroup.add(rdbtnNewRadioButton);
	    
	    JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Calories Burned");
	    Data.add(rdbtnNewRadioButton_1);
	    rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    			textField.setText("Calories Burned");
	    	}
	    });
	    buttonGroup.add(rdbtnNewRadioButton_1);
	    
	    JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Distance Ran");
	    Data.add(rdbtnNewRadioButton_2);
	    rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    			textField.setText("Distance Ran");
	    	}
	    });
	    buttonGroup.add(rdbtnNewRadioButton_2);
	    
	    
	    
	    JCheckBox chckbxNewCheckBox = new JCheckBox("Compare with Friends");
	    Data.add(chckbxNewCheckBox);
	    
	    /**
	    * Create the import data screen.
	    */
	    JPanel importPanel_1 = new JPanel();
	    importPanel_1.setBackground(new Color(176, 196, 222));
	    tabbedPane.addTab("Import Data", null, importPanel_1, null);
	    importPanel_1.setLayout(null);
	    
	    txtImportData = new JTextField();
	    txtImportData.setBounds(241, 5, 146, 32);
	    txtImportData.setEditable(false);
	    importPanel_1.add(txtImportData);
	    txtImportData.setForeground(Color.CYAN);
	    txtImportData.setBackground(new Color(176, 196, 222));
	    txtImportData.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 18));
	    txtImportData.setText("Import Data");
	    txtImportData.setColumns(10);
	    
	    txtPleaseHookYour = new JTextField();
	    txtPleaseHookYour.setEditable(false);
	    txtPleaseHookYour.setFont(new Font("Tahoma", Font.BOLD, 14));
	    txtPleaseHookYour.setBackground(new Color(176, 196, 222));
	    txtPleaseHookYour.setText("Please hook your device up to your computer.");
	    txtPleaseHookYour.setBounds(137, 62, 337, 32);
	    importPanel_1.add(txtPleaseHookYour);
	    txtPleaseHookYour.setColumns(10);
	    
	    JButton btnImport = new JButton("Import");
	    btnImport.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		importConfirmation.setText("Data has been imported");
	    	}
	    });
	    btnImport.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    btnImport.setBounds(235, 104, 152, 50);
	    importPanel_1.add(btnImport);
	    
	    importConfirmation = new JTextField();
	    importConfirmation.setBackground(new Color(176, 196, 222));
	    importConfirmation.setEditable(false);
	    importConfirmation.setBounds(235, 199, 152, 20);
	    importPanel_1.add(importConfirmation);
	    importConfirmation.setColumns(10);
	    
	    /**
	    * Create the edit data screen.
	    */
	    JPanel editDatapanel = new JPanel();
	    editDatapanel.setBackground(new Color(176, 196, 222));
	    tabbedPane.addTab("Edit Data", null, editDatapanel, null);
	    editDatapanel.setLayout(null);
	    
	    txtEditData = new JTextField();
	    txtEditData.setBackground(new Color(176, 196, 222));
	    txtEditData.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
	    txtEditData.setEditable(false);
	    txtEditData.setText("Edit Data");
	    txtEditData.setBounds(266, 11, 86, 20);
	    editDatapanel.add(txtEditData);
	    txtEditData.setColumns(10);
	    
	    JTextArea txtrSelectWhatYou = new JTextArea();
	    txtrSelectWhatYou.setEditable(false);
	    txtrSelectWhatYou.setBackground(new Color(176, 196, 222));
	    txtrSelectWhatYou.setText("Select what you would like to change or remove");
	    txtrSelectWhatYou.setBounds(186, 42, 372, 22);
	    editDatapanel.add(txtrSelectWhatYou);
	    
	    JList list = new JList();
	    list.setBounds(157, 75, 310, 243);
	    editDatapanel.add(list);
	    
	    JButton btnEdit = new JButton("Edit");
	    btnEdit.setBounds(204, 329, 89, 23);
	    editDatapanel.add(btnEdit);
	    
	    JButton btnRemove = new JButton("Remove");
	    btnRemove.setBounds(326, 329, 89, 22);
	    editDatapanel.add(btnRemove);
	    
	    /**
	    * Create the friends screen.
	    */
	    JPanel friendsPanel = new JPanel();
	    friendsPanel.setBackground(new Color(176, 196, 222));
	    tabbedPane.addTab("Friends", null, friendsPanel, null);
	    friendsPanel.setLayout(null);
	    
	    txtFriendsList = new JTextField();
	    txtFriendsList.setHorizontalAlignment(SwingConstants.CENTER);
	    txtFriendsList.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
	    txtFriendsList.setText("Friends List");
	    txtFriendsList.setToolTipText("");
	    txtFriendsList.setForeground(new Color(0, 0, 0));
	    txtFriendsList.setEditable(false);
	    txtFriendsList.setBackground(new Color(176, 196, 222));
	    txtFriendsList.setBounds(231, 11, 158, 59);
	    friendsPanel.add(txtFriendsList);
	    txtFriendsList.setColumns(10);
	    
	    JTextPane txtpnFriendsListHere = new JTextPane();
	    txtpnFriendsListHere.setEditable(false);
	    txtpnFriendsListHere.setText("Friends list here");
	    txtpnFriendsListHere.setBounds(144, 97, 320, 314);
	    friendsPanel.add(txtpnFriendsListHere);
	    
	    JButton btnRemoveFriend = new JButton("Remove Friend");
	    btnRemoveFriend.setBounds(171, 444, 117, 23);
	    friendsPanel.add(btnRemoveFriend);
	    
	    JButton btnNewButton = new JButton("Add Friend");
	    btnNewButton.setBounds(325, 444, 122, 23);
	    friendsPanel.add(btnNewButton);
	    
	    /**
	    * Create the profile screen.
	    */
	    JPanel profilePanel = new JPanel();
	    profilePanel.setBackground(SystemColor.activeCaption);
	    tabbedPane.addTab("Profile", null, profilePanel, null);
	    profilePanel.setLayout(null);
	    
	    JPanel panel = new JPanel();
	    panel.setBounds(0, 0, 629, 74);
	    profilePanel.add(panel);
	    panel.setLayout(null);
	    
	    JTextPane txtpnProfilePicture = new JTextPane();
	    txtpnProfilePicture.setEditable(false);
	    txtpnProfilePicture.setBackground(new Color(50, 205, 50));
	    txtpnProfilePicture.setText("Profile Picture");
	    txtpnProfilePicture.setBounds(10, 11, 59, 52);
	    panel.add(txtpnProfilePicture);
	    
	    txtUsername = new JTextField();
	    txtUsername.setEditable(false);
	    txtUsername.setBackground(new Color(34, 139, 34));
	    txtUsername.setText("Username");
	    txtUsername.setBounds(79, 28, 86, 20);
	    panel.add(txtUsername);
	    txtUsername.setColumns(10);
	    
	    JButton btnEditProfile = new JButton("Edit ");
	    btnEditProfile.setBounds(516, 27, 83, 23);
	    panel.add(btnEditProfile);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(70, 130, 180));
	    panel_1.setBounds(10, 85, 609, 393);
	    profilePanel.add(panel_1);
	    panel_1.setLayout(null);
	    
	    JTextPane txtpnSectionShowingInformation = new JTextPane();
	    txtpnSectionShowingInformation.setEditable(false);
	    txtpnSectionShowingInformation.setBackground(new Color(0, 191, 255));
	    txtpnSectionShowingInformation.setText("Section showing information\r\nuser decides to share");
	    txtpnSectionShowingInformation.setBounds(10, 11, 181, 120);
	    panel_1.add(txtpnSectionShowingInformation);
	    
	    JTextArea txtrSectionShowingUsers = new JTextArea();
	    txtrSectionShowingUsers.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtrSectionShowingUsers.setBackground(new Color(0, 191, 255));
	    txtrSectionShowingUsers.setEditable(false);
	    txtrSectionShowingUsers.setText("Section showing user's \r\npreferred activities");
	    txtrSectionShowingUsers.setBounds(10, 168, 181, 153);
	    panel_1.add(txtrSectionShowingUsers);
	    
	    JEditorPane editorPane = new JEditorPane();
	    editorPane.setEditable(false);
	    editorPane.setText("\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\nStats|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|_______________________________________\r\n\t\t\t\t\tDate");
	    editorPane.setBounds(201, 11, 398, 330);
	    panel_1.add(editorPane);
	    
	    
	}
}
