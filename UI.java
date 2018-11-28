import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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
import javax.swing.JScrollPane;
import datechooser.beans.DateChooserPanel;

public class UI extends JFrame {

	private JPanel mainPane;
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
	private Profile profile = new Profile("Group 4", "m", "dob", 66, 55);
	private JTextField txtBeginningAt;
	private JTextField txtEndDate;

	/**
	 * Create the frame.
	 */
	
	public UI() {
		setResizable(false);
		setTitle("Activity Tracker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 780);
		
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
	    pwdPasswoed.setBounds(435, 358, 172, 42);
	    panel_2.add(pwdPasswoed);
	    
	    txtPassword = new JTextField();
	    txtPassword.setEditable(false);
	    txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
	    txtPassword.setBackground(new Color(176, 196, 222));
	    txtPassword.setFont(new Font("Tahoma", Font.PLAIN, 25));
	    txtPassword.setText("Password");
	    txtPassword.setBounds(450, 289, 149, 58);
	    panel_2.add(txtPassword);
	    txtPassword.setColumns(10);
	    
	    textField_1 = new JTextField();
	    textField_1.setBounds(435, 218, 172, 42);
	    panel_2.add(textField_1);
	    textField_1.setColumns(10);
	    
	    txtUsername_1 = new JTextField();
	    txtUsername_1.setEditable(false);
	    txtUsername_1.setHorizontalAlignment(SwingConstants.CENTER);
	    txtUsername_1.setText("Username");
	    txtUsername_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
	    txtUsername_1.setColumns(10);
	    txtUsername_1.setBackground(new Color(176, 196, 222));
	    txtUsername_1.setBounds(450, 148, 131, 58);
	    panel_2.add(txtUsername_1);
	    
	    txtActivityTracker = new JTextField();
	    txtActivityTracker.setEditable(false);
	    txtActivityTracker.setBackground(new Color(176, 196, 222));
	    txtActivityTracker.setForeground(new Color(255, 69, 0));
	    txtActivityTracker.setHorizontalAlignment(SwingConstants.CENTER);
	    txtActivityTracker.setText("Activity Tracker");
	    txtActivityTracker.setFont(new Font("Franklin Gothic Demi", Font.PLAIN, 50));
	    txtActivityTracker.setBounds(329, 11, 380, 106);
	    panel_2.add(txtActivityTracker);
	    txtActivityTracker.setColumns(10);
	    
	    JButton btnNewButton_1 = new JButton("Sign in");
	    btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
	    btnNewButton_1.setBounds(460, 539, 132, 42);
	    panel_2.add(btnNewButton_1);
	    /**
	    * Create the data screen.
	    */
	    
	    
	    /**
	    * Create the import data screen.
	    */
	    JPanel importPanel_1 = new JPanel();
	    importPanel_1.setBackground(new Color(176, 196, 222));
	    tabbedPane.addTab("Import Data", null, importPanel_1, null);
	    importPanel_1.setLayout(null);
	    
	    txtImportData = new JTextField();
	    txtImportData.setHorizontalAlignment(SwingConstants.CENTER);
	    txtImportData.setBounds(241, 5, 441, 58);
	    txtImportData.setEditable(false);
	    importPanel_1.add(txtImportData);
	    txtImportData.setForeground(Color.CYAN);
	    txtImportData.setBackground(new Color(176, 196, 222));
	    txtImportData.setFont(new Font("Comic Sans MS", Font.BOLD | Font.ITALIC, 50));
	    txtImportData.setText("Import Data");
	    txtImportData.setColumns(10);
	    
	    txtPleaseHookYour = new JTextField();
	    txtPleaseHookYour.setHorizontalAlignment(SwingConstants.CENTER);
	    txtPleaseHookYour.setEditable(false);
	    txtPleaseHookYour.setFont(new Font("Tahoma", Font.BOLD, 18));
	    txtPleaseHookYour.setBackground(new Color(176, 196, 222));
	    txtPleaseHookYour.setText("Please hook your device up to your computer.");
	    txtPleaseHookYour.setBounds(241, 132, 474, 50);
	    importPanel_1.add(txtPleaseHookYour);
	    txtPleaseHookYour.setColumns(10);
	    
	    JButton btnImport = new JButton("Import");
	    
	    btnImport.setFont(new Font("Tahoma", Font.PLAIN, 14));
	    btnImport.setBounds(394, 193, 152, 50);
	    importPanel_1.add(btnImport);
	    
	    importConfirmation = new JTextField();
	    importConfirmation.setFont(new Font("Tahoma", Font.PLAIN, 27));
	    importConfirmation.setBackground(new Color(176, 196, 222));
	    importConfirmation.setEditable(false);
	    importConfirmation.setBounds(372, 270, 201, 44);
	    importPanel_1.add(importConfirmation);
	    importConfirmation.setColumns(10);
	    
	    /**
	    * Create the edit data screen.
	    */
	    JPanel Data = new JPanel();
	    Data.setBackground(new Color(176, 196, 222));
	    tabbedPane.addTab("Data", null, Data, null);
	    Data.setLayout(null);
	    
	    txtBeginningAt = new JTextField();
	    txtBeginningAt.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
	    txtBeginningAt.setBackground(SystemColor.inactiveCaption);
	    txtBeginningAt.setText("Beginning Date");
	    txtBeginningAt.setBounds(44, 61, 198, 32);
	    Data.add(txtBeginningAt);
	    txtBeginningAt.setColumns(10);
	    
	    txtEndDate = new JTextField();
	    txtEndDate.setText("End Date");
	    txtEndDate.setFont(new Font("Trebuchet MS", Font.PLAIN, 22));
	    txtEndDate.setColumns(10);
	    txtEndDate.setBackground(SystemColor.inactiveCaption);
	    txtEndDate.setBounds(44, 324, 198, 32);
	    Data.add(txtEndDate);
	    
	    

	    DateChooserPanel dateBegin = new DateChooserPanel();
	    dateBegin.setBounds(22, 115, 250, 180);
	    Data.add(dateBegin);
	    
	    DateChooserPanel dateEnd = new DateChooserPanel();
	    dateEnd.setBounds(22, 367, 250, 180);
	    Data.add(dateEnd);
	    
	    
	    JScrollPane scrollPane_1 = new JScrollPane();
	    scrollPane_1.setBounds(377, 219, 467, 283);
	    Data.add(scrollPane_1);
	    
	    JTextPane runDisplayData = new JTextPane();
	    scrollPane_1.setViewportView(runDisplayData);
	    runDisplayData.setText(profile.getName() + "'s runs: ");
	    runDisplayData.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    runDisplayData.setEditable(false);
	    runDisplayData.setBackground(new Color(0, 191, 255));
	    
	    JButton btnNewButton_2 = new JButton("Find Data");
	    btnNewButton_2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		SimpleDateFormat sdf = new SimpleDateFormat();
	    		runDisplayData.setText(profile.getName() + "'s runs: ");
	    		ArrayList<Running> lst = profile.getData();
	    		
	    		
	    		for(int i = 0; i < lst.size(); i++) {
	    			
	    			if (lst.get(i).getDate().after(dateBegin.getSelectedDate().getTime()) &&
	    				lst.get(i).getDate().before(dateEnd.getSelectedDate().getTime())) {
	    				
	 
	    				runDisplayData.setText(runDisplayData.getText() + "\n\nDate: " + sdf.format(lst.get(i).getDate()) + "\nTime : " + Double.toString(lst.get(i).getTime()/60) + 
	    					" minutes\nDistance: " +  Double.toString(lst.get(i).getDistance()) + " meters\nAltitude Loss: " + Double.toString(lst.get(i).getAltitudeLoss()) + " meters" + 
	    						"\nAltitude Gain: " + Double.toString(lst.get(i).getAltitudeGain()) + " meters");
	    			}
	    		}
	    		
	    	}
	    });
	    btnNewButton_2.setBounds(44, 586, 198, 40);
	    Data.add(btnNewButton_2);
	    
	    JPanel editDatapanel = new JPanel();
	    editDatapanel.setBackground(new Color(176, 196, 222));
	    tabbedPane.addTab("Edit Data", null, editDatapanel, null);
	    editDatapanel.setLayout(null);
	    
	    txtEditData = new JTextField();
	    txtEditData.setHorizontalAlignment(SwingConstants.CENTER);
	    txtEditData.setBackground(new Color(176, 196, 222));
	    txtEditData.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 50));
	    txtEditData.setEditable(false);
	    txtEditData.setText("Edit Data");
	    txtEditData.setBounds(266, 11, 475, 53);
	    editDatapanel.add(txtEditData);
	    txtEditData.setColumns(10);
	    
	    JTextArea txtrSelectWhatYou = new JTextArea();
	    txtrSelectWhatYou.setFont(new Font("Monospaced", Font.PLAIN, 22));
	    txtrSelectWhatYou.setEditable(false);
	    txtrSelectWhatYou.setBackground(new Color(176, 196, 222));
	    txtrSelectWhatYou.setText("Select what you would like to change or remove");
	    txtrSelectWhatYou.setBounds(204, 95, 609, 44);
	    editDatapanel.add(txtrSelectWhatYou);
	    
	    JList list = new JList();
	    list.setBounds(339, 150, 310, 243);
	    editDatapanel.add(list);
	    
	    JButton btnEdit = new JButton("Edit");
	    btnEdit.setBounds(339, 452, 89, 23);
	    editDatapanel.add(btnEdit);
	    
	    JButton btnRemove = new JButton("Remove");
	    btnRemove.setBounds(560, 452, 89, 22);
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
	    txtFriendsList.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 50));
	    txtFriendsList.setText("Friends List");
	    txtFriendsList.setToolTipText("");
	    txtFriendsList.setForeground(new Color(0, 0, 0));
	    txtFriendsList.setEditable(false);
	    txtFriendsList.setBackground(new Color(176, 196, 222));
	    txtFriendsList.setBounds(231, 11, 474, 67);
	    friendsPanel.add(txtFriendsList);
	    txtFriendsList.setColumns(10);
	    
	    JTextPane txtpnFriendsListHere = new JTextPane();
	    txtpnFriendsListHere.setEditable(false);
	    txtpnFriendsListHere.setText("Friends list here");
	    txtpnFriendsListHere.setBounds(316, 89, 320, 314);
	    friendsPanel.add(txtpnFriendsListHere);
	    
	    JButton btnRemoveFriend = new JButton("Remove Friend");
	    btnRemoveFriend.setBounds(316, 444, 117, 23);
	    friendsPanel.add(btnRemoveFriend);
	    
	    JButton btnNewButton = new JButton("Add Friend");
	    btnNewButton.setBounds(514, 444, 122, 23);
	    friendsPanel.add(btnNewButton);
	    
	    /**
	    * Create the profile screen.
	    */
	    JPanel profilePanel = new JPanel();
	    profilePanel.setBackground(SystemColor.activeCaption);
	    tabbedPane.addTab("Profile", null, profilePanel, null);
	    profilePanel.setLayout(null);
	    
	    JPanel panel = new JPanel();
	    panel.setBounds(0, 0, 1028, 84);
	    profilePanel.add(panel);
	    panel.setLayout(null);
	    
	    /*Username and profile picture*/
	    JTextPane txtpnProfilePicture = new JTextPane();
	    txtpnProfilePicture.setEditable(false);
	    txtpnProfilePicture.setBackground(new Color(50, 205, 50));
	    txtpnProfilePicture.setText("Profile Picture");
	    txtpnProfilePicture.setBounds(10, 0, 83, 84);
	    panel.add(txtpnProfilePicture);
	    
	    txtUsername = new JTextField();
	    txtUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
	    txtUsername.setEditable(false);
	    txtUsername.setBackground(new Color(34, 139, 34));
	    txtUsername.setText(profile.getName());
	    txtUsername.setBounds(103, 18, 176, 35);
	    panel.add(txtUsername);
	    txtUsername.setColumns(10);
	    
	    JButton btnEditProfile = new JButton("Edit ");
	    btnEditProfile.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		
	    	}
	    });
	    btnEditProfile.setBounds(935, 27, 83, 23);
	    panel.add(btnEditProfile);
	    
	    JPanel panel_1 = new JPanel();
	    panel_1.setBackground(new Color(70, 130, 180));
	    panel_1.setBounds(10, 85, 1018, 607);
	    profilePanel.add(panel_1);
	    panel_1.setLayout(null);
	    

	    
	    JTextArea txtrSectionShowingUsers = new JTextArea();
	    txtrSectionShowingUsers.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtrSectionShowingUsers.setBackground(new Color(0, 191, 255));
	    txtrSectionShowingUsers.setEditable(false);
	    txtrSectionShowingUsers.setText("Section showing user's \r\npreferred activities");
	    txtrSectionShowingUsers.setBounds(10, 340, 323, 256);
	    panel_1.add(txtrSectionShowingUsers);
	 
	    JEditorPane editorPane = new JEditorPane();
	    editorPane.setFont(new Font("Tahoma", Font.PLAIN, 21));
	    editorPane.setEditable(false);
	    editorPane.setText("\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\nStats|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|\r\n\t|_______________________________________\r\n\t\t\t\t\tDate");
	    editorPane.setBounds(343, 26, 648, 570);
	    panel_1.add(editorPane);
	    
	    JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setBounds(10, 23, 323, 300);
	    panel_1.add(scrollPane);
	    
	    JTextPane importedData = new JTextPane();
	    scrollPane.setViewportView(importedData);
	    importedData.setFont(new Font("Tahoma", Font.PLAIN, 20));
	    importedData.setEditable(false);
	    importedData.setBackground(new Color(0, 191, 255));
	    importedData.setText(profile.getName() + "'s runs: ");
	    
	    btnImport.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		profile.importData();
	    		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	    		ArrayList<Running> runs= profile.getData();
	    		for(int i = 0; i < runs.size(); i++){
	    			importedData.setText(importedData.getText() + "\n\nDate: " + sdf.format(runs.get(i).getDate()) + "\nTime : " + Double.toString(runs.get(i).getTime()/60) + 
	    					" minutes\nDistance: " +  Double.toString(runs.get(i).getDistance()) + " meters\nAltitude Loss: " + Double.toString(runs.get(i).getAltitudeLoss()) + " meters"
	    					+ "\nAltitude Gain: " + Double.toString(runs.get(i).getAltitudeGain()) + " meters");
	    		}
	    		importConfirmation.setText("Data imported");
	    	}
	    	
	    });
	    
	}
}