package com.catzen;

import java.util.ArrayList;
import java.util.List;

public class Main1 {
    private static class Ball{
        public Ball() {
        }
    }
    private static class Board{
        private List<Ball> balls=new ArrayList<>();

        public Board() {
            balls.add(new Ball());
            balls.add(new Ball());
            balls.add(new Ball());
        }

        public int count(){
            return balls.size();
        }
    }
    public static void main(String args[]){
        Board board=new Board();
        System.out.println("Quantity of objects Ball in Board list is " +board.count());
    }
}
