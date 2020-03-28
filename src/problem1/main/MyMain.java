/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String args[]) {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(20);
        obj.insert(24);
        obj.insert(15);
        obj.insert(17);
        obj.insert(19);
        obj.insert(22);
        obj.insert(39);
        obj.insert(60);
        System.out.print("Left Child nodes are: ");
        obj.printLeftNode(obj.root);
        System.out.println();
        System.out.println("No of nodes that dosn't have a left child node are: "+ obj.getCount());
    }
}