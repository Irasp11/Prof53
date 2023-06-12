package org.example.Homework_Algoritms;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CustomTree {

    private Node root;

    private class Node {
        String key;
        Integer value;
        Node left;
        Node right;
    }

    public Integer find(String key) {
        return find(root, key);
    }

    public Integer find(Node node, String key) {
        if (node == null) return null;
        if (key.compareTo(node.key) == 0) return node.value;
        if (key.compareTo(node.key) < 0) return find(node.left, key);
        if (key.compareTo(node.key) > 0) return find(node.right, key);
        return null;
    }

    public void put(String key, Integer value) {
        root = put(root, key, value);
    }

    public Node put(Node node, String key, Integer value) {
        if (node == null) {
            node = new Node();
            node.key = key;
            node.value = value;
            return node;
        }
        if (key.compareTo(node.key) == 0) node.value = value;
        else if (key.compareTo(node.key) < 0) node.left = put(node.left, key, value);
        else if (key.compareTo(node.key) > 0) node.right = put(node.right, key, value);
        return node;
    }

    public void bfs() {
        if (root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            System.out.println(node.value);
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
    }

    public void dfs(Node node) {
        if (node == null) return;
        System.out.println(node.value);
        dfs(node.left);
        dfs(node.right);
    }

    public void dfs() {
        if (root == null) return;
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.println(node.value);
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
    }

    public static void main(String[] args) {
        CustomTree tree = new CustomTree();
        tree.put("apple", 1);
        tree.put("banana", 2);
        tree.put("cherry", 3);
        tree.dfs();
        System.out.println();
        tree.bfs();
    }

}

