package com.bridzelabz.bst;

public class BSTImplementation {

	public static void main(String[] args) {
		int[] keys = { 56, 30, 70,22,40,60,95,11,65,3,16,63,67 };
		Node root = null;
		for (int key :keys) {
			System.out.println(key);
			root = insertNode(root, key);
		}
	
	}

	public static Node insertNode(Node root, int key) {
		if (root == null) {
			return new Node(key);
		}
		if (key < root.data) {
			root.left = insertNode(root.left, key);
		} else {
			root.right = insertNode(root.right, key);
		}
		return root;
	}


}

