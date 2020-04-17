package leetCode.tree;

import java.awt.datatransfer.FlavorEvent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * finding path of given node from root to that node
 */
public class PathInZigzagTree {

    public List<Integer> findPath(int node){

        int level=1;
        int count=0;
        while(level<= node ){
            level *=2;
            count++;
        }

       return findFullPathInZigZag(count , node);
    }

    private List<Integer> findFullPathInZigZag(int level, int node) {
        List<Integer> path=new ArrayList<>(level+1);
        if(level<=0) return Collections.EMPTY_LIST;
        if(level==1) return Arrays.asList(1);
        path.add(node);
        while(level>1){
            int totalNodes = ((1 << level) - 1) + (1 << (level - 1));
            node=(totalNodes - node)/2;;
            path.add(node);
            level--;
        }
        Collections.sort(path);
        return path;
    }
}
