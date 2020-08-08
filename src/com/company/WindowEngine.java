package com.company;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.AbstractAction;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class WindowEngine extends JFrame {
    public JButton button1x1;
    public JButton button1x2;
    public JButton button1x3;
    public JButton button1x4;
    public JButton button1x5;
    public JButton button1x6;
    public JButton button1x7;
    public JButton button1x8;
    public JButton button1x9;
    public JButton button2x1;
    public JButton button2x2;
    public JButton button2x3;
    public JButton button2x4;
    public JButton button2x5;
    public JButton button2x6;
    public JButton button2x7;
    public JButton button2x8;
    public JButton button2x9;
    public JButton button3x1;
    public JButton button3x2;
    public JButton button3x3;
    public JButton button3x4;
    public JButton button3x5;
    public JButton button3x6;
    public JButton button3x7;
    public JButton button3x8;
    public JButton button3x9;
    public Color color;
    Font fontForButton;
    Font fontHomePage;

    public WindowEngine() {
        this.color = Color.WHITE;
        this.fontForButton = new Font("Verdana", 1, 15);
        this.fontHomePage = new Font("Italic", 1, 40);
        this.setTitle("YouTube TOP");
        final JPanel vkladka1 = new JPanel();
        vkladka1.setBackground(Color.WHITE);
        final JPanel vkladka2 = new JPanel();
        vkladka2.setBackground(Color.WHITE);
        final JPanel vkladka3 = new JPanel();
        vkladka3.setBackground(Color.WHITE);
        final JPanel vkladka4 = new JPanel();
        vkladka3.setBackground(Color.WHITE);
        final JPanel vkladka5 = new JPanel();
        vkladka3.setBackground(Color.WHITE);
        JMenu menu = new JMenu("Menu");
        JMenu menu2 = new JMenu("Options");
        JMenu menu3 = new JMenu("About");
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        menuBar.add(menu);
        menuBar.add(menu2);
        menuBar.add(menu3);
        JMenuItem menuItem = new JMenuItem("\nBackground color");
        JMenuItem menuItem2 = new JMenuItem("Description");
        JMenuItem menuItem3 = new JMenuItem("Developer");
        JMenuItem menuItem4 = new JMenuItem("Closed program");
        menu.add(menuItem4);
        menu2.add(menuItem);
        menu3.add(menuItem2);
        menu3.add(menuItem3);
        Icon iconButton2 = new ImageIcon(this.getClass().getResource("pictures/1.png"));
        this.button1x1 = new JButton("CS50", iconButton2);
        this.button1x1.setToolTipText("Link to URL");
        this.button1x1.setCursor(new Cursor(12));
        this.button1x1.setFont(this.fontForButton);
        this.button1x1.setForeground(Color.RED);
        this.button1x1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/user/cs50tv/featured")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka2.add(this.button1x1);
        Icon iconButton3 = new ImageIcon(this.getClass().getResource("pictures/2.png"));
        this.button1x2 = new JButton("SPS", iconButton3);
        this.button1x2.setToolTipText("Link URL");
        this.button1x2.setCursor(new Cursor(12));
        this.button1x2.setFont(this.fontForButton);
        this.button1x2.setForeground(Color.RED);
        this.button1x2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/channel/UCsgnWX-HU2BIS7B-QMzPcfQ")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka2.add(this.button1x2);
        Icon iconButton4 = new ImageIcon(this.getClass().getResource("pictures/5.png"));
        this.button1x3 = new JButton("Utopia Show", iconButton4);
        this.button1x3.setToolTipText("Link to URL");
        this.button1x3.setCursor(new Cursor(12));
        this.button1x3.setFont(this.fontForButton);
        this.button1x3.setForeground(Color.RED);
        this.button1x3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/channel/UC8M5YVWQan_3Elm-URehz9w")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka2.add(this.button1x3);
        Icon iconButton5 = new ImageIcon(this.getClass().getResource("pictures/6.png"));
        this.button1x4 = new JButton("SciOne", iconButton5);
        this.button1x4.setToolTipText("Link to URL");
        this.button1x4.setCursor(new Cursor(12));
        this.button1x4.setFont(this.fontForButton);
        this.button1x4.setForeground(Color.RED);
        this.button1x4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/channel/UCSaVoRErW4kqKsDqExs2MXA")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka2.add(this.button1x4);
        Icon iconButton6 = new ImageIcon(this.getClass().getResource("pictures/vert dider.png"));
        this.button1x5 = new JButton("Vert Dider", iconButton6);
        this.button1x5.setToolTipText("link to URL");
        this.button1x5.setCursor(new Cursor(12));
        this.button1x5.setFont(this.fontForButton);
        this.button1x5.setForeground(Color.RED);
        this.button1x5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/results?search_query=vert+dider")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka2.add(this.button1x5);
        Icon iconButton7 = new ImageIcon(this.getClass().getResource("pictures/9.png"));
        this.button1x9 = new JButton("VoicePower", iconButton7);
        this.button1x9.setToolTipText("Link to URL");
        this.button1x9.setCursor(new Cursor(12));
        this.button1x9.setFont(this.fontForButton);
        this.button1x9.setForeground(Color.RED);
        this.button1x5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/channel/UChh4KdOL_b1D5oc3yJiaq6A/featured")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka2.add(this.button1x9);
        Icon iconButton8 = new ImageIcon(this.getClass().getResource("pictures/10.png"));
        this.button1x8 = new JButton("Set Up", iconButton8);
        this.button1x8.setToolTipText("Link to URL");
        this.button1x8.setCursor(new Cursor(12));
        this.button1x8.setFont(this.fontForButton);
        this.button1x8.setForeground(Color.RED);
        this.button1x8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/channel/UCRSVV9S92vfCq4HZGn5AsOQ")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka2.add(this.button1x8);
        Icon iconButton9 = new ImageIcon(this.getClass().getResource("pictures/11.png"));
        this.button1x7 = new JButton("Trach Smach", iconButton9);
        this.button1x7.setToolTipText("Link to URL");
        this.button1x7.setCursor(new Cursor(12));
        this.button1x7.setFont(this.fontForButton);
        this.button1x7.setForeground(Color.RED);
        this.button1x7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/user/TrashRecord")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka2.add(this.button1x7);
        Icon iconButton10 = new ImageIcon(this.getClass().getResource("pictures/12.png"));
        this.button1x6 = new JButton("Skiens", iconButton10);
        this.button1x6.setToolTipText("Link to URL");
        this.button1x6.setCursor(new Cursor(12));
        this.button1x6.setFont(this.fontForButton);
        this.button1x6.setForeground(Color.RED);
        this.button1x6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/channel/UCaY08MNW5C097-0je7xT6fA")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka2.add(this.button1x6);
        Icon iconButton11 = new ImageIcon(this.getClass().getResource("pictures/13.png"));
        this.button2x1 = new JButton("Stronger", iconButton11);
        this.button2x1.setToolTipText("Link to URL");
        this.button2x1.setCursor(new Cursor(12));
        this.button2x1.setFont(this.fontForButton);
        this.button2x1.setForeground(Color.RED);
        this.button2x1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/channel/UC7DFMwmTVwwSO2E5vs2GgQw")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka3.add(this.button2x1);
        Icon iconButton12 = new ImageIcon(this.getClass().getResource("pictures/14.png"));
        this.button2x2 = new JButton("ArmMan", iconButton12);
        this.button2x2.setToolTipText("Link to URL");
        this.button2x2.setCursor(new Cursor(12));
        this.button2x2.setFont(this.fontForButton);
        this.button2x2.setForeground(Color.RED);
        this.button2x2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/user/BrinVIDEO")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka3.add(this.button2x2);
        Icon iconButton13 = new ImageIcon(this.getClass().getResource("pictures/15.png"));
        this.button2x3 = new JButton("TGYM", iconButton13);
        this.button2x3.setToolTipText("Link to URL");
        this.button2x3.setCursor(new Cursor(12));
        this.button2x3.setFont(this.fontForButton);
        this.button2x3.setForeground(Color.RED);
        this.button2x3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/user/TheTGym")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka3.add(this.button2x3);
        Icon iconButton14 = new ImageIcon(this.getClass().getResource("pictures/16.png"));
        this.button2x4 = new JButton("GymFit INFO", iconButton14);
        this.button2x4.setToolTipText("Link to URL");
        this.button2x4.setCursor(new Cursor(12));
        this.button2x4.setFont(this.fontForButton);
        this.button2x4.setForeground(Color.RED);
        this.button2x4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/channel/UCWfukvhzGWMtu0LBm99gXxA")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka3.add(this.button2x4);
        Icon iconButton15 = new ImageIcon(this.getClass().getResource("pictures/17.png"));
        this.button2x5 = new JButton("GoB Channel", iconButton15);
        this.button2x5.setToolTipText("Link to URL");
        this.button2x5.setCursor(new Cursor(12));
        this.button2x5.setFont(this.fontForButton);
        this.button2x5.setForeground(Color.RED);
        this.button2x5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/channel/UCc2UzuPHYQytHnsZXo0xkVQ")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka3.add(this.button2x5);
        Icon iconButton16 = new ImageIcon(this.getClass().getResource("pictures/18.png"));
        this.button2x6 = new JButton("Sportfaza", iconButton16);
        this.button2x6.setToolTipText("Link to URL");
        this.button2x6.setCursor(new Cursor(12));
        this.button2x6.setFont(this.fontForButton);
        this.button2x6.setForeground(Color.RED);
        this.button2x6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/channel/UCLN-c4TbT-O5bYA-2tptALw")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka3.add(this.button2x6);
        Icon iconButton17 = new ImageIcon(this.getClass().getResource("pictures/19.png"));
        this.button2x7 = new JButton("Body Mania", iconButton17);
        this.button2x7.setToolTipText("Link to URL");
        this.button2x7.setCursor(new Cursor(12));
        this.button2x7.setFont(this.fontForButton);
        this.button2x7.setForeground(Color.RED);
        this.button2x7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/user/bodymaniaa")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka3.add(this.button2x7);
        Icon iconButton18 = new ImageIcon(this.getClass().getResource("pictures/21.png"));
        this.button2x8 = new JButton("VeryStrong", iconButton18);
        this.button2x8.setToolTipText("Link to URL");
        this.button2x8.setCursor(new Cursor(12));
        this.button2x8.setFont(this.fontForButton);
        this.button2x8.setForeground(Color.RED);
        this.button2x8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/user/fitnessstoliarov")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka3.add(this.button2x8);
        Icon iconButton19 = new ImageIcon(this.getClass().getResource("pictures/20.png"));
        this.button2x9 = new JButton("your fit", iconButton19);
        this.button2x9.setToolTipText("Link to URL");
        this.button2x9.setCursor(new Cursor(12));
        this.button2x9.setFont(this.fontForButton);
        this.button2x9.setForeground(Color.RED);
        this.button2x9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/channel/UC6Qkbg501AQodtwDGiEQR_Q")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka3.add(this.button2x9);
        Icon iconButton20 = new ImageIcon(this.getClass().getResource("pictures/30.png"));
        this.button3x1 = new JButton("FailArmy", iconButton20);
        this.button3x1.setToolTipText("Link to URL");
        this.button3x1.setCursor(new Cursor(12));
        this.button3x1.setFont(this.fontForButton);
        this.button3x1.setForeground(Color.RED);
        this.button3x1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/user/failarmy")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka4.add(this.button3x1);
        Icon iconButton21 = new ImageIcon(this.getClass().getResource("pictures/22.png"));
        this.button3x2 = new JButton("SA Wardega", iconButton21);
        this.button3x2.setToolTipText("Link to URL");
        this.button3x2.setCursor(new Cursor(12));
        this.button3x2.setFont(this.fontForButton);
        this.button3x2.setForeground(Color.RED);
        this.button3x2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/channel/UCdZwMpK-iWqCos46xPscDeg")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka4.add(this.button3x2);
        Icon iconButton22 = new ImageIcon(this.getClass().getResource("pictures/23.png"));
        this.button3x3 = new JButton("Break Pranks", iconButton22);
        this.button3x3.setToolTipText("Link to URL");
        this.button3x3.setCursor(new Cursor(12));
        this.button3x3.setFont(this.fontForButton);
        this.button3x3.setForeground(Color.RED);
        this.button3x3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/user/break")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka4.add(this.button3x3);
        Icon iconButton23 = new ImageIcon(this.getClass().getResource("pictures/24.png"));
        this.button3x4 = new JButton("Darvin St", iconButton23);
        this.button3x4.setToolTipText("Link to URL");
        this.button3x4.setCursor(new Cursor(12));
        this.button3x4.setFont(this.fontForButton);
        this.button3x4.setForeground(Color.RED);
        this.button3x4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/channel/UCeHjNIOPCmR6BCYixiozzQQ")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka4.add(this.button3x4);
        Icon iconButton24 = new ImageIcon(this.getClass().getResource("pictures/25.png"));
        this.button3x5 = new JButton("Pr Network", iconButton24);
        this.button3x5.setToolTipText("Link to URL");
        this.button3x5.setCursor(new Cursor(12));
        this.button3x5.setFont(this.fontForButton);
        this.button3x5.setForeground(Color.RED);
        this.button3x5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/channel/UCxY6aVCtHoVNkqBa5iYuyow")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka4.add(this.button3x5);
        Icon iconButton25 = new ImageIcon(this.getClass().getResource("pictures/26.png"));
        this.button3x6 = new JButton("FreddyFairhair", iconButton25);
        this.button3x6.setToolTipText("Link to URL");
        this.button3x6.setCursor(new Cursor(12));
        this.button3x6.setFont(this.fontForButton);
        this.button3x6.setForeground(Color.RED);
        this.button3x6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/user/FreddyFairhair")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka4.add(this.button3x6);
        Icon iconButton26 = new ImageIcon(this.getClass().getResource("pictures/27.png"));
        this.button3x7 = new JButton("DM Pranks", iconButton26);
        this.button3x7.setToolTipText("Link to URL");
        this.button3x7.setCursor(new Cursor(12));
        this.button3x7.setFont(this.fontForButton);
        this.button3x7.setForeground(Color.RED);
        this.button3x7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/channel/UCwrfRCqA9wvqp9zCvzLl6Sw")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka4.add(this.button3x7);
        Icon iconButton27 = new ImageIcon(this.getClass().getResource("pictures/28.png"));
        this.button3x8 = new JButton("Friz Channel", iconButton27);
        this.button3x8.setToolTipText("Link to URL");
        this.button3x8.setCursor(new Cursor(12));
        this.button3x8.setFont(this.fontForButton);
        this.button3x8.setForeground(Color.RED);
        this.button3x8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/user/StudioFreeZe")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka4.add(this.button3x8);
        Icon iconButton28 = new ImageIcon(this.getClass().getResource("pictures/29.png"));
        this.button3x9 = new JButton("Whatever", iconButton28);
        this.button3x9.setToolTipText("Link to URL");
        this.button3x9.setCursor(new Cursor(12));
        this.button3x9.setFont(this.fontForButton);
        this.button3x9.setForeground(Color.RED);
        this.button3x9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse((new URL("https://www.youtube.com/user/whatever")).toURI());
                } catch (Exception var3) {
                }

            }
        });
        vkladka4.add(this.button3x9);
        JTabbedPane vkladki = new JTabbedPane();
        this.getContentPane().add(vkladki);
        menuItem.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                WindowEngine.this.color = JColorChooser.showDialog((Component)null, "Select Background Colors", WindowEngine.this.color);
                if (WindowEngine.this.color == null) {
                    WindowEngine.this.color = Color.WHITE;
                }

                vkladka1.setBackground(WindowEngine.this.color);
                vkladka2.setBackground(WindowEngine.this.color);
                vkladka3.setBackground(WindowEngine.this.color);
                vkladka4.setBackground(WindowEngine.this.color);
                vkladka5.setBackground(WindowEngine.this.color);
            }
        });
        menuItem2.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog((Component)null, "   This program create\n   for quick access to YouTube\n   channels that are in the opinion\n   the author are the best.\n                     v. 0.1\n      IntelliJ IDEA 1.8.0_152 ");
            }
        });
        menuItem3.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog((Component)null, "              Niko Papchenko\n       ");
            }
        });
        menuItem4.addActionListener(new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                System.exit(1);
            }
        });
        new ImageIcon(this.getClass().getResource("pictures/1.png"));
        JLabel label = new JLabel("THE YOUTUBE TOP");
        label.setFont(this.fontHomePage);
        JPanel pane = new JPanel();
        JPanel pane2 = new JPanel();
        JPanel pane3 = new JPanel();
        JPanel pane4 = new JPanel();
        vkladka1.add(pane, label);
        vkladka1.add(pane3, label);
        pane.setBackground(Color.RED);
        pane2.setBackground(Color.RED);
        pane3.setBackground(Color.RED);
        pane4.setBackground(Color.RED);
        vkladka1.setLayout(new GridBagLayout());
        vkladka1.add(label);
        vkladka1.add(pane2);
        vkladka1.add(pane4);
        vkladki.addTab("           Main            ", vkladka1);
        vkladki.addTab("           Science            ", vkladka2);
        vkladki.addTab("           Sport            ", vkladka3);
        vkladki.addTab("           Entertainment            ", vkladka4);
    }
}
