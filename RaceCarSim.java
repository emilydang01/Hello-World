//Emily Dang
//March 22, 2018
//Racecar Game
//Cars move according to assigned random generated number. Players choose the car they think will go the farthest.
package racecarsim;

import java.awt.image.BufferedImage;
import java.io.File; 
import java.io.IOException;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class RaceCarSim {

    public static void main(String[] args) throws IOException, InterruptedException {
        //Car Variables
        int randcar = 0;
        int randcar2 = 0;
        int randcar3 = 0;
        int randcar4 = 0;

        //Image Intro
        BufferedImage img = ImageIO.read(new File("Images/race.jfif"));
        ImageIcon icon = new ImageIcon(img);

        //Welcome window
        JOptionPane.showMessageDialog(null, new JLabel("Welcome to Beat the Race!", icon, JLabel.LEFT), "Welcome", JOptionPane.INFORMATION_MESSAGE);
        String multi = JOptionPane.showInputDialog("Would you like to play single player or multiplayer? Type 1 for single player or 2 for multiplayer.");

        //Recognizes single player game
        if (multi.equals("1")) {

            //Options box
            String[] choices = {"Green Car", "Orange Car", "Blue Car", "Purple Car"};
            String input = (String) JOptionPane.showInputDialog(null, "Pick the car you think will get to the end first!",
                    "Beat the Race", JOptionPane.QUESTION_MESSAGE, null,
                    choices,
                    choices[1]);

            //Creates new JFrame
            JFrame freGame = new JFrame();
            //Ends program when JFrame is closed
            freGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //Set JFrame size
            freGame.setSize(1900, 1200);
            freGame.setLayout(null);
            
            //Add picture (car 1)
            //Create a label
            JLabel labelRace1 = new JLabel();
            labelRace1.setIcon(new ImageIcon("Images/racecar1.jfif"));
            freGame.add(labelRace1);
            
            //car 2
            JLabel labelRace2 = new JLabel();
            labelRace2.setIcon(new ImageIcon("Images/racecar2.jfif"));
            freGame.add(labelRace2);

            //car 3 
            JLabel labelRace3 = new JLabel();
            labelRace3.setIcon(new ImageIcon("Images/racecar3.png"));
            freGame.add(labelRace3);

            //car 4
            JLabel labelRace4 = new JLabel();
            labelRace4.setIcon(new ImageIcon("Images/racecar4.jfif"));
            freGame.add(labelRace4);

             //background
            JLabel background = new JLabel();
            background.setIcon(new ImageIcon("Images/road100.jpg"));
            background.setBounds ((0), (0), background.getPreferredSize().width, background.getPreferredSize().height);
            freGame.add(background);
            
            //flag
            JLabel flag = new JLabel();
            flag.setIcon(new ImageIcon("Images/flag3.jpg"));
            flag.setBounds ((1700), (0), background.getPreferredSize().width, background.getPreferredSize().height);
            freGame.add(flag);

            freGame.setVisible(true);

            //Moves position of car on screen
            Random r = new Random();
            do {
                randcar = randcar + r.nextInt(30);
                labelRace1.setBounds((randcar), (100), labelRace1.getPreferredSize().width, labelRace1.getPreferredSize().height);
                randcar2 = randcar2 + r.nextInt(30);
                labelRace2.setBounds((randcar2), (300), labelRace1.getPreferredSize().width, labelRace1.getPreferredSize().height);
                randcar3 = randcar3 + r.nextInt(30);
                labelRace3.setBounds((randcar3), (500), labelRace1.getPreferredSize().width, labelRace1.getPreferredSize().height);
                randcar4 = randcar4 + r.nextInt(30);
                labelRace4.setBounds((randcar4), (700), labelRace1.getPreferredSize().width, labelRace1.getPreferredSize().height);

                //Intervals between next move
                Thread.sleep(60);
            } while (randcar < 1300 && randcar2 < 1300 && randcar3 < 1300 && randcar4 < 1300);

            //Tells player if the win or don't win
            if (input.equals("Green Car") && randcar >= 1300 || input.equals("Orange Car") && randcar2 >= 1300 || input.equals("Blue Car") && randcar3 >= 1300
                    || input.equals("Purple Car") && randcar4 >= 1300) {
                JOptionPane.showMessageDialog(null, "Congrats! You have won");
            } else {
                JOptionPane.showMessageDialog(null, "You didn't win.");
            }
        } //Multiplayer version (Player 1 option)
        else if (multi.equals("2")) {
            String[] choices1 = {"Green Car", "Orange Car", "Blue Car", "Purple Car"};
            String input1 = (String) JOptionPane.showInputDialog(null, "Player 1: Pick the car you think will get to the end first!",
                    "Beat the Race", JOptionPane.QUESTION_MESSAGE, null,
                    choices1,
                    choices1[1]);
            
            //(Player 2 option)
            String[] choices2 = {"Green Car", "Orange Car", "Blue Car", "Purple Car"};
            String input2 = (String) JOptionPane.showInputDialog(null, "Player 2: Pick the car you think will get to the end first!",
                    "Beat the Race", JOptionPane.QUESTION_MESSAGE, null,
                    choices2,
                    choices2[1]);

            //Creates new JFrame
            JFrame freGame2 = new JFrame();
            //Ends program when JFrame is closed
            freGame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //Set JFrame size
            freGame2.setSize(1900, 1200);
            freGame2.setLayout(null);

            //Add picture (car 1)
            //Create a label
            JLabel labelRace11 = new JLabel();
            labelRace11.setIcon(new ImageIcon("Images/racecar1.jfif"));
            freGame2.add(labelRace11);

            //car 2
            JLabel labelRace22 = new JLabel();
            labelRace22.setIcon(new ImageIcon("Images/racecar2.jfif"));
            freGame2.add(labelRace22);

            //car 3 
            JLabel labelRace33 = new JLabel();
            labelRace33.setIcon(new ImageIcon("Images/racecar3.png"));
            freGame2.add(labelRace33);

            //car 4
            JLabel labelRace44 = new JLabel();
            labelRace44.setIcon(new ImageIcon("Images/racecar4.jfif"));
            freGame2.add(labelRace44);
            
              //background
            JLabel background = new JLabel();
            background.setIcon(new ImageIcon("Images/road100.jpg"));
            background.setBounds ((0), (0), background.getPreferredSize().width, background.getPreferredSize().height);
            freGame2.add(background);
            
             //flag
            JLabel flag = new JLabel();
            flag.setIcon(new ImageIcon("Images/flag3.jpg"));
            flag.setBounds ((1700), (0), background.getPreferredSize().width, background.getPreferredSize().height);
            freGame2.add(flag);
            
            freGame2.setVisible(true);

            //Moves position of car on screen
            Random rr = new Random();
            do {
                randcar = randcar + rr.nextInt(30);
                labelRace11.setBounds((randcar), (100), labelRace11.getPreferredSize().width, labelRace11.getPreferredSize().height);
                randcar2 = randcar2 + rr.nextInt(30);
                labelRace22.setBounds((randcar2), (300), labelRace22.getPreferredSize().width, labelRace22.getPreferredSize().height);
                randcar3 = randcar3 + rr.nextInt(30);
                labelRace33.setBounds((randcar3), (500), labelRace33.getPreferredSize().width, labelRace33.getPreferredSize().height);
                randcar4 = randcar4 + rr.nextInt(30);
                labelRace44.setBounds((randcar4), (700), labelRace44.getPreferredSize().width, labelRace44.getPreferredSize().height);

                //Intervals between next move
                Thread.sleep(60);
            } while (randcar < 1300 && randcar2 < 1300 && randcar3 < 1300 && randcar4 < 1300);

            //Tells player if they win (Player 1)
            if (input1.equals("Green Car") && randcar >= 1300 || input1.equals("Orange Car") && randcar2 >= 1300 || input1.equals("Blue Car") && randcar3 >= 1300
                    || input1.equals("Purple Car") && randcar4 >= 1300) {
                JOptionPane.showMessageDialog(null, "Player 1: Congrats! You have won");
            } else {
                JOptionPane.showMessageDialog(null, "Player 1: You didn't win.");
            }

            //Tells player if they win (player 2)
            if (input2.equals("Green Car") && randcar >= 1300 || input2.equals("Orange Car") && randcar2 >= 1300 || input2.equals("Blue Car") && randcar3 >= 1300
                    || input2.equals("Purple Car") && randcar4 >= 1300) {
                JOptionPane.showMessageDialog(null, "Player 2: Congrats! You have won");
            } else {
                JOptionPane.showMessageDialog(null, "Player 2: You didn't win.");
            }
        }
    }
}
