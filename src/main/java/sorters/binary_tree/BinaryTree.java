package sorters.binary_tree;

import java.util.ArrayList;

public class BinaryTree {
    private final Node rootNode;

    public BinaryTree(final int element){
        rootNode = new Node(element);
    }

    public void addElements(int[] elements) {
        for (int e: elements) {
            addNodeToTree(rootNode, e);
        }
    }

    public int[] getSortedTreeAsc() {
        Node node = rootNode;
        ArrayList<Integer> sortedTreeList = treeToArrayList(node);
        int[] arrayToSort = arrayListToIntArray(sortedTreeList);
        return arrayToSort;
    }

    private int[] arrayListToIntArray(ArrayList<Integer> sortedTreeList){
        int[] arrayToSort = new int[sortedTreeList.size()];
        for (int i = 0; i < sortedTreeList.size(); i++) {
            arrayToSort[i] = sortedTreeList.get(i);
        }
        return arrayToSort;
    }


    private ArrayList<Integer> treeToArrayList(Node node){
        ArrayList<Integer> nodeValues = new ArrayList<>();
        if (node.isLeftChildEmpty() == false) nodeValues.addAll(treeToArrayList(node.getLeftChild()));
        nodeValues.add(node.getValue());
        if (node.isRightChildEmpty() == false) nodeValues.addAll(treeToArrayList(node.getRightChild()));
        return nodeValues;
    }


    private void addNodeToTree(Node node, final int element){
        if (element <= node.getValue()){
            if (node.isLeftChildEmpty()) node.setLeftChild(new Node(element));
            else addNodeToTree(node.getLeftChild(), element);
        } else if (element > node.getValue()){
            if (node.isRightChildEmpty()) node.setRightChild(new Node(element));
            else addNodeToTree(node.getRightChild(), element);
        }
    }


}
