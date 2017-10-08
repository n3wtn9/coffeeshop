package nt.coffeeshop.scripts;

import nt.coffeeshop.BinarySearchTree;

public class SortingNumbers {
    public static void main(String[] args) {
        int[] num = new int[]{1,2,3,4};

        BinarySearchTree bst = new BinarySearchTree();
        for(int i : num) {
            bst.insert(i);
        }

        /*
        create a BST object
        start inserting numbers
        numbers are inserted sorted
        re-balance the tree if necessary
         */
    }
}
