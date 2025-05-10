package ch15.sec02.exam03;

import ch15.sec02.exam01.Board;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Board> boards = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            boards.add(new Board("제목"+i, "내용"+i, "작가"+i));
        }
        System.out.println(boards.size());
        System.out.println(boards.get(2) + "\n");

        for (int i = 0; i < 5; i++) {
            System.out.println(boards.get(i));
        }
        System.out.println();

        boards.remove(2);
        for (Board board : boards) {
            System.out.println(board);
        }
        System.out.println();
    }
}
