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
     */

    Main(){
        System.out.println("Test");
    }

    public static void main(String [] args){
        Main prog = new Main();
        prog.setSize(600,600);
        prog.setResizable(false);
        prog.setTitle("Orthographic Projector");
        prog.setVisible(true);
        prog.setDefaultCloseOperation(EXIT_ON_CLOSE);
        System.out.println("\n ======= This code has been provided by TheBoringEdward with the help of some fellows =======\n\n");
    }
}