
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sudokuplayer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author adamschilperoort
 */
class Sudoku {

    private char[][]grid;

    public Sudoku(){
        grid= new char[9][9];
        for(int i=0 ; i<9; i++){
            for(int j=0; j<9; j++){
                grid[i][j] = ' ';
            }
        }
}

    public void getSquare(int row, int col){

    }
    public void setSquare( int row, int col, char value){
            grid[row][col]=value;

    }


    public boolean isValid(){
            return isCharsValid() &&
            return isRowsValid() &&
            return isColsValid() &&
            return isSolved()
    }

    private boolean isCharsValid(){

    }

    public boolean isRowsValid(){
        for()
            String check ="";
                for()
                       char val = grid[][]
                       if(val=='')
                       elif(check.contains(val)
                       else
                        check +=val
    }

    public boolean isColsValid(){

    }


    public void boolean isSolved( ){

            public Sudoku(String start_config){
                String[] = start_config.split("\n");
                grid = new char[9][9];
                for(){
                       for(){
                            grid[i][j] = sr[i].chat[j];
                        }
                }
            }



    }

//get square, 
