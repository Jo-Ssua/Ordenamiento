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
       ex.organizeNodes(2);
        assertEquals("[0][0][1][2][2][3][4][5][6][7][8][9][10][12][20]",ex.printList());

    }

    @Test
    public void insertionSortTest(){
        ex.insertionSort();
        assertEquals("[0][0][1][2][3][4][5][6][7][8][9][10][12][20]",ex.printList());

    }
}
