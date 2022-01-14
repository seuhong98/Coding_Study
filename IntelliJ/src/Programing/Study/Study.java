package Programing.Study;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.DecimalFormat;
import java.util.*;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;



public class Study extends JFrame implements ActionListener, WindowListener{
    static Timer timer = new Timer();
    static boolean start=false;
    static int hour;
    static int min;
    static int sec;
    JButton b1,b2;
    static JLabel label;
    static JLabel howmany;
    JLabel space1, space2,space3;
    JPanel p;
    public Study() {
        setSize(300,100);
        setTitle("공부하기");

        p = new JPanel();
        b1 = new JButton("공부 시작");
        b2 = new JButton("공부 일시 정지");
        space1 = new JLabel("        ");
        space2 = new JLabel("        ");
        space3 = new JLabel("        ");
        b1.addActionListener(this);//이벤트메소드호출
        b2.addActionListener(this);//이벤트메소드호출

        p.add(b1);
        p.add(space1);
        p.add(b2);
       // p.add(space2);
        p.add(label);
        p.add(space3);
        p.add(howmany);
        add(p);
        setVisible(true);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                writefile(hour+":"+min+":"+sec);
                System.exit(0);
            }
        });

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            p.setBackground(Color.white);
            timer = new Timer();
            doing();
        }else if(e.getSource()==b2) {
            timer.cancel();
            p.setBackground(Color.pink);
        }
    }


    public void doing(){
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                addtime();
                label.setText(hour+":"+min+":"+sec);
            }
        };
        timer.schedule(task,0l,1000l);

    }

    public void addtime(){
        sec++;
        if(sec>=60){
            sec=0;
            min++;
            if(min>=60){
                min=0;
                hour++;
            }
        }
        howmany.setText(new DecimalFormat("#.#####").format((double) (hour*60*60+min*60+sec)/(double)36000000) +"%");
    }

    public static void main(String[] args) {
        readfile();
        label = new JLabel(hour+":"+min+":"+sec);
        howmany = new JLabel(new DecimalFormat("#.#####").format((double) (hour*60*60+min*60+sec)/(double)36000000) +"%");
        Study study = new Study();
    }

    public static void writefile(String time){
        try {
            File folder = new File("C:\\StudyTime");
            if(!folder.exists()){
                folder.mkdir();
            }
            File file = new File("C:\\StudyTime\\time.txt") ;
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file) ;
            fw.write(time);
            fw.flush();
            fw.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }



    public static void readfile(){
        File file = new File("C:\\StudyTime\\time.txt") ;
        if(!file.exists()) {
            //없음
            hour=0;
            min=0;
            sec=0;
        }else {
            String line = "";
            String re="";
            try {
                FileReader filereader = new FileReader(file);
                BufferedReader bufReader = new BufferedReader(filereader);
                while((line = bufReader.readLine()) != null){
                    re=line;
                }
                bufReader.close();
                System.out.println(re);
                byint(re);
            }catch (Exception e){
            }

        }
    }

    public static void byint(String in){
        int arr[]= new int[3];
        String temp[] =in.split(":");
        hour=Integer.parseInt(temp[0]);
        min=Integer.parseInt(temp[1]);
        sec=Integer.parseInt(temp[2]);
    }


    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
