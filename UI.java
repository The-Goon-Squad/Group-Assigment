import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
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
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
import javax.swing.JRadioButton;

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
	private JTextField fileField;

	/**
	 * Create the frame.
	 */
	
	public UI() {
		setResizable(false);
		setTitle("Activity Tracker");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1049, 780);
		
		//Set menu bar and menu bar items
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnProfile = new JMenu("Log out");
		menuBar.add(mnProfile);
		
		JMenuItem mntmEditProfile = new JMenuItem("Log out");
		mnProfile.add(mntmEditProfile);                                                                                                                                                                                        
		
		JMenu mnExit = new JMenu("Exit");
		menuBar.add(mnExit);
		
		JMenuItem mntmEit = new JMenuItem("Exit");
		mntmEit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//Create main panel with tabs
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
	    txtActivityTracker.setBounds(329, 11, 420 , 106);
	    panel_2.add(txtActivityTracker);
	    txtActivityTracker.setColumns(10);
	    
	    JButton btnNewButton_1 = new JButton("Sign in");
	    btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
	    btnNewButton_1.setBounds(460, 539, 132, 42);
	    panel_2.add(btnNewButton_1);
	    
	    
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
	    importConfirmation.setBounds(372, 270, 201, 43);
	    importPanel_1.add(importConfirmation);
	    importConfirmation.setColumns(10);
	    
	    fileField = new JTextField();
	    fileField.setBounds(241, 82, 474, 38);
	    importPanel_1.add(fileField);
	    fileField.setColumns(10);
	    
	    JTextArea txtrPlease = new JTextArea();
	    txtrPlease.setText("Please enter the /file directory ");
	    txtrPlease.setBounds(21, 88, 208, 26);
	    importPanel_1.add(txtrPlease);
	    
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
	    txtBeginningAt.setBounds(44, 72, 198, 32);
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
	    
	    //What to do when Find Data button is pressed
	    btnNewButton_2.addActionListener(new ActionListener() {
	    	
			//sdf will trim the times from the Date objects and return the desired form of date
			SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			ArrayList<Running> lst = profile.getData();
	    	public void actionPerformed(ActionEvent e) {
	    		int count = 0;
				double totalTime = 0;
				double totalDistance = 0;
				double totalCal = 0;
	    		DecimalFormat value = new DecimalFormat("#.##");
	    		runDisplayData.setText(profile.getName() + "'s runs: ");
	    		for(int i = 0; i < lst.size(); i++) {
	    			try {
						Date currentDate = sdf.parse(sdf.format(lst.get(i).getDate()));
						Date before = sdf.parse(sdf.format(dateBegin.getSelectedDate().getTime()));
						Date after = sdf.parse(sdf.format(dateEnd.getSelectedDate().getTime()));
						
						
	    			
	    			if (currentDate.after(before) && currentDate.before(after) || currentDate.equals(after) || currentDate.equals(before)) {
	    				count++;
	    				totalTime += lst.get(i).getTime();
	    				totalDistance += lst.get(i).getDistance();
	    				totalCal += lst.get(i).getCalsBurned();
	    				runDisplayData.setText(runDisplayData.getText() + "\n\nRun " + (i+1) + ":\nDate: " + sdf.format(lst.get(i).getDate()) + "\nTime : " + Double.toString(lst.get(i).getTime()/60) + 
	    					" minutes\nDistance: " +  Double.toString(lst.get(i).getDistance()) + " meters\nAltitude Loss: " + Double.toString(lst.get(i).getAltitudeLoss()) + " meters" + 
	    						"\nAltitude Gain: " + Double.toString(lst.get(i).getAltitudeGain()) + " meters" + "\nAverage Speed: " + value.format(lst.get(i).getAvgSpeed()) + " minutes per kilometer\n" +
		    					"Calories Burned: " + value.format(lst.get(i).getCalsBurned()) + " Calories");
	    			}
	    			
	    			} catch (ParseException e1) {
						e1.printStackTrace();
					}
	    			
	    		}
	    		if (count == 0) {
	    			runDisplayData.setText("No sessions found between these dates");
	    		}
	    		runDisplayData.setText(runDisplayData.getText() + "\n___________________\n" + "Average time for selected sessions: " + value.format(totalTime/count/60) + " minutes\nAverage distance: "
    					+ value.format(totalDistance/count) + " meters\nAverage Calories burned: " + value.format(totalCal/count) + " Calories\n" + "Average speed: " + value.format((totalTime/60)/(totalDistance/1000))
    					+ " minutes per kilometer");
	    		
	    	}
	    	
	    });
	    btnNewButton_2.setBounds(44, 586, 198, 40);
	    Data.add(btnNewButton_2);
	    
	    JTextArea txtrSelectTheDates = new JTextArea();
	    txtrSelectTheDates.setEditable(false);
	    txtrSelectTheDates.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
	    txtrSelectTheDates.setBackground(SystemColor.info);
	    txtrSelectTheDates.setText("Select the dates to see all data between your selections");
	    txtrSelectTheDates.setBounds(377, 115, 472, 25);
	    Data.add(txtrSelectTheDates);
	    
	    JTextArea txtrViewYourData = new JTextArea();
	    txtrViewYourData.setText("\t\tData Viewer");
	    txtrViewYourData.setEditable(false);
	    txtrViewYourData.setFont(new Font("MS Reference Sans Serif", Font.BOLD, 26));
	    txtrViewYourData.setBackground(SystemColor.activeCaption);
	    txtrViewYourData.setForeground(Color.CYAN);
	    txtrViewYourData.setBounds(22, 11, 996, 50);
	    Data.add(txtrViewYourData);
	    
	    //This panel will allow us to view statistics
	    JPanel editDatapanel = new JPanel();
	    editDatapanel.setBackground(new Color(176, 196, 222));
	    tabbedPane.addTab("Statistics", null, editDatapanel, null);
	    editDatapanel.setLayout(null);
	    
	    txtEditData = new JTextField();
	    txtEditData.setHorizontalAlignment(SwingConstants.CENTER);
	    txtEditData.setBackground(new Color(176, 196, 222));
	    txtEditData.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 50));
	    txtEditData.setEditable(false);
	    txtEditData.setText("Statistics");
	    txtEditData.setBounds(266, 11, 475, 53);
	    editDatapanel.add(txtEditData);
	    txtEditData.setColumns(10);
	    
	    JScrollPane scrollPane_2 = new JScrollPane();
	    scrollPane_2.setBounds(266, 152, 475, 328);
	    editDatapanel.add(scrollPane_2);
	    
	    JTextArea statsText = new JTextArea();
	    statsText.setEditable(false);
	    statsText.setFont(new Font("Monospaced", Font.PLAIN, 20));
	    statsText.setBackground(SystemColor.inactiveCaption);
	    scrollPane_2.setViewportView(statsText);
	    
	    //These radio buttons will allow the user to choose what statistic is displayed
	    JRadioButton rdbtnAverageSpeed = new JRadioButton("Average Speed");
	    rdbtnAverageSpeed.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		DecimalFormat value = new DecimalFormat("#.##");
	    		statsText.setText("Average Speed over all runs:\n" + value.format(profile.getAvgSpeed()) + " minutes per kilometer");	    		
	    	}
	    });
	    buttonGroup.add(rdbtnAverageSpeed);
	    rdbtnAverageSpeed.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    rdbtnAverageSpeed.setBounds(65, 180, 180, 23);
	    editDatapanel.add(rdbtnAverageSpeed);
	    
	    JRadioButton rdbtnCaloriesBurned = new JRadioButton("Calories Burned");
	    rdbtnCaloriesBurned.addActionListener(new ActionListener() {
	    	DecimalFormat value = new DecimalFormat("#.##");
	    	public void actionPerformed(ActionEvent e) {
	    		statsText.setText("Average Calories burned over all runs:\n" + value.format(profile.getAvgCalsBurned()) + " Calories");
	    	}
	    });
	    buttonGroup.add(rdbtnCaloriesBurned);
	    rdbtnCaloriesBurned.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    rdbtnCaloriesBurned.setBounds(65, 206, 180, 23);
	    editDatapanel.add(rdbtnCaloriesBurned);
	    
	    JRadioButton rdbtnAverageDistance = new JRadioButton("Average Distance");
	    rdbtnAverageDistance.addActionListener(new ActionListener() {
	    	DecimalFormat value = new DecimalFormat("#.##");
	    	public void actionPerformed(ActionEvent e) {
	    		statsText.setText("Average distance over all runs: \n" + value.format(profile.getAvgDistance()) + " meters");
	    	}
	    });
	    buttonGroup.add(rdbtnAverageDistance);
	    rdbtnAverageDistance.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    rdbtnAverageDistance.setBounds(65, 232, 180, 23);
	    editDatapanel.add(rdbtnAverageDistance);
	    
	    JRadioButton rdbtnAverageTime = new JRadioButton("Average Time");
	    rdbtnAverageTime.addActionListener(new ActionListener() {
	    	DecimalFormat value = new DecimalFormat("#.##");
	    	public void actionPerformed(ActionEvent e) {
	    		statsText.setText("Average time over all runs: \n" + value.format(profile.getAvgTime()/60) + " minutes");
	    	}
	    });
	    buttonGroup.add(rdbtnAverageTime);
	    rdbtnAverageTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
	    rdbtnAverageTime.setBounds(65, 258, 180, 28);
	    editDatapanel.add(rdbtnAverageTime);
	    
	    JTextArea txtrSelectAStatistic = new JTextArea();
	    txtrSelectAStatistic.setEditable(false);
	    txtrSelectAStatistic.setFont(new Font("MS Reference Sans Serif", Font.PLAIN, 16));
	    txtrSelectAStatistic.setBackground(SystemColor.info);
	    txtrSelectAStatistic.setText("Select a statistic to display.");
	    txtrSelectAStatistic.setBounds(10, 127, 246, 46);
	    editDatapanel.add(txtrSelectAStatistic);
	    
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
	    btnRemoveFriend.setBounds(316, 444, 150, 23);
	    friendsPanel.add(btnRemoveFriend);
	    
	    JButton btnNewButton = new JButton("Add Friend");
	    btnNewButton.setBounds(514, 444, 150, 23);
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
	    
	    /*Username and profile picture for profile screen*/
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
	    

	    //preferred user activities in profile screen
	    JTextArea txtrSectionShowingUsers = new JTextArea();
	    txtrSectionShowingUsers.setFont(new Font("Tahoma", Font.PLAIN, 13));
	    txtrSectionShowingUsers.setBackground(new Color(0, 191, 255));
	    txtrSectionShowingUsers.setEditable(false);
	    txtrSectionShowingUsers.setText("Section showing user's \r\npreferred activities");
	    txtrSectionShowingUsers.setBounds(10, 340, 323, 256);
	    panel_1.add(txtrSectionShowingUsers);
	 
	    //The graph on the profile screen
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
	    
	    //update the runs section of the profile screen when data is imported
	    btnImport.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		profile.importData(fileField.getText());
	    		DecimalFormat value = new DecimalFormat("#.#");
	    		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	    		ArrayList<Running> runs= profile.getData();

	    		for(int i = 0; i < runs.size(); i++){
	    			importedData.setText(importedData.getText() + "\n\nRun " + (i+1) + ":\nDate: " + sdf.format(runs.get(i).getDate()) + "\nTime : " + Double.toString(runs.get(i).getTime()/60) + 
	    					" minutes\nDistance: " +  Double.toString(runs.get(i).getDistance()) + " meters\nAltitude Loss: " + Double.toString(runs.get(i).getAltitudeLoss()) + " meters"
	    					+ "\nAltitude Gain: " + Double.toString(runs.get(i).getAltitudeGain()) + " meters" + "\nAverage Speed: " + value.format(runs.get(i).getAvgSpeed()) + " minutes per kilometer\n" +
	    					"Calories Burned: " + value.format(runs.get(i).getCalsBurned()) + " Calories");
	    		}
	    		importConfirmation.setText("Data imported");
	    	}
	    	
	    });
	    
	}
}