package de.edward;

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame {

    /*
    This program is intended to create 3-dimensional orthographic projections, as well as allowing simple 2-dimensional projections.
    This project serves as a kind of practice and is only intended to be used as a reference for later projects, that
    may or may not include the use of a matrix.

    It is important to note, that I haven't programmed in a while, and the initial development-phase of this project is just me testing the waters.
     */

    private int dims = 0;
    private double trueCentreX = 0;
    private double trueCentreY = 0;

    Main(int dims){
        this.dims = dims;
        trueCentreX = dims / 2;
        trueCentreY = dims / 2;
    }

    // Main program
    public void run(){
        System.out.println("Test");
        Graphics g = this.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0,0,dims,dims);
        /*
        g.setColor(Color.cyan);
        g.drawLine((int) trueCentreX, (int) trueCentreY, (int) trueCentreX,10);
         */
        System.out.println("Test 2");
        ruler(g);

    }

    // Merely a ruler
    public void ruler(Graphics g){
        g.setColor(Color.black);
        int lgt = 50;
        g.drawLine((int) trueCentreX, (int) trueCentreY, (int) trueCentreX, (int) (trueCentreY - lgt));
        g.drawLine((int) trueCentreX, (int) trueCentreY, (int) trueCentreX + lgt, (int) trueCentreY);
        g.drawLine((int) trueCentreX, (int) trueCentreY, (int) trueCentreX - lgt, (int) trueCentreY + lgt); // Have to do some circle calculation here
        for (int j = lgt; j > 0; j--){
            g.drawLine((int) trueCentreX, (int) trueCentreY, (int) trueCentreX - lgt, (int) ((int) trueCentreY + Math.sqrt(lgt-(((int) trueCentreX - lgt)*((int) trueCentreX - lgt)))));
        }
    }

    @Override public void paint(Graphics g){
        setBackground(Color.white); //huh?
        run();
                        // Due to some issues w/ the Graphics thingy, I am required to run this override command.
                        // This, however, causes the project to execute several times in a row, which I foresee to cause
                        // massive issues in the future.
    }

    public static void main(String [] args){

        int dims = 600;

        Main prog = new Main(dims);
        prog.setSize(dims,dims);
        prog.setResizable(false);
        prog.setTitle("Orthographic Projector");
        prog.setVisible(true);
        prog.setDefaultCloseOperation(EXIT_ON_CLOSE);
        prog.run();
        System.out.println("\n ======= This code has been provided by TheBoringEdward with the help of some fellows =======\n\n");
    }
}