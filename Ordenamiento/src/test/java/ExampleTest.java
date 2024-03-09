import org.junit.Before;
import org.example.model.Example;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleTest {
    Example ex = new Example();
    @Before
    public void setUp(){
        for (int i = 10; 0 <=i ; i--) {
            ex.addNode(i);
        }

        ex.addNode(20);
        ex.addNode(12);
        ex.addNode(0);
    }



    @Test
    public void selectionSortTest(){
        ex.selectionSort();
        assertEquals("[0][0][1][2][3][4][5][6][7][8][9][10][12][20]",ex.printList());
    }

    @Test
    public void organizeNodesTest(){
        for (int i = 10; 0 <=i ; i--) {
            ex.organizeNodes(i);
        }

        ex.organizeNodes(20);
        ex.organizeNodes(12);
        ex.organizeNodes(0);
        assertEquals("[0][0][1][2][3][4][5][6][7][8][9][10][12][20]",ex.printList());

    }

    @Test
    public void insertInTheStartTest(){
        for (int i = 10; 0 <=i ; i--) {
            ex.insertInTheStart(i);
        }

        ex.insertInTheStart(20);
        ex.insertInTheStart(12);
        ex.insertInTheStart(0);
        assertEquals("[0][0][1][2][3][4][5][6][7][8][9][10][12][20]",ex.printList());

    }
}
