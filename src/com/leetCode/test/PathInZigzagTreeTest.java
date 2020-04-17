package leetCode.test;

import leetCode.tree.PathInZigzagTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PathInZigzagTreeTest {
    PathInZigzagTree pathInZigzagTree;

    @BeforeEach
    public void before(){
        pathInZigzagTree =new PathInZigzagTree();
    }

    @Test
    public void findPath(){

        assertEquals(pathInZigzagTree.findPath(14), Arrays.asList(1,3,4,14));
    }

}