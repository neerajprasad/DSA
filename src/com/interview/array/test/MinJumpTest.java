package interview.array.test;

import interview.array.MinJump;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinJumpTest {

    @Test
    void minJumpUtil() {
        int[] arr = {0};
        assertEquals(MinJump.minJumpUtil(arr),0);
    }
    @Test
    void minJumpUtil1() {
        int[] arr = {0, 46, 46, 0, 2, 47, 1, 24, 45, 0, 0, 24, 18, 29, 27, 11, 0, 0, 40, 12, 4, 0, 0, 0, 49, 42, 13, 5, 12, 45, 10, 0, 29, 11, 22, 15, 17, 41, 34, 23, 11, 35, 0, 18, 47, 0, 38, 37, 3, 37, 0, 43, 50, 0, 25, 12, 0, 38, 28, 37, 5, 4, 12, 23, 31, 9, 26, 19, 11, 21, 0, 0, 40, 18, 44, 0, 0, 0, 0, 30, 26, 37, 0, 26, 39, 10, 1, 0, 0, 3, 50, 46, 1, 38, 38, 7, 6, 38, 27, 7, 25, 30, 0, 0, 36, 37, 6, 39, 40, 32, 41, 12, 3, 44, 44, 39, 2, 26, 40, 36, 35, 21, 14, 41, 48, 50, 21, 0, 0, 23, 49, 21, 11, 27, 40, 47, 49};
        assertEquals(MinJump.minJumpUtil(arr),-1);
    }
    @Test
    void minJumpUtil2() {
        int[] arr = {23, 18, 19, 17, 41, 0, 22, 0, 15, 48, 5, 0, 25, 29, 33, 16, 35, 0, 45, 46, 37, 46, 13, 0, 9, 0, 47, 26, 0, 46, 33, 0, 40, 20, 42, 18, 7, 0, 20, 0, 31, 17, 34, 0, 0, 18, 0, 6, 16, 7, 23, 0, 13, 46, 49, 33, 43, 15, 18, 29, 40, 42, 50, 2, 37, 0, 13, 0, 49, 4, 34, 47, 34, 48, 0, 0, 0, 49, 22, 0, 1, 35, 47, 33, 3, 19, 23, 39, 0, 14, 9, 0, 4, 7, 26, 0, 6, 31, 0, 13, 44, 0, 1, 49, 5, 40, 50, 4, 0, 13, 38, 35, 0, 0, 48, 0, 35, 26, 0, 47, 38, 35, 0, 0, 0, 16, 0, 33, 9, 29, 39, 38, 44, 25, 0, 0, 50, 13, 0, 44, 11, 1, 0, 45, 0, 11, 37, 0, 28, 23, 4, 7, 0, 0, 29, 44, 0, 29, 0, 0, 25, 40, 0, 0, 47, 12, 4, 35, 46, 40, 5, 47, 35, 3, 27, 0, 44, 22, 48, 45, 32, 30, 0, 13, 0, 0, 4, 9, 0, 20, 43, 37, 0, 39, 46, 29, 33, 21, 50, 0, 19, 36, 0, 6, 45, 21, 0, 40, 0, 0, 50, 4, 0, 32, 0, 28, 0, 44, 18, 30, 32, 0, 12, 10, 0, 0, 8, 43, 0, 37, 48, 0, 14, 11, 23, 27, 29, 44, 21, 1, 0, 0, 0, 30, 24, 0, 21, 10, 41, 35, 49, 25, 0, 43, 39, 15, 48, 0, 19, 28, 40, 0, 16, 30, 43, 6, 19, 5, 32, 35, 15, 26, 47, 0, 37, 40, 41, 49, 0, 0, 20, 11, 0, 46, 0, 29, 0, 22, 0, 0, 0, 25, 0, 43, 32, 0, 0, 42, 0, 10, 31, 32, 3, 0, 45, 49, 33, 50, 13, 16, 40, 46, 19, 35, 20, 16, 5, 32, 0, 0, 29, 16, 14, 0, 44, 23, 0, 2, 15, 15, 12, 48, 50, 20, 7, 0, 30, 32, 45, 0, 40, 0, 1, 44, 0, 13, 0, 21, 47, 0, 0, 9, 0, 3, 44, 28, 50, 0, 48, 27, 4, 31, 6, 43, 0, 2, 0, 15, 41, 20, 0, 0, 5, 22, 0, 48, 25, 30, 21, 27, 14, 5, 7, 45, 21, 20, 0, 13, 0, 13, 0, 14, 36, 36, 21, 0, 29, 30, 0, 18, 18, 12, 0, 0, 17, 39, 44, 21, 14, 0, 26, 45, 11, 11, 43, 35, 30, 5, 0, 30, 1, 0, 34, 0, 13, 21, 0, 0, 45, 48, 32, 41, 5, 0, 0, 1, 34, 50, 30, 25, 12, 26, 0, 43, 0, 34, 21, 0, 23, 48, 0, 0, 0, 0, 0, 45, 43, 5, 11, 34, 0, 42, 9, 44, 38, 0, 3, 42, 50, 0, 0, 26, 50, 17, 27, 23, 13, 3, 17, 4, 8, 3, 32, 47, 36, 13, 10, 0, 9, 43, 19, 32, 0, 43, 40, 0, 16, 0, 0, 24, 43, 28, 49, 33, 49, 23, 8, 48, 42, 18, 35, 1, 13, 18, 5, 27, 10, 35, 3, 45, 2, 1, 7, 40, 40, 0, 0, 44, 6, 0, 29, 0, 8, 34, 28, 0, 23, 20, 24, 1, 2, 47, 20, 5, 16, 0, 37, 25, 0, 0, 26, 7, 0, 46, 40, 3, 34, 6, 2, 0, 22, 0, 46, 1, 37, 29, 3, 1, 0, 0, 0, 0, 6, 19, 0, 0, 38, 23, 18, 38, 26, 28, 40, 49, 9, 47, 26, 0, 0, 2, 0, 0, 43, 0, 3, 18, 1, 48 };
        assertEquals(MinJump.minJumpUtil(arr),15);
    }
    @Test
    void minJumpUtil3() {
        int[] arr = {33, 21, 50, 0, 0, 46, 34, 3, 0, 12, 33, 0, 31, 37, 15, 17, 34, 18, 0, 4, 12, 41, 18, 35, 37, 34, 0, 47, 0, 39, 32, 49, 5, 41, 46, 26, 0, 2, 49, 35, 4, 19, 2, 27, 23, 49, 19, 38, 0, 33, 47, 1, 21, 36, 18, 33, 0, 1, 0, 39, 0, 22, 0, 9, 36, 45, 31, 4, 14, 48, 2, 33, 0, 39, 0, 37, 48, 44, 0, 11, 24, 16, 10, 23, 22, 41, 32, 14, 22, 16, 23, 38, 42, 16, 15, 0, 39, 23, 0, 42, 15, 25, 0, 41, 2, 48, 28 };
        assertEquals(MinJump.minJumpUtil(arr),3);
    }
}