import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyQueue extends JFrame{
    public void main() {
        //initiate the scanner and user inputs the values of each tile for the start grid and their desired grid.
        //the empty tile is set usng the hashtag key (#)
        //current grid state
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the First Row Left number of the start grid");
        String a = reader.nextLine();

        System.out.println("Enter the First Row Middle Left number of the start grid");
        String b = reader.nextLine();

        System.out.println("Enter the First Row Middle Right number of the start grid");      
        String newTopLeftMiddle = reader.nextLine();

        System.out.println("Enter the First Row Right number of the start grid");
        String c = reader.nextLine();

        System.out.println("Enter the Second Row Left number of the start grid");
        String d = reader.nextLine();

        System.out.println("Enter the Second Row Middle Left number of the start grid");
        String e = reader.nextLine();

        System.out.println("Enter the Second Row Middle Right number of the start grid");    
        String newStartSecondRow = reader.nextLine();

        System.out.println("Enter the Second Row Right number of the start grid");
        String f = reader.nextLine();

        //NEW

        System.out.println("Enter the Third row Left number of the start grid");
        String new3rdRowLeft = reader.nextLine();

        System.out.println("Enter the Third row Middle Left number of the start grid");
        String new3rdRowMiddleLeft = reader.nextLine();

        System.out.println("Enter the Third row Middle Right number of the start grid");
        String new3rdRowMiddleRight = reader.nextLine();

        System.out.println("Enter the Third row Right number of the start grid");
        String new3rdRowRight = reader.nextLine();

        //NEW

        System.out.println("Enter the Fourth Row Left number of the start grid");
        String g = reader.nextLine();

        System.out.println("Enter the Fourth Row Bottom Middle-Left number of the start grid");
        String h = reader.nextLine();

        System.out.println("Enter the Fourth Row Bottom Middle-Right number of the start grid");   
        String new4thRowMiddleRight = reader.nextLine();

        System.out.println("Enter the Fourth Row Bottom Right number of the start grid");
        String i = reader.nextLine();

        /*

        //desired tiles state
        System.out.println("Enter the First Row Left number of the desired grid");
        String l = reader.nextLine();

        System.out.println("Enter the First Row Left-Middle number of the desired grid");
        String m = reader.nextLine();

        System.out.println("Enter the First Row Right-Middle number of the desired grid");          
        String newDesiredTopMiddle = reader.nextLine();

        System.out.println("Enter the First Row Top Right number of the desired grid");
        String n = reader.nextLine();

        System.out.println("Enter the Second Row Left number of the desired grid");
        String o = reader.nextLine();

        System.out.println("Enter the Second Row Middle-Left number of the desired grid");
        String p = reader.nextLine();

        System.out.println("Enter the Second Row Middle-Right number of the desired grid");         
        String newDesiredSecondRow = reader.nextLine();

        System.out.println("Enter the Second Row Right number of the desired grid");
        String q = reader.nextLine();

        //NEW

        System.out.println("Enter the Third row Left number of the desired grid");
        String newDesiredNewRowLeft = reader.nextLine();

        System.out.println("Enter the Third row Middle-Left number of the desired grid");
        String newDesiredNewRowMiddleLeft = reader.nextLine();

        System.out.println("Enter the Third row Middle-Right number of the desired grid");
        String newDesiredNewRowMiddleRight = reader.nextLine();

        System.out.println("Enter the Third row Right number of the desired grid");
        String newDesiredNewRowRight = reader.nextLine();

        //NEW

        System.out.println("Enter the 4th Row Left number of the desired grid");
        String r = reader.nextLine();

        System.out.println("Enter the 4th Row Middle-Left number of the desired grid");
        String s = reader.nextLine();

        System.out.println("Enter the 4th Row Middle-Right number of the desired grid");       
        String newDesired4thRow = reader.nextLine();

        System.out.println("Enter the 4th Row Right number of the desired grid");
        String t = reader.nextLine();

         */

        String l = "1";
        String m = "2";
        String newDesiredTopMiddle = "3";
        String n = "4";
        String o = "5";
        String p = "6";
        String newDesiredSecondRow = "7";
        String q = "8";
        String newDesiredNewRowLeft = "9";
        String newDesiredNewRowMiddleLeft = "10";
        String newDesiredNewRowMiddleRight = "11";
        String newDesiredNewRowRight = "12";
        String r = "13";
        String s = "14";
        String newDesired4thRow = "15";
        String t = "#";
        //displays the start grid
        System.out.println("This is the start grid..." + "\n");
        System.out.println("------"+"\n"+"|"+a+b+newTopLeftMiddle+c+"|"+"\n"+"|----|"
            +"\n"+"|"+d+e+newStartSecondRow+f+"|"+"\n"+"|----|"+"\n"+

            "|"+new3rdRowLeft+new3rdRowMiddleLeft+new3rdRowMiddleRight+new3rdRowRight+"|"+"\n"+"|----|"+"\n"+

            "|"+g+h+new4thRowMiddleRight+i+"|"+"\n"+"------");

        //displays the desired grid
        System.out.println("This is the desired grid..." + "\n");
        System.out.println("------"+"\n"+"|"+l+m+newDesiredTopMiddle+n+"|"+"\n"+"|----|"
            +"\n"+"|"+o+p+newDesiredSecondRow+q+"|"+"\n"+"|----|"+"\n"+

            "|"+newDesiredNewRowLeft+newDesiredNewRowMiddleLeft+newDesiredNewRowMiddleRight+newDesiredNewRowRight+"|"+"\n"+"|----|"+"\n"+

            "|"+r+s+newDesired4thRow+t+"|"+"\n"+"------");

        String start[] = {"1","2","3","4"};
        //this array will include be the four possible movement for each tile state
        //1 = Right movement of empty tile
        //2 = Left movement of empty tile
        //3 = Down movement of empty tile
        //4 = Up movement of empty tile

        //Sets the queue myQ to a new ArrayDequeue
        Queue<String> myQ = new ArrayDeque<String>();

        for(Integer z=0;z<start.length;z++){
            //each movement of the start array will be added to the arraydequeue (e.g. Left, Right, Up, Down initial movements)
            myQ.add(start[z]);
        }

        //while the array has movements it can make, which it will forever in this case
        while(!(myQ.isEmpty())){
            //the value of the first element in the queue is set to string w
            String w = myQ.element();
            //for every possible movement from that movement. Which will always be a combination of Left or Right or Up or Down depending on the tile state
            for(Integer x=0;x<start.length;x++){
                //the new movement is added to the previous movement
                String aa = w+start[x];
                //then that combination of movements is added to the queue
                if(!(aa.contains("1111") || aa.contains("2222") || aa.contains("3333") || aa.contains("4444") || aa.contains("12") || aa.contains("21") || aa.contains("34") || aa.contains("43"))){
                    myQ.add(aa);
                    
                    String pathtaken = "";
                    for(Integer path2=0; path2<aa.length(); path2++){
                        if(aa.charAt(path2) == '1'){
                            pathtaken += "Right ";
                        }
                        if(aa.charAt(path2) == '2'){
                            pathtaken += "Left ";
                        }
                        if(aa.charAt(path2) == '3'){
                            pathtaken += "Down ";
                        }
                        if(aa.charAt(path2) == '4'){
                            pathtaken += "Up ";
                        }
                    }
                    System.out.print(pathtaken +"\n");
                    pathtaken = "";
                    
                    //next new strings are set to the start grid to allow simulation of the movement of this combination of instructions
                    //allowing the goal state to stay the same, making it easier to check if the goal state is reached in the future
                    String ga = a;
                    String gb = b; 
                    String newgbb = newTopLeftMiddle;
                    String gc = c;

                    String gd = d;
                    String ge = e;
                    String newgee = newStartSecondRow;
                    String gf = f;

                    String fake1 = new3rdRowLeft;
                    String fake2 = new3rdRowMiddleLeft;
                    String fake3 = new3rdRowMiddleRight;
                    String fake4 = new3rdRowRight;

                    String gg = g;
                    String gh = h;
                    String newghh = new4thRowMiddleRight;
                    String gi = i;
                    //String that will contain the path is initialised
                    String path = "";
                    //Next the set of instructions are applied to the new start state
                    //The grid is moved and the movement is recorded onto the path

                    for (Integer j=0;j<aa.length();j++){
                        if(aa.charAt(j) == '1'){
                            //NEW

                            if (newghh.equals("#")){
                                String k=gi;
                                gi=newghh;
                                newghh=k;
                                path += k+" left, " ;
                            }

                            //NEW
                            if (gh.equals("#")){
                                String k=newghh;
                                newghh=gh;
                                gh=k;
                                path += k+" left, " ;
                            }
                            if (gg.equals("#")){
                                String k=gh;
                                gh=gg;
                                gg=k;
                                path += k+" left, " ;
                            }
                            //NEW

                            //NEW
                            if(fake3.equals("#")){
                                String k=fake4;
                                fake4=fake3;
                                fake3=k;
                                path += k+" left, ";
                            }
                            if(fake2.equals("#")){
                                String k=fake3;
                                fake3=fake2;
                                fake2=k;
                                path += k+" left, ";
                            }
                            if(fake1.equals("#")){
                                String k=fake2;
                                fake2=fake1;
                                fake1=k;
                                path += k+" left, ";
                            }
                            //NEW

                            //NEW
                            if (newgee.equals("#")){
                                String k=gf;
                                gf=newgee;
                                newgee=k;
                                path += k+" left, " ;
                            }
                            //NEW

                            if (ge.equals("#")){
                                String k=newgee;
                                newgee=ge;
                                ge=k;
                                path += k+" left, " ;
                            }
                            if (gd.equals("#")){
                                String k=ge;
                                ge=gd;
                                gd=k;
                                path += k+" left, " ;
                            }

                            //NEW
                            if (newgbb.equals("#")){
                                String k=gc;
                                gc=newgbb;
                                newgbb=k;
                                path += k+" left, " ;
                            }
                            //NEW

                            if (gb.equals("#")){
                                String k=newgbb;
                                newgbb=gb;
                                gb=k;
                                path += k+" left, " ;
                            }
                            if (ga.equals("#")){
                                String k=gb;
                                gb=ga;
                                ga=k;
                                path += k+" left, " ;
                            }
                        }

                        if(aa.charAt(j) == '2'){
                            if (gb.equals("#")){
                                String k=ga;
                                ga=gb;
                                gb=k;
                                path += k+" right, ";
                            }

                            //NEW
                            if (newgbb.equals("#")){
                                String k=gb;
                                gb=newgbb;
                                newgbb=k;
                                path += k+" right, ";
                            }
                            //NEW

                            if (gc.equals("#")){
                                String k=newgbb;
                                newgbb=gc;
                                gc=k;
                                path += k+" right, ";
                            }

                            if (ge.equals("#")){
                                String k=gd;
                                gd=ge;
                                ge=k;
                                path += k+" right, ";
                            }

                            //NEW
                            if (newgee.equals("#")){
                                String k=ge;
                                ge=newgee;
                                newgee=k;
                                path += k+" right, ";
                            }
                            //NEW

                            if (gf.equals("#")){
                                String k=newgee;
                                newgee=gf;
                                gf=k;
                                path += k+" right, ";
                            }

                            //NEW
                            if(fake2.equals("#")){
                                String k=fake1;
                                fake1=fake2;
                                fake2=k;
                                path += k+" right, ";
                            }
                            if(fake3.equals("#")){
                                String k=fake2;
                                fake2=fake3;
                                fake3=k;
                                path += k+" right, ";
                            }
                            if(fake4.equals("#")){
                                String k=fake3;
                                fake3=fake4;
                                fake4=k;
                                path += k+" right, ";
                            }

                            //NEW

                            if (gh.equals("#")){
                                String k=gg;
                                gg=gh;
                                gh=k;
                                path += k+" right, ";
                            }

                            //NEW

                            if (newghh.equals("#")){
                                String k=gh;
                                gh=newghh;
                                newghh=k;
                                path += k+" right, ";
                            }

                            //NEW
                            if (gi.equals("#")){
                                String k=newghh;
                                newghh=gi;
                                gi=k;
                                path += k+" right, ";
                            }
                        }
                        if(aa.charAt(j) == '3'){
                            //NEW
                            if(fake1.equals("#")){
                                String k=gg;
                                gg=fake1;
                                fake1=k;
                                path += k+" up,";
                            }
                            if(fake2.equals("#")){
                                String k=gh;
                                gh=fake2;
                                fake2=k;
                                path += k+" up,";
                            }
                            if(fake3.equals("#")){
                                String k = newghh;
                                newghh=fake3;
                                fake3=k;
                                path += k+" up,";
                            }
                            if(fake4.equals("#")){
                                String k=gi;
                                gi=fake4;
                                fake4=k;
                                path += k+" up,";
                            }
                            //NEW
                            if (gf.equals("#")){
                                String k=fake4;
                                fake4=gf;
                                gf=k;
                                path += k+" up, ";
                            }
                            if (newgee.equals("#")){
                                String k=fake3;
                                fake3=newgee;
                                newgee=k;
                                path += k+" up, ";
                            }
                            if (ge.equals("#")){
                                String k=fake2;
                                fake2=ge;
                                ge=k;
                                path += k+" up, ";
                            }
                            if (gd.equals("#")){
                                String k=fake1;
                                fake1=gd;
                                gd=k;
                                path += k+" up, ";
                            }
                            if (gc.equals("#")){
                                String k=gf;
                                gf=gc;
                                gc=k;
                                path += k+" up, ";
                            }
                            if (newgbb.equals("#")){
                                String k=newgee;
                                newgee=newgbb;
                                newgbb=k;
                                path += k+" up, ";
                            }
                            if (gb.equals("#")){
                                String k=ge;
                                ge=gb;
                                gb=k;
                                path += k+" up, ";
                            }
                            if (ga.equals("#")){
                                String k=gd;
                                gd=ga;
                                ga=k;
                                path += k+" up, ";
                            }
                        }
                        if(aa.charAt(j) == '4'){
                            if (gd.equals("#")){
                                String k=ga;
                                ga=gd;
                                gd=k;
                                path += k+" down, ";
                            }
                            if (ge.equals("#")){
                                String k=gb;
                                gb=ge;
                                ge=k;
                                path += k+" down, ";
                            }
                            //NEW
                            if (newgee.equals("#")){
                                String k=newgbb;
                                newgbb=newgee;
                                newgee=k;
                                path += k+" down, ";
                            }
                            //NEW
                            if (gf.equals("#")){
                                String k=gc;
                                gc=gf;
                                gf=k;
                                path += k+" down, ";
                            }
                            //NEW
                            if (fake1.equals("#")){
                                String k=gd;
                                gd=fake1;
                                fake1=k;
                                path += k+" down, ";
                            }
                            if (fake2.equals("#")){
                                String k=ge;
                                ge=fake2;
                                fake2=k;
                                path += k+" down, ";
                            }
                            if (fake3.equals("#")){
                                String k=newgee;
                                newgee=fake3;
                                fake3=k;
                                path += k+" down, ";
                            }
                            if (fake4.equals("#")){
                                String k=gf;
                                gf=fake4;
                                fake4=k;
                                path += k+" down, ";
                            }
                            //NEW
                            if (gg.equals("#")){
                                String k=fake1;
                                fake1=gg;
                                gg=k;
                                path += k+" down, ";
                            }
                            if (gh.equals("#")){
                                String k=fake2;
                                fake2=gh;
                                gh=k;
                                path += k+" down, ";
                            }
                            if (newghh.equals("#")){
                                String k=fake3;
                                fake3=newghh;
                                newghh=k;
                                path += k+" down, ";
                            }
                            if (gi.equals("#")){
                                String k=fake4;
                                fake4=gi;
                                gi=k;
                                path += k+" down, ";
                            }
                        }
                    }
                    //after the movement of the tiles has been made if the new puzzle state matches the goal state the system will output the path it took to get there and end the programme

                    if(newgbb.equals(newDesiredTopMiddle) && newgee.equals(newDesiredSecondRow) && fake1.equals(newDesiredNewRowLeft) && fake2.equals(newDesiredNewRowMiddleLeft) && fake3.equals(newDesiredNewRowMiddleRight) && fake4.equals(newDesiredNewRowRight) && newghh.equals(newDesired4thRow) && ga.equals(l) && gb.equals(m) && gc.equals(n) && gd.equals(o) && ge.equals(p) && gf.equals(q) && gg.equals(r) && gh.equals(s) && gi.equals(t)){
                        System.out.println("PATH FOUND!" + "\n" + path);
                        return;
                    }
                    //if the new state does not match the goal state then the simulated puzzle will return back to the start state for the next search
                    //also, the path will be reset
                    if(!(newgbb.equals(newDesiredTopMiddle) && newgee.equals(newDesiredSecondRow) && fake1.equals(newDesiredNewRowLeft) && fake2.equals(newDesiredNewRowMiddleLeft) && fake3.equals(newDesiredNewRowMiddleRight) && fake4.equals(newDesiredNewRowRight) && newghh.equals(newDesired4thRow) && ga.equals(l) && gb.equals(m) && gc.equals(n) && gd.equals(o) && ge.equals(p) && gf.equals(q) && gg.equals(r) && gh.equals(s) && gi.equals(t))){

                        path = "";
                        ga=a;
                        gb=b;
                        gc=c;
                        gd=d;
                        ge=e;
                        gf=f;
                        gg=g;
                        gh=h;
                        gi=i;

                        newgbb=newTopLeftMiddle;
                        newgee=newStartSecondRow;
                        fake1=new3rdRowLeft;
                        fake2=new3rdRowMiddleLeft;
                        fake3=new3rdRowMiddleRight;
                        fake4=new3rdRowRight;
                        newghh=new4thRowMiddleRight; 
                    }
                }
            }
            //after the applied instructions have been made, if the path to the goal state has not been found then the instructions are removed fromt the queue
            myQ.poll();
        }
    }
}

